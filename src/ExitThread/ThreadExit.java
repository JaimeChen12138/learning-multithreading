package ExitThread;

public class ThreadExit {

    public static void main(String[] args) throws InterruptedException {
        T1 t1 = new T1();
        t1.start();

        Thread.sleep(10 * 1000);
        System.out.println("main thread already sleep 10s");
        t1.setLoop(false);
    }
}


class T1 extends Thread{
    private boolean loop = true;

    @Override
    public void run() {
        while (loop){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("T1 is running");
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}