class MyThreadRunnable1 implements Runnable{
    public void run(){

        System.out.println("Class 1 is running");
    }
}

class MyThreadRunnable2 implements Runnable{
    public void run(){

        System.out.println("Class 2 is running");
    }
}

public class Runnable_Interface {

    private static Runnable bullet1;
    private static Runnable bullet2;

    public static void main(String[] args) {

        //MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        //MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.run();
        gun2.run();

    }
}
