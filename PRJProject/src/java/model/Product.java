/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Image;
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
    private boolean isOption;
    private ArrayList<Image> listImages = new ArrayList<>();
    private ArrayList<OptionValue> listOptionValues = new ArrayList<>();

    public void setListImages(ArrayList<Image> listImages) {
        this.listImages = listImages;
    }

    public ArrayList<Image> getListImages() {
        return listImages;
    }

    
    public ArrayList<OptionValue> getListOptionValues() {
        return listOptionValues;
    }

    public boolean isIsOption() {
        return isOption;
    }

    public void setIsOption(boolean isOption) {
        this.isOption = isOption;
    }

    
    public void setListOptionValues(ArrayList<OptionValue> listOptionValues) {
        this.listOptionValues = listOptionValues;
    }

    public Product(int productID, String productName, BigDecimal price, BigDecimal retailPrice, int quantity, int quantityPerUnit, Category category, String description, boolean isOption) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.retailPrice = retailPrice;
        this.quantity = quantity;
        this.quantityPerUnit = quantityPerUnit;
        this.category = category;
        this.description = description;
        this.isOption = isOption;
    }
    
    public Product() {
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
