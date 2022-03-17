/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Cart {
    private ArrayList<ProductCart> listProducts = new ArrayList<>();
    private Account account;
    private ArrayList<String> listPrices;
    private String totalMoney;

    public ArrayList<String> getListPrices() {
        return listPrices;
    }

    public void setListPrices(ArrayList<String> listPrices) {
        this.listPrices = listPrices;
    }

    public String getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(String totalMoney) {
        this.totalMoney = totalMoney;
    }
    
    public Cart() {
    }

    public ArrayList<ProductCart> getListProducts() {
        return listProducts;
    }

    public void setListProducts(ArrayList<ProductCart> listProducts) {
        this.listProducts = listProducts;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    
}
