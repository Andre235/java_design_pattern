package 设计模式.结构型模式.代理模式;

/**
 * @Author: geek
 * @Date: 2020/9/28 22:03
 * @Description:
 */
public class Proxy implements Subject{

    private RealSubject realSubject;

    @Override
    public void request() {
        if(realSubject == null){
            this.realSubject = new RealSubject();
        }
        preRequest();
        realSubject.request();
        postRequest();
    }

    private void preRequest(){
        System.out.println("前置处理方法...");
    }

    private void postRequest(){
        System.out.println("后置处理方法...");
    }

}
