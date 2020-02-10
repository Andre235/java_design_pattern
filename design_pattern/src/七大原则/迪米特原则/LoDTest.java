package 七大原则.迪米特原则;

/**
 * @author : Jeffersonnn
 * @date : 2020/2/10
 * @description : 迪米特原则
 * 说明：
 *      如果两个软件实体无须直接通信，那么就不应当发生直接的相互调用，
 *      可以通过第三方转发该调用。
 *      其目的是降低类之间的耦合度，提高模块的相对独立性。
 * 案例：
 *      明星由于全身心投入艺术，所以许多日常事务由经纪人负责处理，
 *      如与粉丝的见面会，与媒体公司的业务洽淡等。
 *      这里的经纪人是明星的朋友，而粉丝和媒体公司是陌生人，所以适合使用迪米特法则，
 */
public class LoDTest {

    public static void main(String[] args) {
        Agent agent = new Agent();
        agent.setStar(new Star("张艺兴"));
        agent.setFans(new Fans("小绵羊粉丝"));
        agent.setCompany(new Company("阿里传媒有限公司"));
        agent.meeting();
        agent.business();
    }
}
