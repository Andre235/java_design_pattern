package 设计模式.创建型模式.抽象工厂模式.product.impl;

import 设计模式.创建型模式.抽象工厂模式.product.Animal;

/**
 * @Author: geek
 * @Date: 2020/9/26 15:03
 * @Description:
 */
public class Horse implements Animal {
    @Override
    public void animalShow() {
        System.out.println("马匹对象被创建...");
    }
}
