package at.sheiden.dzrlzr.deserializer;

import at.sheiden.dzrlzr.model.AnnotationProperty;

import java.net.URI;
import java.util.List;

public class Deserializer<T> {

    private Class<T> type;
    private URI uri;

    private List<AnnotationProperty> annotationProperties;

    public Deserializer(Class<T> type, URI uri) {
        this.type = type;
        this.uri = uri;
        PropertyExtractor extractor = new PropertyExtractor();
        this.annotationProperties = extractor.getAnnotationProperties(type);
    }

    public T deserialize() throws IllegalAccessException, InstantiationException {
        // TODO: for each element take the field and parse the
        return type.newInstance();
    }

}
