/*
* this : Keyword *
    
    * 1. this can be used to refer current class instance variable.
    
    * 2. this can be used to invoke current class method (implicitly) 
        / this happan in Compilar and Compilar atomatically call this method in compile time
    
        * 3. this() can be used to invoke current class constructor.
        / The this() constructor call should be used to reuse the constructor from the constructor. 
        / It maintains the chain between the constructors i.e. it is used for constructor chaining
    
    * 4. this can be passed as an argument in the method call.
    
    * 5. this can be passed as argument in the constructor call.
    
    * 6. this can be used to return the current class instance from the method.

*/

public class ThisKeyword {

    int intvalue;
    float fee;

    ThisKeyword() {
    }
    
    ThisKeyword(int i) {
    
        intvalue = i;
        System.out.println(" Constructor Called " + i);
    }

    // 3. this keyword is re-using constructor 
    ThisKeyword(int i, float fee) {
        // 1. this keyword used to select variable
        this.fee = fee;
        System.out.println(fee);
        System.out.println(i);
    }
    
    void display() {

        System.out.println(" First Method ");
    }

    void show() {
        System.out.println();
        System.out.println(" Second Method ");
        // 2. this invoke atomatically in compile time
        this.display();
    }

    public static void main(String[] args) {

        ThisKeyword t1 = new ThisKeyword();
        t1.show();

        ThisKeyword t2 = new ThisKeyword(12, 10.5f);

    }
}
