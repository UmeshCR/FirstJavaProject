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
public class Array2D {
    public static void main(String[] args) {
        int arr2[][] = {
                           {1, 2, 3},
                           {4, 5, 6},
                           {7, 8, 9}
                       };
        int i, j, arr[][] = new int[3][3];
        for(i=0; i<arr2.length; i++) {
            for(j=0; j<arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println("");
        }
        for(i=0; i<arr.length; i++) {
            for(j=0; j<arr[i].length; j++) {
                arr[i][j] = i+j;
            }
        }
        System.out.println("");
        for(i=0; i<arr.length; i++) {
            for(j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
