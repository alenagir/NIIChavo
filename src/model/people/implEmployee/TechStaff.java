package model.people.implEmployee;

import model.people.Education;
import model.people.Employee;
import model.people.Position;

public class TechStaff extends Employee {
    private String department;
    public static int countTechStaff=0;

    public TechStaff(String name, int birthYear, String telNumber, String address, Education education,
                     Position position, int hours, double rate, String department){
        super(name, birthYear, telNumber, address, education, position, hours, rate);
        this.department=department;
        countTechStaff++;
    }
    
    public String getDepartment() {
        return department;
    }
}
