package com.whoknows.SpBt_challenge;

import com.whoknows.entities.Order;
import com.whoknows.services.OrderService;
import com.whoknows.services.ShippingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
@ComponentScan
public class SpBtChallengeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpBtChallengeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Order#: ");
		int orderNumber = sc.nextInt();
		System.out.print("Basic value: R$ ");
		double basicValue = sc.nextDouble();
		System.out.print("Discount %: ");
		double discount = sc.nextDouble() / 100;

		Order order = new Order(orderNumber, basicValue, discount);

		ShippingService shippingService = new ShippingService();
		OrderService orderService = new OrderService(shippingService);

		System.out.println();
		System.out.printf("Pedido Código %d%n", orderNumber);
		System.out.printf("Valor Total: %.2f%n", orderService.total(order));

	}
}
