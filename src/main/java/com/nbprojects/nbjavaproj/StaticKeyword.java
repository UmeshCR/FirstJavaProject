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
public class StaticKeyword {
    public static void main(String[] args) {
        Abc obj = new Abc();
        obj.show(); // Called using the object created above.
        Abc.show(); // Called using the Class name itself.
    }
}

class Abc {
    public static void show() {   // Static methods and variables can be used along with class name, they don't need to be called by an instance which is created (Objects).
        System.out.println("Holaa...");
    }
}