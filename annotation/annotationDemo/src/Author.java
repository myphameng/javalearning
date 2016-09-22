import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Author {
	String fullName = "Pham Thanh My";
	String nation() default "Vietnam";
	String lastChanged();
}
