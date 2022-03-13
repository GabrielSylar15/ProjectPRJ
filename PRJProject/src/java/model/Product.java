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
    private int quantityPerUnit;
    private Category category;
    private String description;
    private ArrayList<ProductImages> listImages = new ArrayList<>();
    private ArrayList<Size> listSizes = new ArrayList<>();
    private ArrayList<Color> listColors = new ArrayList<>();
    ArrayList<Integer> quantity = new ArrayList<>();
    ArrayList<Color_Size> listColor_Sizes = new ArrayList<>();

    public ArrayList<Color_Size> getListColor_Sizes() {
        return listColor_Sizes;
    }

    public void setListColor_Sizes(ArrayList<Color_Size> listColor_Sizes) {
        this.listColor_Sizes = listColor_Sizes;
    }
    
    public ArrayList<Size> getListSizes() {
        return listSizes;
    }

    public ArrayList<Integer> getQuantity() {
        return quantity;
    }

    public void setQuantity(ArrayList<Integer> quantity) {
        this.quantity = quantity;
    }

    public ArrayList<Color> getListColors() {
        return listColors;
    }

    public void setListSizes(ArrayList<Size> listSizes) {
        this.listSizes = listSizes;
    }

    public void setListColors(ArrayList<Color> listColors) {
        this.listColors = listColors;
    }    
    
    public ArrayList<ProductImages> getListImages() {
        return listImages;
    }

    public void setListImages(ArrayList<ProductImages> listImages) {
        this.listImages = listImages;
    }

    public Product(int productID, String productName, BigDecimal price, BigDecimal retailPrice, int quantity, int quantityPerUnit, Category category, String description, boolean isOption) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.retailPrice = retailPrice;
        this.quantityPerUnit = quantityPerUnit;
        this.category = category;
        this.description = description;
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
