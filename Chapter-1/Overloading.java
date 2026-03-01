/*
    *   Method Overloading in java
    *   1. By changing number of arguments, 2. By changing the data type

*/

class Adder {

    static int display(int i) {

        return i;
    }

    static String display(int i, String s) {
        return i + s;
    }
}

public class Overloading {
    public static void main(String[] args) {

        System.out.println(Adder.display(1));
        System.out.println(Adder.display(3010, " Shyam "));

    }
}