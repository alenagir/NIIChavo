package model.people.implEmployee;

import model.people.Education;
import model.people.Position;

public class TechStaff {
    private String department;
    public static int countTechStaff=0;

    public TechStaff(String name, int birthYear, String telNumber, String address, Education education,
                     Position position, int hours, double rate, String department){
        this.department=department;
        countTechStaff++;
    }
    public String toString() {
        return super.toString() + " " + department;
    }
}
