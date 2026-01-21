package programs.Thread;

//1st way to create thread
class MyThread extends Thread {
    public void run() {
        for (int i=1;i<50;i++)
        {
            System.out.println(i);
        }
        System.out.println("Thread running...");
    }
}

//2nd way to create thread
class MyThread1 implements Runnable {

    public void run() {
        System.out.println("Thread running...");
    }
}
public class Thread1Example {

    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.start();

        MyThread1 myThread1=new MyThread1();
        Thread thread=new Thread(myThread1);//It would execute the code synchronously on the main
        // thread—no concurrency, no parallelism.

        thread.start();
    }
}