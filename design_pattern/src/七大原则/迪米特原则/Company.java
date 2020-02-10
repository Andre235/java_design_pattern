package 七大原则.迪米特原则;

/**
 * @author : Jeffersonnn
 * @date : 2020/2/10
 * @description : 媒体公司
 */
public class Company {

    private String name;
    Company(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
}
