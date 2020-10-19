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
public class Abstraction {
    public static void main(String[] args) {
        Samsung s = new Samsung();
        Iphone i = new Iphone();
        Repair r = new Repair();
        i.call();
        s.camera();
        r.repair(i);
        Win98 os = new WinXP();
        os.showOS();
        os.update();
    }
}

// Abstract classes are never get instantiated, i.e, memory never gets allocated for this abstract classes, we use this as a reference to create sub classes so to inherit methods of abstract class.
abstract class Phone {
    public String name;
    void call() {
        System.out.println("Call is being done by " + this.name);
    }
    public void camera() {
        System.out.println("Camera is working by " + this.name);
    }
}

class Samsung extends Phone {
    public Samsung() {
        super.name = "Samsung";
    }
}

class Iphone extends Phone {
    public Iphone() {
        super.name = "Iphone";
    }
}

class Repair {
    public void repair(Phone p) {
        System.out.println(p.name + " Phone is repairing...");
    }
}

// Abstract methods are those which are only declared, not defined.
// If you wanna use an abstract method, then the containing class should be abstract as well.
// Abstract class can have abstract methods and non-abstract methods as well.
abstract class Win98 {
    public void showOS() {
        System.out.println("Windows 98 system...");
    }
    public abstract void update();
}

class WinXP extends Win98 {
    public void update() {
        System.out.println("Windows is updated to Windows XP...");
    }
}