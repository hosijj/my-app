package ir.org.acm.session19.weld.hello2;

import javax.inject.Inject;

public class HelloService {
    
    @Inject @English
    private LanguageInterface lang;
    
    public String sayHello(String name) {
        return lang.sayHello() + " " + name;
    }

}
