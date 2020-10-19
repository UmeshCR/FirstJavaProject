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
public class Loops {
    public static void main(String[] args) {
        // While Loop
        System.out.println("While Loop ########");
        int i = 0;
        while( i < 10 ) {
            System.out.println(i++);
        }
        // Do While Loop
        System.out.println("Do While Loop #####");
        int j = 0;
        do {
            System.out.println(j++);
        }while( j < 0 );
        // For Loop
        System.out.println("For Loop ##########");
        for(int k = 0; k < 10; k+=2) {
            System.out.println(k);
        }
    }
}
