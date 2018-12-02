package at.sheiden.dzrlzr.model;


public class AnnotationProperty {

    public final int startIndex;
    public final int length;
    public final String paddingCharacter;
    public final Align align;
    public final String memberName;

    public AnnotationProperty(String memberName, int startIndex, int length, String paddingCharacter, Align align) {
        this.memberName = memberName;
        this.startIndex = startIndex;
        this.length = length;
        this.paddingCharacter = paddingCharacter;
        this.align = align;
    }
}
