/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author ADMIN
 */
public class Customer {
    private int cusID;
    private String cusName, cusAddress, cusPhone;
    Date dob;

    public Customer() {
    }

    public Customer(int cusID, String cusName, String cusAddress, String cusPhone, Date dob) {
        this.cusID = cusID;
        this.cusName = cusName;
        this.cusAddress = cusAddress;
        this.cusPhone = cusPhone;
        this.dob = dob;
    }

    public int getCusID() {
        return cusID;
    }

    public String getCusName() {
        return cusName;
    }

    public String getCusAddress() {
        return cusAddress;
    }

    public String getCusPhone() {
        return cusPhone;
    }

    public Date getDob() {
        return dob;
    }

    public void setCusID(int cusID) {
        this.cusID = cusID;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public void setCusAddress(String cusAddress) {
        this.cusAddress = cusAddress;
    }

    public void setCusPhone(String cusPhone) {
        this.cusPhone = cusPhone;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
    
    
}
