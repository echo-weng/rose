package com.rose.mps.update.domain;

/**
 * 单个房量更新
 *
 * @author echo
 */
public class SingleInventoryUpdate extends CategoryUpdate {
	private Integer count;

	@Override
	public SingleInventoryUpdate clone() {
		return (SingleInventoryUpdate) super.clone();
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
}
