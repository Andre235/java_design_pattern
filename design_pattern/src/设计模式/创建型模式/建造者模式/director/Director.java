package 设计模式.创建型模式.建造者模式.director;

import 设计模式.创建型模式.建造者模式.builder.Builder;
import 设计模式.创建型模式.建造者模式.product.Computer;

/**
 * @Author: geek
 * @Date: 2020/9/26 16:46
 * @Description:
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Computer construct(){
        builder.buildCPU();
        builder.buildVideoCard();
        builder.buildRAM();
        return builder.getResult();
    }
}
