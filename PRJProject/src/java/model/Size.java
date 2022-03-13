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
public class Size {
    private int sizeID;
    private String size;

    public Size() {
    }

    public Size(int sizeID, String size) {
        this.sizeID = sizeID;
        this.size = size;
    }

    public int getSizeID() {
        return sizeID;
    }

    public String getSize() {
        return size;
    }

    public void setSizeID(int sizeID) {
        this.sizeID = sizeID;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
}
