package 设计模式.创建型模式.工厂方法模式.product.impl;

import 设计模式.创建型模式.工厂方法模式.product.Product;

/**
 * @Author: 赵静超
 * @Date: 2020/9/26 13:30
 * @Description:
 */
public class ProductB implements Product {
    @Override
    public void show() {
        System.out.println("B产品被展示...");
    }
}
