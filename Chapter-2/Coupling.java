/*
    * Coupling 

    In object oriented design, Coupling refers to the degree of direct knowledge that one element has of another. In other words, how often do changes in class A force related changes in class B.
    There are Two types of Coupling in Java.
            * 1. Tight coupling
            * 2. Loose coupling

        Tight coupling : In general, Tight coupling means the two classes often change together. In other words, if A knows more than it should about the way in which B was implemented, then A and B are tightly coupled.

        Loose coupling : In simple words, loose coupling means they are mostly independent. If the only knowledge that class A has about class B, is what class B has exposed through its interface, then class A and class B are said to be loosely coupled.

    In order to over come from the problems of tight coupling between objects, spring framework uses dependency injection mechanism with the help of POJO/POJI model and through dependency injection its possible to achieve loose coupling.

*/

class Coupling {
    public static void main(String[] args) {

        subclass s = new subclass(5, 5, 5);
        System.out.println(s.calculate());

    }
}

final class subclass {

    private int divya;
    subclass(int h, int l, int w) // Constructor
    {

        this.divya = h * l * w;
    }

    public int calculate() {

        return divya;
    }
}