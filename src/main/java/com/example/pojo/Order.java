package com.example.pojo;

public class Order {
    private String id;
    private String userId;
    private String status; //0 已成立訂單 //1 訂單處理中 //2 運送中 //3 已送達未簽收 //4 訂單已完成 //5 已申請退貨 //6 退回中 //7 已完成退貨
    private OrderDetail detail;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public OrderDetail getDetail() {
        return this.detail;
    }

    public void setDetail(OrderDetail detail) {
        this.detail = detail;
    }

}
