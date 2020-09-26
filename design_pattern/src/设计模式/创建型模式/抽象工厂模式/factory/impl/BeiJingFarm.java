package 设计模式.创建型模式.抽象工厂模式.factory.impl;

import 设计模式.创建型模式.抽象工厂模式.factory.Farm;
import 设计模式.创建型模式.抽象工厂模式.product.Animal;
import 设计模式.创建型模式.抽象工厂模式.product.Plant;
import 设计模式.创建型模式.抽象工厂模式.product.impl.Fruit;
import 设计模式.创建型模式.抽象工厂模式.product.impl.Horse;

/**
 * @Author: geek
 * @Date: 2020/9/26 15:12
 * @Description:
 */
public class BeiJingFarm implements Farm {
    @Override
    public Animal createAnimal() {
        System.out.println("马匹出生...");
        return new Horse();
    }

    @Override
    public Plant createPlant() {
        System.out.println("水果丰收...");
        return new Fruit();
    }
}
