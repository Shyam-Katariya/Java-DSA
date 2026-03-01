/*
    *   Method 1 : The method must have the same name as in the parent class
 */
class ParentClass {

    static void display() {

        System.out.println("Parent Class");
    }
}

class ChildClass extends ParentClass {
    
    static void display() {

        System.out.println(" Parent Class Override ");
    }
}

public class Overiding extends ChildClass {
    public static void main(String[] args) {

        Overiding o = new Overiding();
        o.display();
    }
}
