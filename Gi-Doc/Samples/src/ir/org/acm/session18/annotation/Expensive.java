package ir.org.acm.session18.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Expensive {

     int value() default 0;

}
