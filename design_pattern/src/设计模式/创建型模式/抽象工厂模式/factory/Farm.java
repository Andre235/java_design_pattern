package 设计模式.创建型模式.抽象工厂模式.factory;

import 设计模式.创建型模式.抽象工厂模式.product.Animal;
import 设计模式.创建型模式.抽象工厂模式.product.Plant;

/**
 * @Author: geek
 * @Date: 2020/9/26 14:56
 * @Description: 抽象农场接口,一个抽象工厂里面可以生产多种抽象产品
 */
public interface Farm {
    Animal createAnimal();
    Plant createPlant();
}
