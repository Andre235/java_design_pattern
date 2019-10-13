package demo03DependencyInversion;

/**
 * @author : 赵静超
 * @date Date : 2019/10/13 22:12
 * @description : 依赖倒转原则
 *                方式1分析：
 *                      如果person需要接收微信、qq消息，则需要新建类。person类强依赖于Email类
 *                解决方案：新建一个接口IReceive用来接收消息，这用person类和接口产生依赖关系，这样符合依赖倒转原则
 */
public class Inversion02 {
    public static void main(String[] args) {
        Person1 person = new Person1();
        person.receive(new Email1());
        person.receive(new Wechat());
    }
}

interface IReceive{
    String getInfo();
}

class Email1 implements IReceive{
    public String getInfo(){
        return "Email:hello email!";
    }
}

class Wechat implements IReceive{

    @Override
    public String getInfo() {
        return "Wechat:hello Wechat!";
    }
}

/**
 * person类实现接收微信、邮件、qq等消息
 */
class Person1{
    void receive(IReceive receive){
        System.out.println(receive.getInfo());
    }
}
