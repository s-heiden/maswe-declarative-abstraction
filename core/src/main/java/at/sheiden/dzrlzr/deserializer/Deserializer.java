package at.sheiden.dzrlzr.deserializer;

import at.sheiden.dzrlzr.model.AnnotationProperty;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Path;
import java.util.List;

public class Deserializer<T> {

    private static final String setterPrefix = "set";
    private Class<T> type;
    private List<AnnotationProperty> annotationProperties;

    public Deserializer(Class<T> type) {
        this.type = type;
        this.annotationProperties = (new AnnotationPropertyExtractor<T>())
                .getAnnotationProperties(type);
    }

    public T deserialize(Path path) throws IOException, IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        String fileContent = FileReader.getFileContent(path);
        return mapFileContentToObject(fileContent);
    }

    private T mapFileContentToObject(String fileContent) throws InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        T object = type.newInstance();
        for (AnnotationProperty annotationProperty : annotationProperties) {
            invokeSetter(object, annotationProperty, fileContent);
        }
        return object;
    }

    private void invokeSetter(T object, AnnotationProperty aP, String fileContent) throws NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        String memberName = aP.memberName;
        Field field = type.getDeclaredField(memberName);
        Class fieldType = field.getType();

        Object value = StringExtractor.extract(
                fileContent,
                aP.startIndex,
                aP.length,
                aP.align,
                aP.paddingCharacter
        );

        Method setter = type.getMethod(deriveSetterName(memberName), fieldType);
        setter.invoke(object, fieldType.cast(value));
    }

    private String deriveSetterName(String memberName) {
        String head = memberName.substring(0, 1);
        String tail = memberName.substring(1);
        return setterPrefix + head.toUpperCase() + tail;
    }

}
