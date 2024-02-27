package com.example.pojo;

public class User {
    private String id;
    private String name;
    private String tel;
    private String memberCode;
    private int orderCountSum;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMemberCode() {
        return this.memberCode;
    }

    public void setMemberCode(String memberCode) {
        this.memberCode = memberCode;
    }

    public int getOrderCountSum() {
        return this.orderCountSum;
    }

    public void setOrderCountSum(int orderCountSum) {
        this.orderCountSum = orderCountSum;
    }
    
}
