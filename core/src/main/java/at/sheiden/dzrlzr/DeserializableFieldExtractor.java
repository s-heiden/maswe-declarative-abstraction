package at.sheiden.dzrlzr;


import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.requireNonNull;

public class DeserializableFieldExtractor {

    public List<DeserializableField> getDeserializableFields(Object object) {

        Class<?> objectClass = requireNonNull(object).getClass();
        List<DeserializableField> fields = new ArrayList<>();

        for (Field field : objectClass.getDeclaredFields()) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(FixedWidthField.class)) {
                fields.add(new DeserializableField(
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
