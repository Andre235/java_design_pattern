package 设计模式.创建型模式.简单工厂模式.factory;

import 设计模式.创建型模式.简单工厂模式.constant.Const;
import 设计模式.创建型模式.简单工厂模式.product.ConcreteProductA;
import 设计模式.创建型模式.简单工厂模式.product.ConcreteProductB;
import 设计模式.创建型模式.简单工厂模式.product.Product;

/**
 * @Author: 赵静超
 * @Date: 2020/9/26 11:07
 * @Description:
 */
public class SimpleFactory {

    public static Product makeProduct(String type) throws Exception {
        switch (type) {
            case Const.A:
                return new ConcreteProductA();
            case Const.B:
                return new ConcreteProductB();
            default:
                throw new Exception("传入的type参数非法...");
        }
    }
}
