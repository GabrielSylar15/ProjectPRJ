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
public class Option {
    private int optionID;
    private String optionName;

    public Option() {
    }

    public Option(int optionID, String optionName) {
        this.optionID = optionID;
        this.optionName = optionName;
    }

    public int getOptionID() {
        return optionID;
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionID(int optionID) {
        this.optionID = optionID;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }
    
    
    
}
