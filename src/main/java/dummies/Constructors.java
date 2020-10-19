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
public class Constructors {
    public static void main(String[] args) {
        Argentina a = new Argentina();
        Netherlands n = new Netherlands();
        Argentina ar = new Argentina(5);
        Netherlands ne = new Netherlands(5);
        Argentina net = new Netherlands();
        // Netherlands arg = new Argentina(); // Not possible, giving an error.
        a.show();
        n.show();
        ar.show();
        ne.show();
        net.show();
    }
}

class Argentina {
    public Argentina() {
        System.out.println("In Argentina Constructor...");
    }
    public Argentina(int a) {
        System.out.println("In Argentina Constructor with an Integer as a parameter...");
    }
    public void show() {
        System.out.println("This is in Argentina Show...");
    }
}
class Netherlands extends Argentina {
    public Netherlands() {
        System.out.println("In Netherlands Constructor...");
    }
    public Netherlands(int a) {
        super(a);
        System.out.println("In Netherlands Constructor with an Integer as a parameter...");
    }
    public void show(){
        System.out.println("This is in Netherlands show...");
    }
}