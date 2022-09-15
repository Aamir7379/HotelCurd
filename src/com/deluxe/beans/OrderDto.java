package com.deluxe.beans;

import java.util.ArrayList;
import java.util.List;

public class OrderDto {

	private int orderNum;
	private	String orderPersonName;
	private	int tableName;
	private	String itemName;
	private	double price;
	private	String quantity;
	
	
	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	public String getOrderPersonName() {
		return orderPersonName;
	}
	public void setOrderPersonName(String orderPersonName) {
		this.orderPersonName = orderPersonName;
	}
	public int getTableName() {
		return tableName;
	}
	public void setTableName(int tableName) {
		this.tableName = tableName;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public OrderDto(int orderNum, String orderPersonName, int tableName, String itemName, double price,
			String quantity) {
		super();
		this.orderNum = orderNum;
		this.orderPersonName = orderPersonName;
		this.tableName = tableName;
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public OrderDto(){
		
		
	}
public static	List<OrderDto> al;
public static List<OrderDto> getAl() {
	return al;
}


	static {
		al=new ArrayList<OrderDto>();
		OrderDto orderDto=new OrderDto();
		orderDto.setOrderNum(0);
		orderDto.setOrderPersonName(null);
		orderDto.setTableName(0);
		orderDto.setItemName("Pakoda");
		orderDto.setPrice(140);
		orderDto.setQuantity("Half");	
		//2 Obj
		
		OrderDto orderDto1=new OrderDto();
		orderDto1.setOrderNum(0);
		orderDto1.setOrderPersonName(null);
		orderDto1.setTableName(0);
		orderDto1.setItemName("Biryani");
		orderDto1.setPrice(340);
		orderDto1.setQuantity("half");
		//3
		OrderDto orderDto2=new OrderDto();
		orderDto2.setOrderNum(0);
		orderDto2.setOrderPersonName(null);
		orderDto2.setTableName(0);
		orderDto2.setItemName("Butter Chicken");
		orderDto2.setPrice(100);
		orderDto2.setQuantity("full");
		al.add(orderDto);
		al.add(orderDto1);
		al.add(orderDto2);
	}


	@Override
	public String toString() {
		return "OrderDto [orderNum=" + orderNum + ", orderPersonName=" + orderPersonName + ", tableName=" + tableName
				+ ", itemName=" + itemName + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
	
}
