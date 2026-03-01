interface a {

    int i = 10; // final variable
}

interface b {
 
    Float f = 12.5f;
}

class Divya implements a, b {
    public static void main(String[] args) {
        
        Divya d = new Divya();

        System.out.println(a.i);
        System.out.println(b.f);

    }
}