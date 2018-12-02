package at.technikum.wien.mse.swe.model;

import at.sheiden.dzrlzr.model.Align;
import at.sheiden.dzrlzr.model.FixedWidthPrimitive;

import java.util.Arrays;
import java.util.Optional;

public enum RiskCategory {

    NON_EXISTING("00"),
    EXECUTION_ONLY("01"),
    LOW("02"),
    MIDDLE("04"),
    HIGH("06"),
    SPECULATIVE("08");

    @FixedWidthPrimitive(align = Align.LEFT, length = 2, paddingCharacter = "", startIndex = 50)
    private final String code;

    RiskCategory(String code) {
        this.code = code;
    }

    public static Optional<RiskCategory> fromCode(String code){
        return Arrays.stream(values()).filter(rc -> rc.code.equalsIgnoreCase(code)).findFirst();
    }
}
