package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Employer extends JobField {

//    private int id;
//    private static int nextId = 1;
//    private String value;
    // REMOVED AFTER ABSTRACT CLASS CREATED

    /** Constructors **/

    // First constructor sets employer ID. Never called on its own, but generally from inside another constructor.
//    public Employer() {
//        id = nextId;
//        nextId++;
//    } // REMOVED AFTER ABSTRACT CLASS CREATED

//    public Employer(String value) {
//        this(); // Calls the first constructor to get the ID.
//        this.value = value;
//    } // REMOVED AFTER ABSTRACT CLASS CREATED

    public Employer(String value) {
        super(value);
    }

//    /** Custom toString, equals, and hashCode methods: **/

    // REMOVED AFTER ABSTRACT CLASS CREATED
//
//    @Override
//    public String toString() {
//        return value;
//    }
//
//    @Override
//    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
//        if (this == o) return true;
//        if (!(o instanceof Employer)) return false;
//        Employer employer = (Employer) o;
//        return getId() == employer.getId();
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId());
//    }

//    /** Getters and Setters: **/

    // REMOVED AFTER ABSTRACT CLASS CREATED
//
//    public int getId() {
//        return id;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }

}
