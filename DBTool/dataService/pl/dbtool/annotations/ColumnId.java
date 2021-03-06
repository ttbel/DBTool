package pl.dbtool.annotations;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(FIELD)
public @interface ColumnId {

	public enum GenerationType {
	   AUTO, SEQUENCE, OWN
	}
	
	GenerationType strategy();
	String name();
}
