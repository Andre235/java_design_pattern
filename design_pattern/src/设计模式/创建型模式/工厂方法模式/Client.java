package 设计模式.创建型模式.工厂方法模式;

import 设计模式.创建型模式.工厂方法模式.factory.Factory;
import 设计模式.创建型模式.工厂方法模式.factory.impl.FactoryB;
import 设计模式.创建型模式.工厂方法模式.product.Product;

/**
 * @Author: 赵静超
 * @Date: 2020/9/26 13:26
 * @Description:
 */
public class Client {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //获取该类所在的包的路径
        String packagePath = FactoryB.class.getPackage().getName();
        //类名称
        String className = "FactoryA";

        Class<?> aClass = Class.forName(packagePath + "." + className);
        Factory factory = (Factory) aClass.newInstance();

        Product product = factory.makeProduct();
        product.show();
    }
}
