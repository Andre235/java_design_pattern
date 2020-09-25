package 设计模式.创建型模式.单例模式.懒汉式;

/**
 * @Author: 赵静超
 * @Date: 2020/9/25 18:28
 * @Description: 懒汉式即什么时候访问什么时候创建实例，在多线程环境下会存在线程安全问题。因此在设计懒汉式时应该考虑线程安全问题
 */
public class LazySingleton {

    private static volatile LazySingleton instance = null;

    /**
     * 创建私有构造方法，可以保证全局只能有一个实例
     */
    private LazySingleton() {}

    public static synchronized LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
