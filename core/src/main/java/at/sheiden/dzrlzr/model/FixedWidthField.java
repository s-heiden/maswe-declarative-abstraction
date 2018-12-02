package at.sheiden.dzrlzr.model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface FixedWidthField {
    int startIndex();
    int length();
    Align align();
    String paddingCharacter();
}
