package com.whoknows.services;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(double amount) {
        if (amount < 100.00) {
            return 20.000;
        } else if (amount < 200.00) {
            return 12.00;
        }else
            return 0.0;
    }
}
