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
public class PolyMorphism {
    public static void main(String[] args) {
        Switzerland s = new Switzerland();
        s.show();
        s.show(4);
        Bern b = new Bern();
        b.show();
    }
}
// PolyMorphism == ManyBehaviorial.
/* Method overloading and method overriding are examples of Polymorphism.
   When a method has same name but different parameters, the concept is called as Method overloading.
   When super and sub classes shares same method, and subclass had an instance to call the very same method, then the method which belongs to the subclass overrides the method in the super class and gets called. This concept is called as  Method Overriding.
*/

// Method Overloading.
// Method Overloading == Early Binding == Static Binging == Compile Time Polymorphism.
class Switzerland {
    public void show(){
        System.out.println("Show without parameters...");
    }
    public void show(int a){
        System.out.println("The given parameter is : " + a);
    }
}

// Method Overriding.
// Method Overriding == Late Binding == Dynamic Binding == Run Time Polymorphism
class Bern extends Switzerland{
    public void show() {
        super.show();
        System.out.println("Show in Bern...");
    }
}

