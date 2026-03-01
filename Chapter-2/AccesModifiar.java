class Abcd{

    public int a = 10;
    protected int b = 12;
    int c = 15;
    private int d = 13;

    void display() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

}

public class AccesModifiar {
    public static void main(String[] args) {
        
        Abcd aa = new Abcd();
        System.out.println(aa.a);
        System.out.println(aa.b);
        System.out.println(aa.c);
        // System.out.println(aa.d); // -- error
    } 
}
