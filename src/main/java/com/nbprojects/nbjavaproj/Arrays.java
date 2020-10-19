/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nbprojects.nbjavaproj;
import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.print("Enter Number of elements:\n");
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Random integer values are feeded into your array..!\n");
        for(int i = 0; i < n; i++) {
            arr[i] = r.nextInt(50); // The values never exceed 50.
        }
        System.out.print("The array elements are : ");
        // Enhanced for loop...
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
    
}
