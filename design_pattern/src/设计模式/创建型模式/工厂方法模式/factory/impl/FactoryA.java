package 设计模式.创建型模式.工厂方法模式.factory.impl;

import 设计模式.创建型模式.工厂方法模式.factory.Factory;
import 设计模式.创建型模式.工厂方法模式.product.Product;
import 设计模式.创建型模式.工厂方法模式.product.impl.ProductA;

/**
 * @Author: 赵静超
 * @Date: 2020/9/26 13:29
 * @Description:
 */
public class FactoryA implements Factory {

    @Override
    public Product makeProduct() {
        System.out.println("A工厂制造A产品...");
        return new ProductA();
    }
}
