package 设计模式.创建型模式.单例模式.饿汉式;

/**
 * @Author: 赵静超
 * @Date: 2020/9/25 18:58
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        HungrySingleton instance1 = HungrySingleton.getInstance();
        HungrySingleton instance2 = HungrySingleton.getInstance();

        System.out.println(instance1 == instance2);
        System.out.println(instance1.equals(instance2));
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}
