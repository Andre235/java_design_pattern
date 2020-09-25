package 设计模式.创建型模式.原型模式;

/**
 * @Author: 赵静超
 * @Date: 2020/9/25 21:33
 * @Description: 具体原型类
 */
public class RealizeType implements Cloneable{

    private String name = "andre";

    private int age = 20;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    RealizeType(){
        System.out.println("具体原型创建成功");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功");
        return super.clone();
    }
}
