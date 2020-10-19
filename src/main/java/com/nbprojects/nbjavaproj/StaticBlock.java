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
public class StaticBlock {
    static {
        System.out.println("Hello This is using the static Block.");
    }
    public static void main(String[] args) {
        System.out.println("This is in main method.");
    }
    static {
        System.out.println("This is in static block after main method.");
    }
}
