/*

    * Defalut Method in Interface :
        
        -> This method help to declare mathed in interface without caosing trouble.
        -> This method also be override in Main() method

*/
interface Capital {

    void a();

    default void display() {

        System.out.println(" Defalut Method in Interface ");
    }
}

interface Small {
    void b();
}

class Carge implements Capital, Small {

    public void b() {

        System.out.println(" Method B ");
    }

    public void a() {

        System.out.println(" Method A");
    }
}

public class Interface_Methods {
    public static void main(String[] args) {
        Carge C = new Carge();
        C.a();
        C.b();
        C.display();
    }
}
