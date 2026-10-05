class HelloThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Hello");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}