class GoodMorningThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Good Morning");

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}