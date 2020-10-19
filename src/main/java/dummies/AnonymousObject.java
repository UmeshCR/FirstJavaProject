/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummies;

/**
 *
 * @author Chintu
 */

// Using methods of class even creating an object. I mean instance address is never stored so to use another time.
// If to use the same instance any other time, we need to create an object.
// Memory isn't created in stack, Memory is only created in the heap.y
public class AnonymousObject {
    public static void main(String[] args) {
        new Pikachu().show();
    }
}

class Pikachu {
    public void show() {
        System.out.println("Pika Pika..!");
    }
}