package Demo;

public class ThrowsandThrows {

    public static int devide(int a, int b) throws ArithmeticException{
        if(a<0){
            throw new ArithmeticException();
        }
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        try{
            int c = devide(6,0);
        }
        catch(Exception e){
            System.out.println("Exception");
        }
    }
}