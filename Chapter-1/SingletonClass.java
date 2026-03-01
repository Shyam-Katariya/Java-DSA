/*

    Singleton Class :

    1. this Concepat is used to avoid more than 1 object(instance of class) in class
    2. To implement this these method we follow some steps

*/
class Abc {
    static Abc a = new Abc(); // 1.

    // 2 step
    private Abc() {
    }

    // 3 step
    public static Abc getObject() {
        return a;
    }
}

public class SingletonClass {

    public static void main(String[] args) {

        Abc a = Abc.getObject();
    }
}