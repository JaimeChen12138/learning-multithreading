// 通过实现接口 Runnable 来开发线程
public class Thread02 {
    public static void main(String[] args) {
        T1 dog = new T1();
        // dog.start() 用不了
        // 创建Thread 对象， 把 T1对象（实现了Runnable）放入thread
        Thread thread = new Thread(dog);
        thread.start();
    }
}

class T1 implements Runnable{ // 实现 Runnable接口 开发线程
    int cnt = 0;
    @Override
    public void run() {
        while (true){
            System.out.println("dog laugh" + (++cnt) + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (cnt == 10) break;
        }
    }
}
