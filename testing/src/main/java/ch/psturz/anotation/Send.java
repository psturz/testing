package ch.psturz.anotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

@Documented
@Inherited
@Retention( RetentionPolicy.RUNTIME )
@Target({ElementType.TYPE, ElementType.FIELD})
public @interface Send
{ 
    int order();
    Class<? extends  DataCreator> createData() default AbstractMode.Steps.class;
}
