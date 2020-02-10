package 七大原则.里氏替换原则;

/**
 * @author : Jeffersonnn
 * @date : 2020/2/10
 * @description :
 */
public class Bird {

    public double flySpeed;

    public void setSpeed(double speed)
    {
        this.flySpeed=speed;
    }
    public double getFlyTime(double distance)
    {
        return(distance/this.flySpeed);
    }
}
