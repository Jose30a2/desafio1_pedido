package com.jose30a2.pedido.services;

import org.springframework.stereotype.Service;

import com.jose30a2.pedido.entities.Order;

@Service
public class ShippingService {
	
	public double shipment(Order order) {
		
		
		
		if (order.getBasic()<=0)
		{
			return 0;	// se o valor da compra nao pode ser menor que cero
		}
		if (order.getBasic() <100) {
			return 20;
		}else if(order.getBasic()<200) {
			return 12;
		}else {
			return 0;
		}
		
	}

}
