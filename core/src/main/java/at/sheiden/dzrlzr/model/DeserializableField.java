package at.sheiden.dzrlzr.model;


public class DeserializableField {

    private int startIndex;
    private int length;
    private String paddingCharacter;
    private Align align;

    public DeserializableField(int startIndex, int length, String paddingCharacter, Align align) {
        this.startIndex = startIndex;
        this.length = length;
        this.paddingCharacter = paddingCharacter;
        this.align = align;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public int getLength() {
        return length;
    }

    public String getPaddingCharacter() {
        return paddingCharacter;
    }

    public Align getAlign() {
        return align;
    }
}
