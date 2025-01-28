package com.jose30a2.pedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jose30a2.pedido.entities.Order;
import com.jose30a2.pedido.services.OrderService;

@SpringBootApplication
public class PedidoApplication implements CommandLineRunner {
	
	
	@Autowired
	private OrderService orderService;
	

	public static void main(String[] args) {
		SpringApplication.run(PedidoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Order order[] = {new Order(1034, 150, 20), new Order(2282, 800, 10), new Order(1309, 95.9, 0)};
		
		for (int i=0; i < order.length; i++ ) {
			System.out.println("Pedido codigo " + order[i].getCode() +"\nValor total: " + orderService.total(order[i]));
			System.out.println();
		}
	}

}
