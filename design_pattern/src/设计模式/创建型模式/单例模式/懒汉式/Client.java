package 设计模式.创建型模式.单例模式.懒汉式;

/**
 * @Author: 赵静超
 * @Date: 2020/9/25 18:36
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        LazySingleton instance1 = LazySingleton.getInstance();
        LazySingleton instance2 = LazySingleton.getInstance();
        //比较创建的两个实例是否相等
        System.out.println(instance1.equals(instance2));
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

