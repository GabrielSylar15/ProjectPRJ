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
public class OptionValue {
    private int valueID;
    private int productID;
    private int optionID;
    private String valueName;

    public OptionValue() {
    }



    public OptionValue(int valueID, int productID, int optionID, String valueName) {
        this.valueID = valueID;
        this.productID = productID;
        this.optionID = optionID;
        this.valueName = valueName;
    }

    public int getValueID() {
        return valueID;
    }

    public int getProductID() {
        return productID;
    }

    public int getOptionID() {
        return optionID;
    }


    public String getValueName() {
        return valueName;
    }

    public void setValueID(int valueID) {
        this.valueID = valueID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public void setOptionID(int optionID) {
        this.optionID = optionID;
    }

    public void setValueName(String valueName) {
        this.valueName = valueName;
    }
    
}
