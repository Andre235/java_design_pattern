package 设计模式.结构型模式.适配器模式.新能源发动机实战.impl;

import 设计模式.结构型模式.适配器模式.新能源发动机实战.Motor;
import 设计模式.结构型模式.适配器模式.新能源发动机实战.OpticalMotor;

/**
 * @Author: geek
 * @Date: 2020/9/29 22:38
 * @Description:
 */
public class OpticalAdapter implements Motor {

    private OpticalMotor opticalMotor;

    public OpticalAdapter() {
        this.opticalMotor = new OpticalMotor();
    }

    @Override
    public void drive() {
        opticalMotor.opticalDrive();
    }
}
