/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nbprojects.nbjavaproj;
import java.util.*;

/**
 *
 * @author Chintu
 */
public class ArrayErrors {
    public static void main(String[] args) {
        Random r = new Random();
        int arr[] = new int[10];
        for(int i=0; i<10; i++) {
            arr[i] = r.nextInt(50);
        }
        try {
            System.out.println(arr[12]);
        }
        catch(Exception e) {
            System.out.println("OOPS..!\nError Occurred.\nMaximum Array size is 10,\nso you can only access till the index 9.");
        }
    }
    
}
