package at.cyndergames.enums;

/**
 * Created by Minidodo on 25.06.2017.
 * <p>
 * #                          #
 * #   Copyright by Minidodo  #
 * #   and Scoocyjuice        #
 * #                          #
 */
public enum variablen {

    PREFIX("PREFIX"),
    PREFIX_LOADING("PREFIX_LOADING"),
    START("START"),
    STOPP("STOPP");
    private final String name;

    variablen(String s) {
        name = s;
    }

    public boolean equalsName(String otherName) {
        // (otherName == null) check is not needed because name.equals(null) returns false
        return name.equals(otherName);
    }

    public String toString() {
        return this.name;
    }
}
