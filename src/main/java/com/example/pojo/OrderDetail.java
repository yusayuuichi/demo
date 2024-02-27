package com.example.pojo;

import java.util.List;

public class OrderDetail {
    private String userName;
    private String orderTime;
    private List<Item> items;

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getOrderTime() {
        return this.orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public List<Item> getItems() {
        return this.items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
 
}
