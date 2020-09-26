package 设计模式.创建型模式.工厂方法模式.factory;

import 设计模式.创建型模式.工厂方法模式.product.Product;

/**
 * @Author: 赵静超
 * @Date: 2020/9/26 13:27
 * @Description:
 */
public interface Factory {
    Product makeProduct();
}
