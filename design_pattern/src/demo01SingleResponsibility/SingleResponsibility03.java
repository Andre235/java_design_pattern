package demo01SingleResponsibility;

/**
 * @author : 赵静超
 * @date Date : 2019/10/13 16:32
 * @description : 设计模式之单一职责模式 方案3
 */
public class SingleResponsibility03 {
    public static void main(String[] args) {
        Vehicle1 Vehicle = new Vehicle1();
        Vehicle.runRoad("汽车");
        Vehicle.runAir("飞机");
        Vehicle.runWater("游艇");
    }
}

/**
 *
 *
 */
class Vehicle1{
    void runRoad(String vehicle){
        System.out.println(vehicle+"在公路上运行......");
    }
    void runWater(String vehicle){
        System.out.println(vehicle+"在水中运行......");
    }
    void runAir(String vehicle){
        System.out.println(vehicle+"在空中运行......");
    }
}
