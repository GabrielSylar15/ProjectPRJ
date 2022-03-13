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
public class Color_Size {
    private int colorID, sizeID, quantity;

    public Color_Size() {
    }

    public Color_Size(int colorID, int sizeID, int quantity) {
        this.colorID = colorID;
        this.sizeID = sizeID;
        this.quantity = quantity;
    }

    public int getColorID() {
        return colorID;
    }

    public int getSizeID() {
        return sizeID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setColorID(int colorID) {
        this.colorID = colorID;
    }

    public void setSizeID(int sizeID) {
        this.sizeID = sizeID;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
