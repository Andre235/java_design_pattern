package 设计模式.创建型模式.抽象工厂模式;

import 设计模式.创建型模式.抽象工厂模式.factory.impl.ShangHaiFarm;
import 设计模式.创建型模式.抽象工厂模式.product.Animal;
import 设计模式.创建型模式.抽象工厂模式.product.Plant;

/**
 * @Author: geek
 * @Date: 2020/9/26 14:53
 * @Description:
 */
public class FarmTest {

    private final static String CLASS_NAME = ShangHaiFarm.class.getName();

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> clazz = Class.forName(CLASS_NAME);
        ShangHaiFarm shangHaiFarm = (ShangHaiFarm) clazz.newInstance();

        Animal animal = shangHaiFarm.createAnimal();
        Plant plant = shangHaiFarm.createPlant();

        animal.animalShow();
        plant.plantShow();
    }
}
