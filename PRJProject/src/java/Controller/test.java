/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author ADMIN
 */
public class test {
    public static void main(String[] args) {
        String a="pid:1,sid:1,cid:1,quantity:8/pid:1,sid:5,cid:1,quantity:9";
        String[] product = a.split("/");
        for (String s : product) {
            String temp[]=s.split(",");
            try {
               int pid = Integer.parseInt(temp[0].split((":"))[1]);
               int sid = Integer.parseInt(temp[1].split((":"))[1]);         
               int cid = Integer.parseInt(temp[2].split((":"))[1]);
               int quantity = Integer.parseInt(temp[3].split((":"))[1]);
                System.out.println(pid+" "+ cid+ "  "+sid+" "+quantity+"///");
                System.out.println(s+"////");
           } 
            catch (Exception e) {       
           }                      
        }
    }
}
