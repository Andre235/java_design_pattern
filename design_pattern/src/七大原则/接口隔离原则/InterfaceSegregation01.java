package 七大原则.接口隔离原则;

/**
 * @author : 赵静超
 * @date Date : 2019/10/13 17:51
 * @description : 七大原则.接口隔离原则：一个类对另一个类的依赖应该建立在最小接口基础上进行
 */
public class InterfaceSegregation01 {
    public static void main(String[] args) {

    }

}

interface  interface1{
    void fun1();
    void fun2();
    void fun3();
    void fun4();
    void fun5();
}

class B implements interface1{

    @Override
    public void fun1() {
        System.out.println("Class A实现了fun1()");
    }

    @Override
    public void fun2() {
        System.out.println("Class A实现了fun2()");
    }

    @Override
    public void fun3() {
        System.out.println("Class A实现了fun3()");
    }

    @Override
    public void fun4() {
        System.out.println("Class A实现了fun4()");
    }

    @Override
    public void fun5() {
        System.out.println("Class A实现了fun5()");
    }
}

class D implements interface1{

    @Override
    public void fun1() {
        System.out.println("Class B实现了fun1()");
    }

    @Override
    public void fun2() {
        System.out.println("Class B实现了fun2()");
    }

    @Override
    public void fun3() {
        System.out.println("Class B实现了fun3()");
    }

    @Override
    public void fun4() {
        System.out.println("Class B实现了fun4()");
    }

    @Override
    public void fun5() {
        System.out.println("Class B实现了fun5()");
    }
}

class A {
    public void dependency1(interface1 i){
        i.fun1();
    }
    public void dependency2(interface1 i){
        i.fun2();
    }
    public void dependency3(interface1 i){
        i.fun3();
    }
}

class C {
    public void dependency1(interface1 i){
        i.fun1();
    }
    public void dependency4(interface1 i){
        i.fun4();
    }
    public void dependency5(interface1 i){
        i.fun5();
    }
}