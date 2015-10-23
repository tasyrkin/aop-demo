import demo.ServiceInterface;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        final ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");

        final ServiceInterface serviceOldWay = (ServiceInterface)ctx.getBean("serviceOldWay");
        serviceOldWay.doThings();

        System.out.println(String.format("Real class for serviceOldWay: %s", serviceOldWay.getClass().getCanonicalName()));

        final ServiceInterface serviceNewWay = (ServiceInterface)ctx.getBean("serviceNewWay");
        serviceNewWay.doThings();

        System.out.println(String.format("Real class for serviceNewWay: %s", serviceNewWay.getClass().getCanonicalName()));
    }

}
