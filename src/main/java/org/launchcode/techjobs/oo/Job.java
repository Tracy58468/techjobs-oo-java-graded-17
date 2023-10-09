package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    private String employerString = String.valueOf(employer);
    private String locationString = String.valueOf(location);
    private String positionTypeString = String.valueOf(positionType);
    private String coreCompetencyString = String.valueOf(coreCompetency);

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    /** Custom toString **/

    @Override
    public String toString() {

        if (getName() == "") {

            setName("Data not available");

        } else {

            setName(name);

        }

        if (getEmployer() == null) {

            employerString = "Data not available";

        } else {

            employerString = String.valueOf(employer);

        }

        if (getLocation() == null) {

            locationString = "Data not available";

        } else {

            locationString = String.valueOf(location);

        }

        if (getPositionType() == null) {

            positionTypeString = "Data not available";

        } else {

            positionTypeString = String.valueOf(positionType);

        }

        if (getCoreCompetency() == null) {

            coreCompetencyString = "Data not available";

        } else {

            coreCompetencyString = String.valueOf(coreCompetency);

        }

        return System.lineSeparator() +
                "ID: " + id +
                System.lineSeparator() +
                "Name: " + name +
                System.lineSeparator() +
                "Employer: " + String.valueOf(employer) +
                System.lineSeparator() +
                "Location: " + String.valueOf(location) +
                System.lineSeparator() +
                "Position Type: " + String.valueOf(positionType) +
                System.lineSeparator() +
                "Core Competency: " + String.valueOf(coreCompetency) +
                System.lineSeparator();

    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public static int getNextId() {
        return nextId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
