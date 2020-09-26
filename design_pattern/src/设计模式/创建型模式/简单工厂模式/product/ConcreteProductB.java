package 设计模式.创建型模式.简单工厂模式.product;

/**
 * @Author: 赵静超
 * @Date: 2020/9/26 11:05
 * @Description:
 */
public class ConcreteProductB implements Product {
    @Override
    public void show() {
        System.out.println("产品B被创建...");
    }
}
