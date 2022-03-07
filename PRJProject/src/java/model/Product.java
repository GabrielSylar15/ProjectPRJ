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
public class Product {
    private int productID;
    private String productName;
    private BigDecimal price, retailPrice;
    private int quantity;
    private int quantityPerUnit;
    private Category category;
    private String description;

    private ArrayList<String> listColors = new ArrayList<>();
    private ArrayList<String> listImages = new ArrayList<>();
    private ArrayList<Integer> listSizes = new ArrayList<>();

    public void setListColors(ArrayList<String> listColors) {
        this.listColors = listColors;
    }

    public void setListImages(ArrayList<String> listImages) {
        this.listImages = listImages;
    }

    public void setListSizes(ArrayList<Integer> listSizes) {
        this.listSizes = listSizes;
    }

    public ArrayList<String> getListColors() {
        return listColors;
    }

    public ArrayList<String> getListImages() {
        return listImages;
    }

    public ArrayList<Integer> getListSizes() {
        return listSizes;
    }

    public Product() {
    }

    public Product(int productID, String productName, BigDecimal price, BigDecimal retailPrice, int quantity, int quantityPerUnit, Category category, String description) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.retailPrice = retailPrice;
        this.quantity = quantity;
        this.quantityPerUnit = quantityPerUnit;
        this.category = category;
        this.description = description;
    }

    
    public int getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal getRetailPrice() {
        return retailPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getQuantityPerUnit() {
        return quantityPerUnit;
    }

    public Category getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setRetailPrice(BigDecimal retailPrice) {
        this.retailPrice = retailPrice;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setQuantityPerUnit(int quantityPerUnit) {
        this.quantityPerUnit = quantityPerUnit;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
