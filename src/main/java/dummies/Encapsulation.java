/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Encapsulation is the process of accessing the class variables with only methods not directly.
 */

package dummies;
import java.util.*;

/**
 *
 * @author Chintu
 */
public class Encapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A a = new A();
        System.out.println("Enter the value of i : ");
        a.setI(sc.nextInt());
        System.out.println("The value of i is : " + a.getI());
        System.out.println(a);
    }    
}

class A {
    private int i;
    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "A {" + "i=" + i + '}';
    }
    public int getI() {
        return this.i;
    }
}