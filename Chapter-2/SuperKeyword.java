/*

    * super keyword :
    The super keyword in Java is a reference variable which is used to refer immediate parent class object.
    Whenever you create the instance of subclass, an instance of parent class is created implicitly which is referred by super reference variable.

    Usage of Java super Keyword
            super can be used to refer immediate parent class instance variable.
            super can be used to invoke immediate parent class method.
            super() can be used to invoke immediate parent class constructor.

*/
class Parent1 {

    public void display() {
        System.out.println("Parent Class");
    }
}

public class SuperKeyword extends Parent1 {

    public void display() {

        super.display();
        System.out.println("Child Class");
    }
}

class Main {
    public static void main(String[] args) {
        SuperKeyword s = new SuperKeyword();
        s.display();
    }
}