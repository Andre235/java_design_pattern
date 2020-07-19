package 七大原则.多线程;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author : Jeffersonnn
 * @date : 2020/3/6
 * @description :
 */
public class MyFutureTask {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // lambda表达式写法>
        FutureTask<Integer> futureTask = new FutureTask<>(()->{
            System.out.println("开始睡眠...");
            Thread.sleep(5000);
            System.out.println("睡眠结束...");
            return 100;
        });

        new Thread(futureTask).start();
        System.out.println(System.currentTimeMillis());
        System.out.println(futureTask.get());
        System.out.println(System.currentTimeMillis());

    }
}
