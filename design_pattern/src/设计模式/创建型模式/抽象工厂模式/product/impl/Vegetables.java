package 设计模式.创建型模式.抽象工厂模式.product.impl;

import 设计模式.创建型模式.抽象工厂模式.product.Plant;

/**
 * @Author: geek
 * @Date: 2020/9/26 15:06
 * @Description:
 */
public class Vegetables implements Plant {
    @Override
    public void plantShow() {
        System.out.println("蔬菜类对象被创建...");
    }
}
