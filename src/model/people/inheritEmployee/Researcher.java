package model.people.inheritEmployee;

import model.people.enums.Education;
import model.people.inheritPerson.Employee;
import model.people.enums.Position;

public class Researcher extends Employee {

    private String qualification;
    public static int countResearch=0;

    public Researcher (String name, int birthYear, String telNumber, String address, Education education,
                       Position position, int hours, double rate, String qualification){
        super(name, birthYear, telNumber, address, education, position, hours, rate);
        this.qualification=qualification;
        countResearch++;
    }


    public String getQualification() {
        return qualification;
    }
}
