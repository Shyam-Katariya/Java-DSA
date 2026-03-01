/*

    * Abstact : exsting in thoughs but not in real
    * Abstact Method :

        this Method is declared without Implementation. 

    * Abstract Class :

        Abstrcat is class that declares Abstract Method, then the class it self must be declared abstract. 
        Can not creat Object. Unlesh all method in Abstract class is Overriden
        Because It help other class to match their standrads or we can say mach them to make actual exist classes.

*/
 
abstract class Parent {

    Parent() {

        System.out.println(" System Call For Constuctor ");
    }

    abstract void display();

}

class child extends Parent{

    @Override
    void display() {
        // TODO Auto-generated method stub
        System.out.println("Abstract Method Override");
    }
    
}

public class absrtactWay extends child{
    
    public static void main(String[] args) {
        
        absrtactWay a = new absrtactWay();
        a.display();
    }
}
