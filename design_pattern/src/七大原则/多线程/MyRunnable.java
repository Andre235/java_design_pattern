package 七大原则.多线程;

/**
 * @author : Jeffersonnn
 * @date : 2020/3/6
 * @description :
 */
public class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"  "+i);
        }
    }
}

class Test1{
    public static void main(String[] args) {
        new Thread(new MyRunnable(),"runnable").start();
    }
}
