package com.example.demo.Vo;

import org.springframework.stereotype.Component;

@Component
public class Order {

    private String product;//产品
    private String price;//价格
    private String insertTime;//插入时间

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(String insertTime) {
        this.insertTime = insertTime;
    }
}
