package com.rose.mps.update.domain;

/**
 * 单个价格更新
 *
 * @author echo
 */
public class SingleRateUpdate extends CategoryUpdate{
	
	private OccupancyRate occupancyRate;
	
	@Override
	public SingleRateUpdate clone() {
		SingleRateUpdate clone = (SingleRateUpdate) super.clone();
		clone.setOccupancyRate(Cloneables.clone(occupancyRate));
		return clone;
	}

	public OccupancyRate getOccupancyRate() {
		return occupancyRate;
	}

	public void setOccupancyRate(OccupancyRate occupancyRate) {
		this.occupancyRate = occupancyRate;
	}
	
}
