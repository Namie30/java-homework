package ge.tbc.testautomation.annotationsAndStreams;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;

@Target(ElementType.FIELD)  // only fields
@Retention(RetentionPolicy.RUNTIME)

public @interface VariableNameAnnotation {
    String name() default "Default Value";
}
