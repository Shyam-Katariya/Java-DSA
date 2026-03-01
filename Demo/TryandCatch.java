package Demo;

import java.util.Scanner;

public class TryandCatch {
    public static void main(String[] args) {

        int a = 3;
        int b = 0;

        try{

            try{
                int c = a/b;
                System.out.println("The Result is :" + c);
            }
            catch (ArithmeticException e) {
                System.out.println("ARithmetic Exception");
            }
        }
        catch (Exception e) {
            System.out.println("There is an Error in Program");
            System.out.println(e);
        }

        System.out.println("Program is Complete");
    }
}
