package 设计模式.创建型模式.建造者模式.builder;

import 设计模式.创建型模式.建造者模式.product.Computer;

/**
 * @Author: geek
 * @Date: 2020/9/26 16:47
 * @Description:
 */
public interface Builder {
    Computer computer = new Computer();

    void buildCPU();
    void buildVideoCard();
    void buildRAM();

    //返回创建的产品对象
    default Computer getResult(){
        return this.computer;
    }
}
