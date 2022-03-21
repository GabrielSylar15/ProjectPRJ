/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class ProductCart {
    private int productID, colorID, sizeID, quantity;
    private String productName;
    private String price, retailPrice;
    private String image;
    private String color,size;
    private BigDecimal priceBigDecimal;
    
    
    public BigDecimal getPriceBigDecimal() {
        return priceBigDecimal;
    }

    public void setPriceBigDecimal(BigDecimal priceBigDecimal) {
        this.priceBigDecimal = priceBigDecimal;
    }
    

    public String getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(String retailPrice) {
        this.retailPrice = retailPrice;
    }
    
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    public ProductCart() {
    }

    public ProductCart(int productID, int colorID, int sizeID, int quantity, String productName) {
        this.productID = productID;
        this.colorID = colorID;
        this.sizeID = sizeID;
        this.quantity = quantity;
        this.productName = productName;

    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getColorID() {
        return colorID;
    }

    public void setColorID(int colorID) {
        this.colorID = colorID;
    }

    public int getSizeID() {
        return sizeID;
    }

    public void setSizeID(int sizeID) {
        this.sizeID = sizeID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


    
}
