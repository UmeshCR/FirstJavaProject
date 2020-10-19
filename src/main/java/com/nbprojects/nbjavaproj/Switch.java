/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nbprojects.nbjavaproj;

/**
 *
 * @author Chintu
 */
public class Switch {
    public static void main(String[] args) {
        String s = "Umesh";
        switch(s) {
            case "Hello":
                System.out.println("Hello is passed in here.");
                break;
            case "Hi":
                System.out.println("Hi is passed in here.");
                break;
            default:
                System.out.println("OOPS..! Something ugly is passed...");
        }
    }
}
