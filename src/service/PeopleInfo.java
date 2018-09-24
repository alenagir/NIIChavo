package service;

import model.people.Employee;
import model.people.Person;

import java.util.*;


public class PeopleInfo <T extends Person> {

    private List<T> peopleList;
    private T infoShow;
    private String gatherInfo []= new String[Employee.countEmp];

    public PeopleInfo() {
        peopleList = new ArrayList<T>();
    }

    public void addPeopleInfo(T person) {
        peopleList.add(person);
    }

    @Override
    public String toString() {
        return "peopleList= " + peopleList;
    }

    // iterates PeopleInfo list to print line by line
    public void print() {
        Iterator it = peopleList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    // Gets full information about the person  by person's name

    public T getFullPersonInfo(String name){
        Iterator <T> it = peopleList.iterator();
        while (it.hasNext()) {
            infoShow=it.next();
            if (infoShow.getName().equals(name)) break;
        }return infoShow;
    }
    // Gets telephone number by person's name
    public String getPersonalTelNumber(String name){
        Iterator <T> it = peopleList.iterator();
        while (it.hasNext()) {
            infoShow=it.next();
            if (infoShow.getName().equals(name)) break;
        }return infoShow.getTelNumber();
    }

    // Gets person's name by  telephone number
    public  String getPersonNameByPhone(String telNumber){
        Iterator <T> it = peopleList.iterator();
        int counter =1;
        while (it.hasNext()) {
            infoShow=it.next();
            if (infoShow.getTelNumber().equals(telNumber))
                gatherInfo [counter]=infoShow.getName();
            if (infoShow.getTelNumber().regionMatches(10, telNumber, 0, 4))
                gatherInfo [counter]=infoShow.getName();
            counter++;
        }return Arrays.toString(gatherInfo);
    }
    // Prints the results of the getPersonNameByPhone method
    public void printNameByPhone(){
        for (int i=1; i<gatherInfo.length; i++) {
            if((gatherInfo[i]!=(gatherInfo[i-1])&&gatherInfo[i]!=null)) System.out.println(gatherInfo[i]);
        }
    }

    // Finds the oldest person




    // Overrides Comparator.compare to sort by name
    public static Comparator<Employee> COMPARE_BY_NAME = new Comparator<Employee>() {

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
}




