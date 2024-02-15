package multithreading;

public class ThreadUsingLambda {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 10; i++){
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        });
    }
}
