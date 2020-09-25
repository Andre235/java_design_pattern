package 设计模式.创建型模式.单例模式.饿汉式;

/**
 * @Author: 赵静超
 * @Date: 2020/9/25 18:55
 * @Description: 饿汉式
 */
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {}

    public static HungrySingleton getInstance(){
        return instance;
    }
}
