package 设计模式.创建型模式.原型模式;

/**
 * @Author: 赵静超
 * @Date: 2020/9/25 21:36
 * @Description:
 */
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        RealizeType realizeType = new RealizeType();

        RealizeType realizeType2 = realizeType;

        System.out.println(System.identityHashCode(realizeType));
        System.out.println(System.identityHashCode(realizeType2));

        realizeType2.setName("ANDRE");
        System.out.println(realizeType2.getName());
        System.out.println(realizeType.getName());

        realizeType2.setAge(30);
        System.out.println(realizeType2.getAge());
        System.out.println(realizeType.getAge());

//        RealizeType realizeType1 = (RealizeType) realizeType.clone();
//
//        System.out.println(realizeType == realizeType1);
//        System.out.println(realizeType.equals(realizeType1));
//        System.out.println(realizeType.hashCode());
//        System.out.println(realizeType1.hashCode());
    }
}
