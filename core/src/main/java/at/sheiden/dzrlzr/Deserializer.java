package at.sheiden.dzrlzr;

import java.net.URI;
import java.util.List;

public class Deserializer<T> {

    private List<DeserializableField> deserializableFields ;

    public Deserializer(Object annotatedModel, URI uri) {
        DeserializableFieldExtractor extractor = new DeserializableFieldExtractor();
        this.deserializableFields = extractor.getDeserializableFields(annotatedModel);
    }

    public T deserialize() {
        // TODO: for each element take the field and parse the
        return "Marf";
    }

}
