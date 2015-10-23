package demo.oldWay;

import demo.ServiceInterface;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component("serviceOldWay")
public class ServiceInterfaceImplOldWay implements ServiceInterface {

    private static final Logger LOGGER = LogManager.getLogger(ServiceInterfaceImplOldWay.class);

    public void doThings() {
        long start = System.currentTimeMillis();
        LOGGER.info("Start demo.oldWay.ServiceInterfaceImplOldWay.doThings()");

        //BUSINESS LOGIC
        System.out.println("doing lots of stuff");

        LOGGER.info("End demo.oldWay.ServiceInterfaceImplOldWay.doThings()");
        LOGGER.info("doThings() took {}ms", System.currentTimeMillis() - start);
    }
}
