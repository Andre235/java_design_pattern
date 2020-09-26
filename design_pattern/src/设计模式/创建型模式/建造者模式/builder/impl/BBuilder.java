package 设计模式.创建型模式.建造者模式.builder.impl;


import 设计模式.创建型模式.建造者模式.builder.Builder;

/**
 * @Author: geek
 * @Date: 2020/9/26 16:38
 * @Description:
 */
public class BBuilder implements Builder {

    @Override
    public void buildCPU() {
        computer.setCPU("Intel i9 CPU");
    }

    @Override
    public void buildVideoCard() {
        computer.setVideoCard("英伟达3060Ti显卡");
    }

    @Override
    public void buildRAM() {
        computer.setRAM("三星32G内存条");
    }
}
