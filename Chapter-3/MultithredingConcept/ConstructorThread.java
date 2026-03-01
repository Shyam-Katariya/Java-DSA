class MyThre extends Thread{

    MyThre(String name){
        super(name);
    }
    public void run(){

        System.out.println("Thread is running");
    }
}

public class ConstructorThread {

    public static void main(String[] args) {

        MyThre m1 = new MyThre("Shyam");
        m1.start();
        System.out.println("Thread Name is : " + m1.getName());
        System.out.println("Thread Id is : " + m1.getId());
    }
}
