/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 *
 * @author ADMIN
 */
public class test {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###");
        System.out.println(new BigDecimal("500.000"));
    }
}
