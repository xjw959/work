package com.aisile.pojo;

import java.io.Serializable;
import java.util.List;

import com.aisile.pojo.TbOrder;
import com.aisile.pojo.TbOrderItem;
import com.aisile.pojo.TbSpecification;
import com.aisile.pojo.TbSpecificationOption;

public class Order implements Serializable {	
	private TbOrder order;
	private List<TbOrderItem> orderItem;
	public TbOrder getOrder() {
		return order;
	}
	public void setOrder(TbOrder order) {
		this.order = order;
	}
	public List<TbOrderItem> getOrderItem() {
		return orderItem;
	}
	public void setOrderItem(List<TbOrderItem> orderItem) {
		this.orderItem = orderItem;
	}
	@Override
	public String toString() {
		return "Order [order=" + order + ", orderItem=" + orderItem + "]";
	}
	public Order(TbOrder order, List<TbOrderItem> orderItem) {
		super();
		this.order = order;
		this.orderItem = orderItem;
	}
	public Order() {
		super();
	}
}