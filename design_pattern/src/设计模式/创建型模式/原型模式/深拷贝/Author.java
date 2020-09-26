package 设计模式.创建型模式.原型模式.深拷贝;

import java.io.Serializable;

/**
 * @Author: 赵静超
 * @Date: 2020/9/26 10:12
 * @Description:
 */
public class Author implements Serializable {
    private String authorName;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Author(String authorName) {
        this.authorName = authorName;
    }
}
