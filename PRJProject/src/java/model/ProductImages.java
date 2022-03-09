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
public class ProductImages {
    private int imageID;
    private String image;

    public ProductImages() {
    }

    public ProductImages(int imageID, String image) {
        this.imageID = imageID;
        this.image = image;
    }

    public int getImageID() {
        return imageID;
    }

    public String getImage() {
        return image;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    
}
