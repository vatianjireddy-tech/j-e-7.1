package demonThread;

class DaemonThread1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Daemon thread starting");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Daemon thread was interrupted");
            return;
        }

        System.out.println("Daemon thread finishing");
    }
}

public class DaemonThreadExample {
    public static void main(String[] args) {
        Thread daemon = new Thread(new DaemonThread1());
        daemon.setDaemon(true);
        daemon.start();

        System.out.println("Main thread continuing to do other work");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Main thread was interrupted");
        }

        System.out.println("Main thread finished");
    }
}
