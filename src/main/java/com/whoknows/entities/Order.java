package com.whoknows.entities;

import org.springframework.stereotype.Service;

@Service
public class Order {

    private int orderNumber;
    private double basicValue;
    private double discount;

    public Order(int orderNumber, double basicValue, double discount) {
        this.orderNumber = orderNumber;
        this.basicValue = basicValue;
        this.discount = discount;
    }

    public int getOrder() {
        return orderNumber;
    }

    public double getBasicValue() {
        return basicValue;
    }

    public void setBasicValue(double basic) {
        this.basicValue = basicValue;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
