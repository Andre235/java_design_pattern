package 七大原则.迪米特原则;

/**
 * @author : Jeffersonnn
 * @date : 2020/2/10
 * @description : 明星
 */
public class Star {
    private String name;
    Star(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
}
