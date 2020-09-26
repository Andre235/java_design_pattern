package 设计模式.创建型模式.工厂方法模式.factory.impl;

import 设计模式.创建型模式.工厂方法模式.factory.Factory;
import 设计模式.创建型模式.工厂方法模式.product.Product;
import 设计模式.创建型模式.工厂方法模式.product.impl.ProductB;

/**
 * @Author: 赵静超
 * @Date: 2020/9/26 13:29
 * @Description:
 */
public class FactoryB implements Factory {
    @Override
    public Product makeProduct() {
        System.out.println("B工厂制造B产品...");
        return new ProductB();
    }
}
