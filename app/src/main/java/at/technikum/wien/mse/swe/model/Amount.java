package at.technikum.wien.mse.swe.model;


import at.sheiden.dzrlzr.model.Align;
import at.sheiden.dzrlzr.model.FixedWidthPrimitive;

import java.math.BigDecimal;

public class Amount {

    @FixedWidthPrimitive(paddingCharacter = "", length = 3, align = Align.LEFT, startIndex = 112)
    private String currency;

    @FixedWidthPrimitive(paddingCharacter = "", startIndex = 115, length = 17, align = Align.RIGHT)
    private BigDecimal value;

    public Amount(String currency, BigDecimal value) {
        this.currency = currency;
        this.value = value;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
