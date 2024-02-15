package multithreading;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args){
        Runnable r = new MyRunnable(); // follow Liskov Substitution Principle states that ham Derived class me base class ka reference rakh rahe hai
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
    }
}
