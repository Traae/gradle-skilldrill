package edu.isu.cs.cs2263;

import java.util.LinkedList;

public class student {
    // variables
    private String firstname;
    private String lastname;
    private LinkedList<course> enrolledCourses;

    //methods

    public student(){

    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return firstname + " " + lastname;
    }
}
