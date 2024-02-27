package com.example.pojo;

public class Item {
    private String id;
    private String name;
    private int price;
    private String totalNum;
    private int numVer;

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

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTotalNum() {
        return this.totalNum;
    }

    public void setTotalNum(String totalNum) {
        this.totalNum = totalNum;
    }

    public int getNumVer() {
        return this.numVer;
    }

    public void setNumVer(int numVer) {
        this.numVer = numVer;
    }

}
