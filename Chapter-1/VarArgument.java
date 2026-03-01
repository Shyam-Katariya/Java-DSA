/*
     VariableArgument
*/
public class VarArgument {

    static void display(int... a) {

        System.out.println(" Number of Argument : " + a.length);

        for (int m : a) {
            System.out.println( m + "");
        }
    }    

    public static void main(String[] args) {
     
        display(100);
        display(12, 23, 35);
        display();
    }
}