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
public class DummyClass {
    public DummyClass() {
        System.out.println("The constructor is called..!");
    }
    public static void show(int ...arg) {
        for(int i : arg) {
            System.out.println(i);
        }
    }
}
