package 设计模式.创建型模式.建造者模式.builder.impl;


import 设计模式.创建型模式.建造者模式.builder.Builder;

/**
 * @Author: geek
 * @Date: 2020/9/26 16:38
 * @Description: 研发
 */
public class ABuilder implements Builder {

    @Override
    public void buildCPU() {
        computer.setCPU("Intel i7 CPU");
    }

    @Override
    public void buildVideoCard() {
        computer.setVideoCard("英伟达2080Ti显卡");
    }

    @Override
    public void buildRAM() {
        computer.setRAM("金士顿16G内存条");
    }
}
