package com.deluxe.customer;

import com.deluxe.beans.OrderDto;
import com.deluxe.operationImpl.OrderOperationImpl;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(OrderDto.getAl());

		OrderDto orderDto2 = new OrderDto();
		orderDto2.setOrderNum(501);
		orderDto2.setOrderPersonName("Abdullah");
		orderDto2.setTableName(0);
		orderDto2.setItemName("Butter Chicken");
		orderDto2.setPrice(100);
		orderDto2.setQuantity("full");
		///
		OrderDto orderDto3 = new OrderDto();
		orderDto3.setOrderNum(502);
		orderDto3.setOrderPersonName("Amir");
		orderDto3.setTableName(0);
		orderDto3.setItemName("Chicken");
		orderDto3.setPrice(100);
		orderDto3.setQuantity("full");
		
		OrderOperationImpl orderImpl=new OrderOperationImpl();
		//Add Order 
		orderImpl.addOrder(orderDto2);
		orderImpl.addOrder(orderDto3);
		//OrderDto.getAl().forEach((dto)->{if(dto.getOrderNum()!=0) {System.out.println(dto);}});
		/*for (int i = 0; i < OrderDto.getAl().size(); i++) {
			OrderDto orderDto = OrderDto.getAl().get(i);
			if(orderDto.getOrderNum()!=0) {
				System.out.println(orderDto);
			}
		}*/
		//getOrderDetails by Moazzam 
		
		OrderDto orderdetail= orderImpl.getOrderDetails(503);
		if(orderdetail==null)
		{
			//System.out.println("order not found");
			
		}
		else {
			//System.out.println(orderdetail);
		}
		//System.out.println(orderdetail);
		
		OrderDto getpriceNameDetails= orderImpl.getOrderItemsNameWithPrice();
		System.out.println(getpriceNameDetails);
	}

}
