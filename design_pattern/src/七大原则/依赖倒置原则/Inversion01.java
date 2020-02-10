package 七大原则.依赖倒置原则;

/**
 * @author : 赵静超
 * @date Date : 2019/10/13 22:12
 * @description : 依赖倒转原则
 *                方式1分析：
 *                      如果person需要接收微信、qq消息，则需要新建类。person类强依赖于Email类
 *                解决方案：新建一个接口IReceive用来接收消息，这用person类和接口产生依赖关系，这样符合依赖倒转原则
 */
public class Inversion01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email{
    String getInfo(){
        return "Email:hello world!";
    }
}

/**
 * person类实现接收微信、邮件、qq等消息
 */
class Person{
    void receive(Email email){
        System.out.println(email.getInfo());
    }
}
