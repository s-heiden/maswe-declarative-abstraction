package at.sheiden.dzrlzr.deserializer;


import at.sheiden.dzrlzr.model.AnnotationProperty;
import at.sheiden.dzrlzr.model.FixedWidthField;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class PropertyExtractor<T> {

    public List<AnnotationProperty> getAnnotationProperties(Class<T> objectClass) {

        List<AnnotationProperty> fields = new ArrayList<>();

        for (Field field : objectClass.getDeclaredFields()) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(FixedWidthField.class)) {
                fields.add(new AnnotationProperty(
                                field.getAnnotation(FixedWidthField.class).startIndex(),
                                field.getAnnotation(FixedWidthField.class).length(),
                                field.getAnnotation(FixedWidthField.class).paddingCharacter(),
                                field.getAnnotation(FixedWidthField.class).align()
                        )
                );
            }
        }
        return fields;

    }
}
