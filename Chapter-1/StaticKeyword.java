/*

* 1. Java static variable : 
    * If you declare any variable as static, it is known as a static variable.
    * The static variable can be used to refer to the common property of all objects (which is not unique for each object), 
        * or example, the company name of employees, college name of students, etc.
    * The static variable gets memory only once in the class area at the time of class loading.

* 2. Java static method : 
    * If you apply static keyword with any method, it is known as static method.
        * A static method belongs to the class rather than the object of a class.
        * A static method can be invoked without the need for creating an instance of a class.
        * A static method can access static data member and can change the value of it.

* 3. Java static block
        * Is used to initialize the static data member.
        * It is executed before the main method at the time of classloading.

*/

public class StaticKeyword {

    int i;
    String n;

    // Static Variable
    static String collage = "IIT";

    // Static Method or Function
    static void change() {

        collage = "ADIT";
    }

    StaticKeyword(int rollno, String name) {
        i = rollno;
        n = name;
    }

    void display() {

        System.out.println(i + "  " + n + "  " + collage);
    }

    static {
        System.out.println(" Static Block Invoked ");
    }

    public static void main(String[] args) {

        // Method Change Calling
        StaticKeyword.change();

        StaticKeyword St1 = new StaticKeyword(3010, " Shyam Katariya ");
        StaticKeyword St2 = new StaticKeyword(3011, " Ram ");

        // statick method
        St1.display();
        St2.display();
    }
}
