package model.people;

import model.people.enums.Education;
import model.people.enums.Position;
import service.PeopleInfo;

import java.util.Collections;

public class Employee extends Person  {

    private double rate;
    private int hours;
    public static int countEmp=0;
    public static int totalHours;
    Position position;
    Education education;


    public Employee (){                             // default constructor
        countEmp++ ;
        totalHours += hours;
    }

    public Employee (String name, int birthYear, String telNumber, String address, Education education, Position position, int hours, double rate){   // five variables constructor with Enum
        super(name, birthYear, telNumber, address);
        this.education=education;
        this.position = position;
        this.rate = rate;
        this.hours = hours;
        countEmp++;
        totalHours += hours;                      // Total employees-hours a day calculation
    }


    public void setRate(double rate){this.rate = rate; }
    public void setHours(int hours){ this.hours = hours;}


    public Education getEducation (){return education;}
    public Position getPosition (){return position;}
    public double getRate (){return rate;}
    public int getHours (){return hours;}

    public static int getCountEmp(){
        return countEmp;
    }

    @Override
    public void changeTelNumber(String telNumber) {
        this.telNumber=telNumber;
    }

    @Override
    public void changeAddress(String address) {
        this.address=address;
    }

    public void changeRate (double newRate){    // hourly rate change
        rate = newRate;
    }

    public double Salary () {                         // salary a day calculation (without bonuses)
        double sl = this.rate * this.hours;
        return sl;
    }

    public double bonusSalary (int bonus){          // payrise because of bonuses [int bonus]=[%]
        double bon = bonus * this.Salary()/100 + this.Salary();
        return bon;
    }

    public String toString() {
        return position+" "+super.toString() ;
    }

    public boolean equals(Object obj) {     // Overrides equals method if employees have the same parameters
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(getClass() == obj.getClass())) return false;
        else {
            Employee tmp = (Employee) obj;
            if (tmp.name == this.name && tmp.birthYear == this.birthYear) return true;
            else return false;
        }
    }



}
