import demo.ServiceInterface;
import demo.newWay.ServiceInterfaceImplNewWay;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        final ServiceInterface serviceNewWay = new ServiceInterfaceImplNewWay();

        serviceNewWay.doThings();

        System.out.println(serviceNewWay.getClass().getCanonicalName());

    }

}
