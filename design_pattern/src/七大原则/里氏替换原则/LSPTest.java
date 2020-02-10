package 七大原则.里氏替换原则;

/**
 * @author : Jeffersonnn
 * @date : 2020/2/10
 * @description :
 * 里氏替换原则：
 *      子类继承父类时，除添加新的方法完成新增功能外，尽量不要重写父类的方法。
 * 示例：
 *      鸟一般都会飞行，如燕子的飞行速度大概是每小时 120 千米。
 *      但是新西兰的几维鸟由于翅膀退化无法飞行。
 *      假如要设计一个实例，计算这两种鸟飞行 300 千米要花费的时间。
 *      显然，拿燕子来测试这段代码，结果正确，能计算出所需要的时间；
 *      但拿几维鸟来测试，结果会发生“除零异常”或是“无穷大”，明显不符合预期
 *
 * 原因分析：
 *      几维鸟类重写了鸟类的 setSpeed(double speed) 方法，这违背了里氏替换原则
 * 解决方案：
 *      取消几维鸟原来的继承关系，定义鸟和几维鸟的更一般的父类，如动物类，它们都有奔跑的能力。
 *      几维鸟的飞行速度虽然为 0，但奔跑速度不为 0，可以计算出其奔跑 300 千米所要花费的时间
 */
public class LSPTest {

    public static void main(String[] args) {
        Bird bird1=new Swallow();
        Bird bird2=new BrownKiwi();
        bird1.setSpeed(120);
        bird2.setSpeed(120);
        System.out.println("如果飞行300公里：");
        try {
            System.out.println("燕子将飞行"+bird1.getFlyTime(300)+"小时.");
            System.out.println("几维鸟将飞行"+bird2.getFlyTime(300)+"小时。");
        }
        catch (Exception err){
            System.out.println("发生错误了!");
        }
    }
}
