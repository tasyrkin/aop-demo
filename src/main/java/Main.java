import demo.ServiceInterface;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        final ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");

        final ServiceInterface serviceOldWay = (ServiceInterface)ctx.getBean("serviceOldWay");
        serviceOldWay.doThings();

        final ServiceInterface serviceNewWay = (ServiceInterface)ctx.getBean("serviceNewWay");
        serviceNewWay.doThings();
    }

}
