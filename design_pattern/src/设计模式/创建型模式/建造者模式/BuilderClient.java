package 设计模式.创建型模式.建造者模式;

import 设计模式.创建型模式.建造者模式.builder.impl.ABuilder;
import 设计模式.创建型模式.建造者模式.builder.impl.BBuilder;
import 设计模式.创建型模式.建造者模式.director.Director;
import 设计模式.创建型模式.建造者模式.product.Computer;

/**
 * @Author: geek
 * @Date: 2020/9/26 16:07
 * @Description:
 */
public class BuilderClient {
    public static void main(String[] args) {
        ABuilder builder = new ABuilder();
        BBuilder bBuilder = new BBuilder();
        Director director = new Director(bBuilder);
        Computer computer = director.construct();
        System.out.println(computer.toString());
    }
}
