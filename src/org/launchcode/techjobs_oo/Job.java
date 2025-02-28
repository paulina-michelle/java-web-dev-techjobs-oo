package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job (String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        String emptyFieldMessage = "Data not available";
        String returnedName;
        String returnedEmployer;
        String returnedLocation;
        String returnedPositionType;
        String returnedCoreCompetency;

        if (getName() == null) {
            returnedName = emptyFieldMessage;
        }
        else {
            returnedName = getName();
        }


        if (getEmployer() == null) {
            returnedEmployer = emptyFieldMessage;
        }
        else {
            returnedEmployer = getEmployer().toString();
        }


        if (getLocation() == null) {
            returnedLocation = emptyFieldMessage;
        }
        else {
            returnedLocation = getLocation().toString();
        }


        if (getPositionType() == null) {
            returnedPositionType = emptyFieldMessage;
        }
        else {
            returnedPositionType = getPositionType().toString();
        }


        if (getCoreCompetency() == null) {
            returnedCoreCompetency = emptyFieldMessage;
        }
        else {
            returnedCoreCompetency = getCoreCompetency().toString();
        }


        return "\n" +
           "ID: " + getId() +
           "\nName: " + returnedName +
           "\nEmployer: " + returnedEmployer +
           "\nLocation: " + returnedLocation +
           "\nPosition Type: " + returnedPositionType +
           "\nCore Competency: " + returnedCoreCompetency
           + "\n";
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

    public int getId() {
        return id;
    }

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
