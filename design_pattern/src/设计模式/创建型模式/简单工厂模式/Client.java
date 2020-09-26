package 设计模式.创建型模式.简单工厂模式;

import 设计模式.创建型模式.简单工厂模式.constant.Const;
import 设计模式.创建型模式.简单工厂模式.factory.SimpleFactory;
import 设计模式.创建型模式.简单工厂模式.product.Product;

import java.text.SimpleDateFormat;

/**
 * @Author: 赵静超
 * @Date: 2020/9/26 11:03
 * @Description:
 */
public class Client {
    public static void main(String[] args) throws Exception {

        //客户端想要创建产品B
        Product product = SimpleFactory.makeProduct(Const.B);
        product.show();
    }
}
