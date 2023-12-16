package ThreadJoinAndYield;
//main线程 create子线程，each 1s say hello, output 20 times,
//main thread each 1s say hi, 20 times, requirements:
// two threads start at same time and make child thread complete
// running after main thread print 5 times
public class Thread04 {
    public static void main(String[] args) throws InterruptedException {
        T1 t1 = new T1();
        t1.start();

        int cnt = 0;
        while(cnt < 20){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "hi" + (++cnt) + " times");

            if (cnt == 5){
                t1.join();
            }
        }
    }
}
class T1 extends Thread{
    int cnt = 0;
    @Override
    public void run() {
        while (cnt < 20) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "hello" + (++cnt) + " times");
        }
    }
}