package com.rose.service.impl;

import com.rose.domain.InventoryUpdateWrap;
import com.rose.domain.RateUpdateWrap;
import com.rose.queue.RoseQueue;
import com.rose.service.SupplierUpdateService;

/**
 * 酒店集团这边调用的服务实现类
 *
 * @author echo
 */
public class SupplierUpdateServiceImpl implements SupplierUpdateService {

	/**
	 * 房量更新queue
	 */
	private RoseQueue<InventoryUpdateWrap> inventoryBlockingQueue;

	/**
	 * 价格更新queue
	 */
	private RoseQueue<RateUpdateWrap> rateBlockingQueue;

	public SupplierUpdateServiceImpl(RoseQueue<InventoryUpdateWrap> inventoryBlockingQueue,
			RoseQueue<RateUpdateWrap> rateBlockingQueue) {
		this.inventoryBlockingQueue = inventoryBlockingQueue;
		this.rateBlockingQueue = rateBlockingQueue;
	}

	public void updateInventory(InventoryUpdateWrap inventoryUpdateWrap) {
		inventoryBlockingQueue.enQueue(inventoryUpdateWrap);
	}

	public void updateRate(RateUpdateWrap rateUpdateWrap) {
		rateBlockingQueue.enQueue(rateUpdateWrap);
	}

}
