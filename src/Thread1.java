// 继承 thread 类创建线程
public class Thread1 {
    public static void main(String[] args) throws InterruptedException {
        // create cat instance 可以当成线程使用
        Cat cat = new Cat();
        cat.start(); // start thread
        // 当 main 线程启动一个子线程 Thread-0后， 主线程不会block
        // 会继续执行

        for (int i = 0; i <= 60; i++){
            System.out.println("主线程" + i);
            Thread.sleep(1000);
        }

    }
}

class Cat extends Thread{
    int time = 0;
    @Override
    public void run() { // override run 方法 写自己业务逻辑
        while (true){
        // every 1 second print meow
        System.out.println("meow" + (++time));
        // 让该线程sleep 1s
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (time == 80) break; // 退出while 同时推出 thread
        }
    }
}
