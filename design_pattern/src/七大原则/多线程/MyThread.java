package 七大原则.多线程;

/**
 * @author : Jeffersonnn
 * @date : 2020/3/6
 * @description : 继承Thread类，实现多线程操作
 */
public class MyThread extends Thread{

    private int i;

    public static void main(String[] args) {
        for(int j = 0;j < 50;j++) {

            //调用Thread类的currentThread()方法获取当前线程
            System.out.println(Thread.currentThread().getName() + " " + j);

            if(j == 10) {
                //创建并启动第一个线程
                new MyThread().start();

                //创建并启动第二个线程
                new MyThread().start();
            }
        }
    }

    public void run() {
        for(;i < 100;i++) {
            //当通过继承Thread类的方式实现多线程时，可以直接使用this获取当前执行的线程
            System.out.println(this.getName() + " "  + i);
        }
    }

}
