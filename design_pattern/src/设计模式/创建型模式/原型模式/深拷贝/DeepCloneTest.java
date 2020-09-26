package 设计模式.创建型模式.原型模式.深拷贝;

import java.io.IOException;

/**
 * @Author: 赵静超
 * @Date: 2020/9/26 10:06
 * @Description:
 */
public class DeepCloneTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Author andre = new Author("冰心");
        Book book1 = new Book("冰心儿童文学选集", 39.0, andre);
        Book book2 = book1.deepClone();

        System.out.println("book1地址：" + System.identityHashCode(book1));
        System.out.println("book2地址：" + System.identityHashCode(book2));

        System.out.println("book1的author地址：" + System.identityHashCode(book1.getAuthor()));
        System.out.println("book2的author地址：" + System.identityHashCode(book2.getAuthor()));

        System.out.println("book1的bookName地址：" + System.identityHashCode(book1.getBookName()));
        System.out.println("book2的bookName地址：" + System.identityHashCode(book2.getBookName()));

        System.out.println("book1的price地址：" + System.identityHashCode(book1.getPrice()));
        System.out.println("book2的price地址：" + System.identityHashCode(book2.getPrice()));
    }
}
