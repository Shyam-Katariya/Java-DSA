
class MyThread extends Thread{

    public void run(){
        int i = 0;
        while (i<100) {
            System.out.println(" My Thread is Running");
            i++;
        }
    }
}

class MyThread1 extends Thread{

    public void run(){

        int i = 0;
        while (i<100) {
            System.out.println(" OFF ");
            i++;
        }
    }
}


public class Main {
    public static void main(String[] args) {


        MyThread t = new MyThread();
        MyThread1 t1 = new MyThread1();

        t.start();
        t1.start();

    }
}