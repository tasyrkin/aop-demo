package demo.newWay;

import demo.ServiceInterface;
import org.springframework.stereotype.Component;

@Component("serviceNewWay")
public class ServiceInterfaceImplNewWay implements ServiceInterface {

    public void doThings() {
        //BUSINESS LOGIC
        System.out.println("doing lots of stuff");
    }
}
