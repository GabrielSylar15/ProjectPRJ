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
public class Account {
    private int cusID;
    private String userName;
    private String password;
    private boolean isAdmin;
    private String displayNamme;

    public Account() {
    }

    public Account(int cusID, String userName, String password, boolean isAdmin, String displayNamme) {
        this.cusID = cusID;
        this.userName = userName;
        this.password = password;
        this.isAdmin = isAdmin;
        this.displayNamme = displayNamme;
    }

    public int getCusID() {
        return cusID;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public String getDisplayNamme() {
        return displayNamme;
    }

    public void setCusID(int cusID) {
        this.cusID = cusID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public void setDisplayNamme(String displayNamme) {
        this.displayNamme = displayNamme;
    }
    
}
