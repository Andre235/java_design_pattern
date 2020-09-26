package 设计模式.创建型模式.原型模式.深拷贝;

import java.io.*;

/**
 * @Author: 赵静超
 * @Date: 2020/9/26 10:05
 * @Description:
 */
public class Book implements Serializable {
    private String bookName;
    private double price;
    private Author author;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Book deepClone() throws IOException, ClassNotFoundException {
        //将当前对象写入到二进制流中(输出一个二进制流)
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);

        //读取二进制流，产生一个新的对象
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        return (Book) objectInputStream.readObject();
    }

    public Book(String bookName, double price, Author author) {
        this.bookName = bookName;
        this.price = price;
        this.author = author;
    }
}
