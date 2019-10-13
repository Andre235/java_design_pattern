package demo01SingleResponsibility;

/**
 * @author : 赵静超
 * @date Date : 2019/10/13 16:32
 * @description : 设计模式之单一职责模式 方案1
 */
public class SingleResponsibility01 {
    public static void main(String[] args) {
        Vehicle Vehicle = new Vehicle();
        Vehicle.run("汽车");
        Vehicle.run("飞机");
        Vehicle.run("游艇");
    }
}

/**
 * 方式1问题：这种写法违反了单一职责原则(一个类只负责一项职责)
 * 解决方案：将不同职责拆分成多个类进行优化
 */
class Vehicle{
    void run(String vehicle){
        System.out.println(vehicle+"在公路上运行......");
    }
}
