package edu.grcy.person;

public enum Gender {
    MALE("male"),
    FEMALE("female");

    private String name;

    Gender(String name) {
        this.name = name;
    }

    public static Gender fromName(String name) {
        for (Gender each : Gender.values()) {
            if (each.name.equals(name)) {
                return each;
            }
        }
        return null;
    }
}
