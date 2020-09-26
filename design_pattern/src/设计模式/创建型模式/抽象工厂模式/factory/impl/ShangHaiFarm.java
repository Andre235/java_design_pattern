package 设计模式.创建型模式.抽象工厂模式.factory.impl;

import 设计模式.创建型模式.抽象工厂模式.factory.Farm;
import 设计模式.创建型模式.抽象工厂模式.product.Animal;
import 设计模式.创建型模式.抽象工厂模式.product.Plant;
import 设计模式.创建型模式.抽象工厂模式.product.impl.Cattle;
import 设计模式.创建型模式.抽象工厂模式.product.impl.Vegetables;

/**
 * @Author: geek
 * @Date: 2020/9/26 15:10
 * @Description: 上海农场（上海具体工厂）
 */
public class ShangHaiFarm implements Farm {

    @Override
    public Animal createAnimal() {
        System.out.println("牛出生...");
        return new Cattle();
    }

    @Override
    public Plant createPlant() {
        System.out.println("蔬菜成长...");
        return new Vegetables();
    }
}
