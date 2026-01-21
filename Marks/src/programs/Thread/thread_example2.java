package programs.Thread;


class Thread1 extends Thread{

    public void run() {
        int i=0;
        while (i < 40000) {
            System.out.println("my thread1 is running");
            i++;
        }
    }
}
class Thread2 extends Thread{

    public void run() {
        int i=0;
        while (i < 40000) {
            System.out.println("my thread2 is running");
            i++;
        }
    }
}
// so this ex tells both threads are running concurrently
class  thread_example2{

    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        t1.start();
        Thread2 t2=new Thread2();
        t2.start();
    }
}
