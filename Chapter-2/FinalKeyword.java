/*

    * Final :

        1. Stop Value Change
        2. Stop Method Overriding
        3. Stop Inheritance

    * Is final method inherited ? -> Yes, final method is inherited but you cannot override it

    * Static blank final variable -> A static final variable that is not initialized at the time of declaration is known as static blank final variable. It can be initialized only in static block.

    * What is final parameter? -> If you declare any parameter as final, you cannot change the value of it.

*/

/*
    * final class A -- Error : Stop Inheritance
*/
class A {

    final void diaplay() {

        System.out.println(" Final Method ");
    }
}

public class FinalKeyword extends A {

    static final int age = 25;
    /*
     * Error -- Stop Method Overriding
        void diaplay() {
        
        * age = 35; -- error : Don't Chnage Value
        System.out.println("Age Don't change" + age);
     }
     */
    public static void main(String[] args) {
        FinalKeyword f = new FinalKeyword();
        f.diaplay();

        System.out.println("Int Age is : " + age);
    }
}
