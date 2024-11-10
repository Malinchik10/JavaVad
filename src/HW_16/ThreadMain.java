package HW_16;

public class ThreadMain {
    public static void main(String[] args) {
        System.out.print("Start threads");
        runThreads();
        System.out.print("Stop threads");

        System.out.print("Start Runnable");
        runRunnable();
        System.out.print("Stop Runnable");
    }

    private static void runThreads() {
        Car car1 = new Car("Niva", 1000, 5);
        Car car2 = new Car("Ford", 1024, 10);
        Thread thread1 = new Thread() {
            public void run() {
                car1.Drive();
            }
        };
        Thread thread2 = new Thread() {
            public void run() {
                car2.Drive();
            }
        };
        thread1.start();
        thread2.start();
    }

    private static void runRunnable() {
        RunnableCar car1 = new RunnableCar("Tesla", 100, 6);
        RunnableCar car2 = new RunnableCar("Audi", 124, 8);
        Thread thread1 = new Thread(car1) ;
        Thread thread2 = new Thread(car2);
        thread1.start();
        thread2.start();
    }
}