package com.deluxe.operation;

import java.util.List;

import com.deluxe.beans.OrderDto; 

public interface OrderOperation {
	List<OrderDto> addOrder(OrderDto orderDto);
	
     void orderCancel();
     
  OrderDto getOrderItemsNameWithPrice();

	OrderDto getOrderDetails(int orderNum);

	void orderQuantity();

	void getorderPersonName();

	void getOrderTableNumber();


}
