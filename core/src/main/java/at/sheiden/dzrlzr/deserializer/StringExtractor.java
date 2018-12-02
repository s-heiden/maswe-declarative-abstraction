package at.sheiden.dzrlzr.deserializer;

import at.sheiden.dzrlzr.model.Align;

import static org.apache.commons.lang.StringUtils.stripEnd;
import static org.apache.commons.lang.StringUtils.stripStart;

class StringExtractor {

    static Object extract(String fileContent, int startIndex, int length, Align align, String paddingCharacter) {
        fileContent = cropped(fileContent, startIndex, length);
        fileContent = withoutPadding(fileContent, align, paddingCharacter);
        return fileContent;
    }

    private static String cropped(String fileContent, int startIndex, int length) {
        return fileContent.substring(startIndex, startIndex + length);
    }

    private static String withoutPadding(String fileContent, Align align, String paddingCharacter) {
        if (align == Align.LEFT) {
            fileContent = stripEnd(fileContent, paddingCharacter);
        } else if (align == Align.RIGHT) {
            fileContent = stripStart(fileContent, paddingCharacter);
        }
        return fileContent;
    }
}
