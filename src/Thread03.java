// 实现两个子线程交替执行 一个用 实现 runnable interface实现，一个用
// extends Thread, override run 实现
// 开始慢慢学习 不再摆烂
public class Thread03 {
    public static void main(String[] args) {
        Thread01 dog = new Thread01();
        Thread T1 = new Thread(dog);
        T2 cat = new T2();
        cat.start();
        T1.start();
    }

}


class Thread01 implements Runnable{
    int cnt = 0;
    @Override
    public void run() {
        while (cnt < 6) {
            System.out.println("miaomiao" + (++cnt) + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class T2 extends Thread{
    int cnt = 0;
    @Override
    public void run(){
        while (cnt < 6) {
            System.out.println("lalala" + (++cnt) + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}