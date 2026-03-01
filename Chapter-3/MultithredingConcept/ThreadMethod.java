class MyThre1 extends Thread{

    MyThre1(String name){

        super(name);
    }
    public void run(){
        int i = 0;
        while (0<10) {
            System.out.println("Thread is running");
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e) {
                //throw new RuntimeException(e);
                System.out.println(e);
            }
        }
    }
}

public class ThreadMethod {
    public static void main(String[] args) {
        MyThre1 m1 = new MyThre1(" SK ");
        m1.start();
        try {
            m1.join();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
