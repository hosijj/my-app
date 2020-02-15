package ir.org.acm.session19.spring.lookup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    
    public static void main(String[] args) {

        String path = "classpath:/ir/org/acm/session19/spring/lookup/context1.xml";

        ApplicationContext ctx = new ClassPathXmlApplicationContext(path);

        ITransfer transfer = (ITransfer) ctx.getBean("bank");
        
        transfer.transfer(111, 100);
        
    }
    
}
