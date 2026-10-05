class WelcomeThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Welcome");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}