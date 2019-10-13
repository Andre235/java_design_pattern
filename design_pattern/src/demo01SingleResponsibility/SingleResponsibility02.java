package demo01SingleResponsibility;

/**
 * @author : 赵静超
 * @date Date : 2019/10/13 16:32
 * @description : 设计模式之单一职责模式 方案2
 */
public class SingleResponsibility02 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("汽车");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("游艇");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
    }
}

/**
 * 方案2分析：
 *      遵守单一职责原则
 *      但是开销比较大，拆分成三个不同的类，实例化出三个对象。还有对main()进行修改
 *      优化方案：直接修改Vehicle类，代码改动比较小
 */
class RoadVehicle{
    void run(String vehicle){
        System.out.println(vehicle+"在公路上运行......");
    }
}

class WaterVehicle{
    void run(String vehicle){
        System.out.println(vehicle+"在水上运行......");
    }
}

class AirVehicle{
    void run(String vehicle){
        System.out.println(vehicle+"在天空中运行......");
    }
}