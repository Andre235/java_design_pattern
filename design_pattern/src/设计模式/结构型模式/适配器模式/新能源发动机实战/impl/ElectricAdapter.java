package 设计模式.结构型模式.适配器模式.新能源发动机实战.impl;

import 设计模式.结构型模式.适配器模式.新能源发动机实战.ElectricMotor;
import 设计模式.结构型模式.适配器模式.新能源发动机实战.Motor;

/**
 * @Author: geek
 * @Date: 2020/9/29 22:36
 * @Description:
 */
public class ElectricAdapter implements Motor {

    private ElectricMotor electricMotor;

    public ElectricAdapter() {
        this.electricMotor = new ElectricMotor();
    }

    @Override
    public void drive() {
        electricMotor.electricDrive();
    }
}
