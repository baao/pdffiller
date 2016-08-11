package formfiller;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface FormField {
    String name();
    boolean isCheckBox() default false;
    String value() default "";
    String equalField() default "";
}
