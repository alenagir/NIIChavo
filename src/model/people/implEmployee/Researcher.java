package model.people.implEmployee;

import model.people.Education;
import model.people.Employee;
import model.people.Position;

public class Researcher extends Employee {

    private String qualification;
    public static int countResearch=0;

    public Researcher (String name, int birthYear, String telNumber, String address, Education education,
                       Position position, int hours, double rate, String qualification){
        super(name, birthYear, telNumber, address, education, position, hours, rate);
        this.qualification=qualification;
        countResearch++;
    }
    public String toString() {
        return super.toString() + " " + qualification;
    }
}
