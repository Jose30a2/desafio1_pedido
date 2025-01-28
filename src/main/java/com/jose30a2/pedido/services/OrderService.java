package com.jose30a2.pedido.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jose30a2.pedido.entities.Order;

@Service
public class OrderService {
	
	
	@Autowired
	private ShippingService shippingService;
	
	public double total(Order order) {
		
		return order.getBasic()*(1-order.getDiscount()/100) + shippingService.shipment(order);
	
	}

}
