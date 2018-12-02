package at.technikum.wien.mse.swe.model;

import at.sheiden.dzrlzr.model.Align;
import at.sheiden.dzrlzr.model.FixedWidthPrimitive;

public class DepotOwner {


    @FixedWidthPrimitive(startIndex = 82, paddingCharacter = " ", length = 30, align = Align.RIGHT)
    private String firstname;

    @FixedWidthPrimitive(startIndex = 52, align = Align.RIGHT, length = 30, paddingCharacter = "")
    private String lastname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
