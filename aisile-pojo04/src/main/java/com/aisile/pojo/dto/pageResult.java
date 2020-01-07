package com.aisile.pojo.dto;

import java.io.Serializable;
import java.util.List;

public class pageResult implements Serializable{
	private long total;//总记录数
	private List rows;//当前页结果		
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List getRows() {
		return rows;
	}
	public void setRows(List rows) {
		this.rows = rows;
	}
	public pageResult() {
		super();
		// TODO Auto-generated constructor stub
	}
	public pageResult(long total, List rows) {
		super();
		this.total = total;
		this.rows = rows;
	}
	@Override
	public String toString() {
		return "pageResult [total=" + total + ", rows=" + rows + "]";
	}
	

}
