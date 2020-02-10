package 七大原则.接口隔离原则;

/**
 * @author : 赵静超
 * @date Date : 2019/10/13 17:51
 * @description : 七大原则.接口隔离原则：一个类对另一个类的依赖应该建立在最小接口基础上进行
 */
public class InterfaceSegregation02 {
    public static void main(String[] args) {
        A1 a1 = new A1();
        B1 b1 = new B1();
        a1.dependency1(b1);
        a1.dependency2(b1);
        a1.dependency3(b1);

        C1 c1 = new C1();
        D1 d1 = new D1();
        c1.dependency1(d1);
        c1.dependency4(d1);
        c1.dependency5(d1);
    }

}

interface  Interface1{
    void fun1();

}
interface Interface2{
    void fun2();
    void fun3();
}
interface Interface3{
    void fun4();
    void fun5();
}

class B1 implements Interface1,Interface2{

    @Override
    public void fun1() {
        System.out.println("Class B1实现了fun1()");
    }

    @Override
    public void fun2() {
        System.out.println("Class B1实现了fun2()");
    }

    @Override
    public void fun3() {
        System.out.println("Class B1实现了fun3()");
    }

}

class D1 implements Interface1,Interface3{

    @Override
    public void fun1() {
        System.out.println("Class D1实现了fun1()");
    }

    @Override
    public void fun4() {
        System.out.println("Class D1实现了fun4()");
    }

    @Override
    public void fun5() {
        System.out.println("Class D1实现了fun5()");
    }
}

class A1 {
    public void dependency1(Interface1 i){
        i.fun1();
    }
    public void dependency2(Interface2 i){
        i.fun2();
    }
    public void dependency3(Interface2 i){
        i.fun3();
    }
}

class C1 {
    public void dependency1(Interface1 i){
        i.fun1();
    }
    public void dependency4(Interface3 i){
        i.fun4();
    }
    public void dependency5(Interface3 i){
        i.fun5();
    }
}