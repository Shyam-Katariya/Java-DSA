/*

    * Dynamic Method Dispach --> Supar class rafarance is = subclass object

*/

class Phone {

    void on() {
        System.out.println(" Phone is on ");
    }

    void display() {
        System.out.println(" Phone Display ");
    }
}

class SmartPhone extends Phone {
    void on() {
        System.out.println(" Smart Phone is on ");
    }

    void Speekar() {
        System.out.println(" Smart Phone Speekar ");
    }
}

public class Dynamic_Method_Dispach {
    public static void main(String[] args) {

        // Phone p = new Phone();
        Phone P = new SmartPhone();
        // Super Obj = new Sub();
        /*
            * SmartPhone S = new Phone();
            * Not Allowed
         */

        P.display();
        P.on();
        // P.Speekar(); --> Not allowed

    }
}