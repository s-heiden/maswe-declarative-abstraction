package at.sheiden.dzrlzr.deserializer;

import at.sheiden.dzrlzr.model.DeserializableField;

import java.net.URI;
import java.util.List;

public class Deserializer<T> {

    private Class<T> type;
    private URI uri;

    private List<DeserializableField> deserializableFields;

    public Deserializer(Class<T> type, URI uri) {
        this.type = type;
        DeserializableFieldExtractor extractor = new DeserializableFieldExtractor();
        this.deserializableFields = extractor.getDeserializableFields(type);
    }

    public T deserialize() throws IllegalAccessException, InstantiationException {
        // TODO: for each element take the field and parse the
        return type.newInstance();
    }

}
