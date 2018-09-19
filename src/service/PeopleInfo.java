package service;

import model.people.Employee;
import model.people.Person;

public class PeopleInfo <T extends Person> {

    private T t [];
    private int countPeople;

    public T sameT[];

    private int sameEmpCount=0;

    public PeopleInfo (T p []){
        t=p;
    }

    public void addPeopleInfo (T p){
        t[countPeople]=p;
        countPeople++;
    }



    // Comparison of the Employee objects
    public T [] findSameEmp(int counter) {
        for (int i = 0; i < (counter - 1); i++) {
            for (int j = (i + 1); j < counter; j++) {
                if (t[i].equals(t[j])) {
//                    sameT [sameTCount] = t[i];
//                    sameTCount++;
//
                    System.out.println(t[i]);
                }
            }
        }return sameT;

    }
}
