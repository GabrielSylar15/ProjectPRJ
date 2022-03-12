/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ADMIN
 */
public class SkuValue {
    private int skuID, productID, optionID, valueID, quantity;

    public SkuValue(int skuID, int productID, int optionID, int valueID, int quantity) {
        this.skuID = skuID;
        this.productID = productID;
        this.optionID = optionID;
        this.valueID = valueID;
        this.quantity = quantity;
    }

    public SkuValue() {
    }

    public int getSkuID() {
        return skuID;
    }

    public int getProductID() {
        return productID;
    }

    public int getOptionID() {
        return optionID;
    }

    public int getValueID() {
        return valueID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setSkuID(int skuID) {
        this.skuID = skuID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public void setOptionID(int optionID) {
        this.optionID = optionID;
    }

    public void setValueID(int valueID) {
        this.valueID = valueID;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
