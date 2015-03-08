package com.rose.service.impl;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import com.rose.domain.Contract;
import com.rose.domain.InventoryUpdateWrap;
import com.rose.domain.RateUpdateWrap;
import com.rose.queue.RoseQueue;
import com.rose.service.SupplierUpdateService;

/**
 * 酒店集团这边调用的服务实现类
 *
 * @author echo
 */
public class SupplierUpdateServiceImpl implements SupplierUpdateService, InitializingBean {
	
	private ExecutorService executorService;
	
	@Autowired
	private UpdateServiceAdapter updateServiceAdapter;

	/**
	 * 房量更新queue
	 */
	private RoseQueue<InventoryUpdateWrap> inventoryBlockingQueue;

	/**
	 * 价格更新queue
	 */
	private RoseQueue<RateUpdateWrap> rateBlockingQueue;

	private int updateThreadNum = 20;

	public SupplierUpdateServiceImpl(RoseQueue<InventoryUpdateWrap> inventoryBlockingQueue,
			RoseQueue<RateUpdateWrap> rateBlockingQueue) {
		this.inventoryBlockingQueue = inventoryBlockingQueue;
		this.rateBlockingQueue = rateBlockingQueue;
	}

	class UpdateRateRunnable implements Runnable{

		@Override
		public void run() {
			while(true){
				final RateUpdateWrap rateUpdateWrap = rateBlockingQueue.deQueue();
				for (final Contract contract : rateUpdateWrap.getContracts()) {
					executorService.execute(new Runnable() {
						
						@Override
						public void run() {
							updateServiceAdapter.updateRate(rateUpdateWrap.getRateUpdate(), contract);
						}
					});
				}
			}
		}
		
	}
	
	class UpdateInventoryRunnable implements Runnable{

		@Override
		public void run() {
			while(true){
				final InventoryUpdateWrap inventoryUpdateWrap = inventoryBlockingQueue.deQueue();
				for (final Contract contract : inventoryUpdateWrap.getContracts()) {
					executorService.execute(new Runnable() {
						
						@Override
						public void run() {
							updateServiceAdapter.updateInventory(inventoryUpdateWrap.getInventoryUpdate(), contract);
						}
					});
				}
			}
		}
		
	}
	
	
	@Override
	public void afterPropertiesSet() throws Exception {
		//执行更新
		executorService = Executors.newScheduledThreadPool(updateThreadNum);
		executorService.execute(new UpdateRateRunnable());
		executorService.execute(new UpdateInventoryRunnable());
	}
	
	public void setUpdateThreadNum(int updateThreadNum) {
		this.updateThreadNum = updateThreadNum;
	}

	public void setUpdateServiceAdapter(UpdateServiceAdapter updateServiceAdapter) {
		this.updateServiceAdapter = updateServiceAdapter;
	}
	
	public void updateInventory(InventoryUpdateWrap inventoryUpdateWrap) {
		inventoryBlockingQueue.enQueue(inventoryUpdateWrap);
	}

	public void updateRate(RateUpdateWrap rateUpdateWrap) {
		rateBlockingQueue.enQueue(rateUpdateWrap);
	}

}
