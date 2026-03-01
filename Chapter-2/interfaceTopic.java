/*

    * Interface : 

        An Interface in Java programming language is defined as an abstract type used to specify the behavior of a class. A Java interface contains static constants and abstract methods.

        The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not the method body. It is used to achieve abstraction and multiple inheritance in Java. In other words, you can say that interfaces can have abstract methods and variables. It cannot have a method body. Java Interface also represents the IS-A(Relation between classes) relationship.

        Like a class, an interface can have methods and variables, but the methods declared in an interface are by default abstract (only method signature, no body). 

            Interfaces specify what a class must do and not how. It is the blueprint of the class.
            
            An Interface is about capabilities like a Player may be an interface and any class implementing Player must be able to (or must implement) move(). So it specifies a set of methods that the class has to implement.
            
            If a class implements an interface and does not provide method bodies for all functions specified in the interface, then the class must be declared abstract.

            If a class implements this interface, then it can be used to sort a collection.

            In Interface All Method & Variable are Final so it can not be override.


*/

interface Bike {

    void Speedup(int increment);
    void Brack(int decrement);
}

interface Modelno {
    
    // Final Variable
    int model = 12;
}

class Vehical implements Bike, Modelno{

    // Final Method
    public void Speedup(int increment) {
        System.out.println(" Speed Increse ");
        
    }

    // Final Method
    public void Brack(int decrement) {
        System.out.println(" Speed Decrese ");
    }
    
}

public class interfaceTopic  {
    
    public static void main(String[] args) {

        Vehical v = new Vehical();
        v.Speedup(23);
        v.Brack(10);
        System.out.println(v.model);
        
    }

}
