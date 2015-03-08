package com.rose.mps.update;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.output.ByteArrayOutputStream;
import org.junit.Test;

import com.rose.mps.update.domain.DateSpan;
import com.rose.mps.update.domain.InventoryUpdateRequest;
import com.rose.mps.update.domain.InventoryUpdateResponse;
import com.rose.mps.update.domain.OccupancyRate;
import com.rose.mps.update.domain.Rate;
import com.rose.mps.update.domain.RateUpdateRequest;
import com.rose.mps.update.domain.ServiceError;
import com.rose.mps.update.domain.SingleInventoryUpdate;
import com.rose.mps.update.domain.SingleRateUpdate;
import com.rose.mps.update.serializer.MpsStreamSerializer;

public class UpdateMappingTest {
	
	@Test
	public void testMarshUpdateRate(){
		MpsStreamSerializer mpsCastorSerializer = new MpsStreamSerializer();
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		
		RateUpdateRequest rateUpdate = new RateUpdateRequest();
		rateUpdate.setHotelCode("NYCHA");
		rateUpdate.setOwerId(1);
		rateUpdate.setToken("2498578445465412");
		List<SingleRateUpdate> singleRateUpdates = new ArrayList<SingleRateUpdate>();
		SingleRateUpdate singleRateUpdate = new SingleRateUpdate();
		DateSpan dateSpan = new DateSpan();
		dateSpan.setEndTime(new Date());
		dateSpan.setStartTime(new Date());
		singleRateUpdate.setDateSpan(dateSpan);
		singleRateUpdate.setRoomTypeCode("Deluxe");
		OccupancyRate occupancyRate = new OccupancyRate();
		occupancyRate.setCurrencyCode("CNY");
		List<Rate> rates = new ArrayList<Rate>();
		Rate rate = new Rate();
		rate.setAmountAfterTax(new BigDecimal("100"));
		rate.setAmountBeforeTax(new BigDecimal("100"));
		rate.setGuestCount(2);
		rates.add(rate);
		occupancyRate.setRates(rates);
		singleRateUpdate.setOccupancyRate(occupancyRate);
		singleRateUpdates.add(singleRateUpdate);
		rateUpdate.setSingleRateUpdates(singleRateUpdates);
		
		mpsCastorSerializer.marshal(rateUpdate, outputStream, "UTF-8");
		System.out.println(formateXml(new String(outputStream.toByteArray())));
	}
	
	@Test
	public void testUnMarshUpdateRate(){
		MpsStreamSerializer mpsCastorSerializer = new MpsStreamSerializer();
		System.out.println(mpsCastorSerializer.unmarshal(this.getClass().getResourceAsStream("update-rate.xml"), "UTF-8"));
	}
	
	@Test
	public void testMarshUpdateInventory(){
		MpsStreamSerializer mpsCastorSerializer = new MpsStreamSerializer();
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		
		InventoryUpdateRequest inventoryUpdate = new InventoryUpdateRequest();
		inventoryUpdate.setHotelCode("9988789");
		inventoryUpdate.setOwerId(1);
		inventoryUpdate.setToken("2498578445465412");
		List<SingleInventoryUpdate> singleInventoryUpdates = new ArrayList<SingleInventoryUpdate>();
		SingleInventoryUpdate singleInventoryUpdate = new SingleInventoryUpdate();
		singleInventoryUpdate.setCount(2);
		DateSpan dateSpan = new DateSpan();
		dateSpan.setEndTime(new Date());
		dateSpan.setStartTime(new Date());
		singleInventoryUpdate.setDateSpan(dateSpan);
		singleInventoryUpdate.setRoomTypeCode("Standard");
		singleInventoryUpdates.add(singleInventoryUpdate);
		inventoryUpdate.setSingleInventoryUpdates(singleInventoryUpdates);
		
		mpsCastorSerializer.marshal(inventoryUpdate, outputStream, "UTF-8");
		System.out.println(formateXml(new String(outputStream.toByteArray())));
	}
	
	@Test
	public void testUnMarshUpdateInventory(){
		MpsStreamSerializer mpsCastorSerializer = new MpsStreamSerializer();
		System.out.println(mpsCastorSerializer.unmarshal(this.getClass().getResourceAsStream("update-inventory.xml"), "UTF-8"));
	}
	
	@Test
	public void testMarshUpdateInventoryResponse(){
		MpsStreamSerializer mpsCastorSerializer = new MpsStreamSerializer();
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		
		InventoryUpdateResponse inventoryUpdateResponse = new InventoryUpdateResponse();
		inventoryUpdateResponse.setToken("token");
		List<ServiceError> serviceErrors = new ArrayList<ServiceError>();
		ServiceError serviceError = new ServiceError();
		serviceError.setCode("code");
		serviceError.setValue("value");
		serviceErrors.add(serviceError);
		inventoryUpdateResponse.setServiceErrors(serviceErrors);
		
		mpsCastorSerializer.marshal(inventoryUpdateResponse, outputStream, "UTF-8");
		System.out.println(formateXml(new String(outputStream.toByteArray())));
	}
	
	private String formateXml(String xml) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		char[] chars = xml.toCharArray();
		StringBuffer sb = new StringBuffer();
		StringBuffer preNode = new StringBuffer();
		StringBuffer node = new StringBuffer();
		StringBuffer temp = new StringBuffer();

		boolean nodeStartAppend = true;
		for (char c : chars) {
			if ('<' == c) {
				if (temp.length() > 0 && temp.toString().startsWith("<") == false) {
					temp.append(c);
					sb.append(temp.toString());
					continue;
				}

				nodeStartAppend = true;

				appendTemp(map, node, preNode, sb, temp);

				empty(temp);
				temp.append(c);
				empty(preNode);
				preNode.append(node);
				empty(node);
				continue;
			}
			if ('>' == c) {
				nodeStartAppend = false;
				temp.append(c);
				continue;
			}
			if (' ' == c) {
				nodeStartAppend = false;
			}
			if (nodeStartAppend && '/' != c) {
				node.append(c);
			}
			temp.append(c);
		}
		appendTemp(map, node, preNode, sb, temp);
		
		return sb.toString();
	}

	private void empty(StringBuffer sb){
		sb.delete(0, sb.length());
	}
	
	private void appendTemp(Map<String, Integer> map, StringBuffer node, StringBuffer preNode, StringBuffer sb,
			StringBuffer temp) {
		Integer max = getMax(map);
		if (exits(node.toString(), map)) {
			map.remove(node.toString());
			max = max - 1;
		} else {
			if (node.length() > 0 && node.toString().startsWith("?xml") == false) {
				map.put(node.toString(), max + 1);
			}
		}
		if (preNode.toString().equals(node.toString()) == false && temp.toString().startsWith("<?") == false) {
			if (sb.toString().endsWith("\n") == false) {
				sb.append("\n");
			}
			for (int i = 0; i < max; i++) {
				sb.append("\t");
			}
		}
		sb.append(temp.toString());
	}

	private Integer getMax(Map<String, Integer> map) {
		if (map.isEmpty())
			return 0;
		Integer max = 0;
		for (Integer num : map.values()) {
			if (max < num) {
				max = num;
			}
		}
		return max;
	}

	private boolean exits(String node, Map<String, Integer> map) {
		return map.get(node) != null;
	}
}
