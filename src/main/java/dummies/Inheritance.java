/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummies;
import java.util.Scanner;

/**
 *
 * @author Chintu
 */
public class Inheritance {
    public static void main(String[] args) {
        AddSubMul asm = new AddSubMul();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value for a : ");
        asm.a = scan.nextInt();
        System.out.println("Enter the value for b : ");
        asm.b = scan.nextInt();
        System.out.println("The addition of a and b is : " + asm.addition());
        System.out.println("The subtraction of a and b is : " + asm.subtraction());
        System.out.println("The multiplication of a and b is : " + asm.multiplication());
    }
}

class Add {
    int a;
    int b;
//  Not using encapsulation so to reduce the burden everytime. But use it for big projects.
    /**
     *  public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }
     */
    public int addition() {
        return this.a + this.b;
    }
}

// Single Inheritance.
class AddSub extends Add {
    public int subtraction(){
        return this.a - this.b;
    }
}

//Multilevel Inheritance.
class AddSubMul extends AddSub {
    public int multiplication(){
        return this.a * this.b;
    }
}

// Multiple Inheritance.