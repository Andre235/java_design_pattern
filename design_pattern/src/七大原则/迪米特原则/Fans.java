package 七大原则.迪米特原则;

/**
 * @author : Jeffersonnn
 * @date : 2020/2/10
 * @description : 粉丝
 */
public class Fans {

    private String name;
    Fans(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
}
