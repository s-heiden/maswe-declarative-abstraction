package at.sheiden.dzrlzr.deserializer;


import at.sheiden.dzrlzr.model.DeserializableField;
import at.sheiden.dzrlzr.model.FixedWidthField;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class DeserializableFieldExtractor<T> {

    public List<DeserializableField> getDeserializableFields(Class<T> objectClass) {

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
