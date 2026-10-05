

public class ThreadDemo {
public static void main(String[] args) 
{
        GoodMorningThread thread1 = new GoodMorningThread();
        HelloThread thread2 = new HelloThread();
        WelcomeThread thread3 = new WelcomeThread();

thread1.start();
thread2.start();
thread3.start();
    }
}