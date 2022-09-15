package com.deluxe.operationImpl;

import java.util.List;

import com.deluxe.beans.OrderDto;
import com.deluxe.operation.OrderOperation;

public class OrderOperationImpl implements OrderOperation {
	
	
	@Override
	public List<OrderDto> addOrder(OrderDto orderDto) {
		List<OrderDto> al = OrderDto.getAl();
		al.add(orderDto);
		// TODO Auto-generated method stub
		return al;
	}

	@Override
	public OrderDto getOrderDetails(int orderNum) {
		// TODO Auto-generated method stub
		List<OrderDto> al = OrderDto.getAl();
		for (OrderDto orderDto : al) {
			/*if(orderDto.equals(orderNum)) {
				return
			}*/
			if(orderDto.getOrderNum()!=0 && orderNum==orderDto.getOrderNum()) {
				return orderDto;
			}
		}
		return null;
	} 
	
	
	public OrderDto getOrderItemsNameWithPrice() { 
		
		
		List<OrderDto> al = OrderDto.getAl();
		for (OrderDto orderDto : al) {
			if(orderDto.getItemName()!=null && orderDto.getPrice()!=0) {
				
				
				return orderDto;
			}
		}
		return null;
	}

	

	@Override
	public void orderQuantity() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getorderPersonName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getOrderTableNumber() {
		// TODO Auto-generated method stub
		
	}

	

	
	@Override
	public void orderCancel() {
		// TODO Auto-generated method stub
		
	}

}
