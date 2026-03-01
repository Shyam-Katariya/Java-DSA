public class ConstuctorDemo {

    int id = 007;
    String name = "Shyam";

    public void display() {

        System.out.println("Method Called");
    }

    // Constuctor without Perametars
    ConstuctorDemo() {

        System.out.println("Constuctor Called ");
    }

    // Constuctor with Perametars
    ConstuctorDemo(int id, String name) {

        this.name = name;
        this.id = id;

        System.out.println(" 2nd Constuctor " + id + name);
    }

    public static void main(String[] args) {

        ConstuctorDemo C = new ConstuctorDemo();
        ConstuctorDemo C1 = new ConstuctorDemo(07, " Katariya ");

        C1.display();
        C.display();
        
    }
}