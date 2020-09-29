package 设计模式.结构型模式.适配器模式.新能源发动机实战;

import 设计模式.结构型模式.适配器模式.新能源发动机实战.impl.ElectricAdapter;
import 设计模式.结构型模式.适配器模式.新能源发动机实战.impl.OpticalAdapter;

/**
 * @Author: geek
 * @Date: 2020/9/29 22:39
 * @Description:
 */
public class Client {
    private final static String CLASS_PATH = OpticalAdapter.class.getName();

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        System.out.println(CLASS_PATH);
        Class<?> clazz = Class.forName(CLASS_PATH);
        Motor motor = (Motor) clazz.newInstance();
        motor.drive();
    }
}
