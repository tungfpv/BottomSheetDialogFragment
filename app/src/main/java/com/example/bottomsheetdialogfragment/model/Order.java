package com.example.bottomsheetdialogfragment.model;

import java.io.Serializable;
import java.util.List;

public class Order implements Serializable {
    private String price;
    private List<Product> productList;
    private String deliveryAddress;

    public Order(String price, List<Product> productList, String deliveryAddress) {
        this.price = price;
        this.productList = productList;
        this.deliveryAddress = deliveryAddress;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getListProductName() {
        if (productList == null || productList.isEmpty()) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Product product : productList) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append("\n");
            }
            stringBuilder.append(product.getName());
        }
        return stringBuilder.toString();
    }
}
