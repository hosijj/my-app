
package ir.org.acm.session19.weld.hello;

import javax.inject.Inject;

public class HelloService {
    
    @Inject
    private Language lang;
    
    public String sayHello(String name) {
        return lang.sayHello() + " " + name;
    }

}
