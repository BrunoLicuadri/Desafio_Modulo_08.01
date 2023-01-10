package com.whoknows.services;

import com.whoknows.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    Order order;
    ShippingService shippingService;

    public OrderService (ShippingService shippingService){
        this.shippingService = shippingService;
    }

    public double total(Order order){
        return order.getBasicValue() * (1 - order.getDiscount()) + shippingService.shipment(order.getBasicValue());
    }
}
