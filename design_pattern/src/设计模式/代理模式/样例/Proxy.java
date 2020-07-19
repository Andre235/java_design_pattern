package 设计模式.代理模式.样例;

/**
 * @Author: 赵静超
 * @Date: 2020/7/19 10:01
 * @Description: 代理类，代理类包含对真实主题类的调用
 */
public class Proxy {

    //关联关系
    private RealSubject realSubject;

    public void request(){
        if(realSubject == null){
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.request();
        postRequest();
    }

    private void preRequest(){
        System.out.println("访问真实主题之前预处理方法...");
    }

    private void postRequest(){
        System.out.println("访问真实主题之后的后续处理方法...");
    }
}
