package service;

import model.people.inheritPerson.Customer;
import model.people.inheritPerson.Employee;
import model.people.Person;

import java.util.*;


public class PeopleInfo <T extends Person> {

    private List<T> peopleList;
    private T infoShow; //FROM BAD CODE
    private String gatherInfo []= new String[Employee.countEmp];//FROM BAD CODE
    private ArrayList<T> addByName = new ArrayList<>();
    private HashSet<String> addTelByName = new HashSet<>();
    private TreeSet<String> addNameByPhone = new TreeSet<>();
    private ArrayList<String> addByOrganiz = new ArrayList<>();
    private ArrayList<String> addOldest= new ArrayList<>();

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
        for (T person:peopleList ) {
            System.out.println(person);
       }
    }

    //------------------------------------------------------------------------------------------------------------------
                 // NEXT FOUR UNITS HAVE INCORRECT LOGIC. LEFT FOR TEST PRACTISE.
    // Gets full information about the person  by person's name

    public T getFullPersInfo(String name){
        Iterator <T> it = peopleList.iterator();
        while (it.hasNext()) {
            infoShow=it.next();
            if (infoShow.getName().equals(name)) break;
        }return infoShow;
    }
    // Gets telephone number by person's name
    public String getPersTelNumber(String name){
        Iterator <T> it = peopleList.iterator();
        while (it.hasNext()) {
            infoShow=it.next();
            if (infoShow.getName().equals(name)) break;
        }return infoShow.getTelNumber();
    }

    // Gets person's name by  telephone number
    public  String[] getPersNameByPhone(String telNumber){
        Iterator <T> it = peopleList.iterator();
        int counter =1;
        while (it.hasNext()) {
            infoShow=it.next();
            if (infoShow.getTelNumber().equals(telNumber))
                gatherInfo [counter]=infoShow.getName();
            if (infoShow.getTelNumber().regionMatches(10, telNumber, 0, 4))
                gatherInfo [counter]=infoShow.getName();
            counter++;
        }return gatherInfo;
    }
    // Prints the results of the getPersonNameByPhone method
    public void printName(){
        for (int i=1; i<gatherInfo.length; i++) {
            if((gatherInfo[i]!=(gatherInfo[i-1])&&gatherInfo[i]!=null)) System.out.println(gatherInfo[i]);
        }
    }
//---------------------------------------------------------------------------------------------------------------------
    // Gets full information about the person  by person's name
    public ArrayList<T> getFullPersonInfo(String name){
        for (T person:peopleList) {
            if (person.getName().equals(name)) addByName.add(person);
        }return addByName;
    }
    //* Gets telephone number by person's surname. If there is a ' '-space before entered surname, the method omits
    // spaces after splitting as [0] row of @code enteredName array. @code dbSurname[0] contains surname from database.*//
    public HashSet<String> getPersonTelNumber(String name){
        for (T person:peopleList) {
            String[] dbSurname = person.getName().split("(\\s)");
            // My Indian Code:
//            String surname=null;
//            String[] enteredName = name.split("\\s*(\\s)\\s*");
//            boolean result = enteredName[0].matches("\\s*");
//            if (result==false) {surname=enteredName[0];}
//                else {surname=enteredName[1];}
//            if (person.getName().equals(name) || surname.equals(dbSurname[0])){
//            addTelByName.add(person.getTelNumber());
//            }
            if (person.getName().equals(name.trim()) || dbSurname[0].equals(name.trim())){
            addTelByName.add(person.getTelNumber());
            }
        }return addTelByName;
    }

    // Gets person's name by  telephone number
    public  TreeSet<String> getPersonNameByPhone(String telNumber){
        for (T person:peopleList) {
            String hyphenTel="000";
            if (telNumber.length()==3){
                char [] tel = telNumber.toCharArray();
                hyphenTel=(new String(new char []{tel[0], '-', tel[1], tel[2]}));
            }
                try{
                    if (person.getTelNumber().equals(telNumber)
                            || person.getTelNumber().regionMatches(10, telNumber, 0, 4)
                            || person.getTelNumber().regionMatches(10, hyphenTel, 0, 4)){
                        addNameByPhone.add(person.getName());
                    }
                }catch (NullPointerException e){
                    System.out.println("There is an empty 'Telephon number' field in the database");
                }
        }return addNameByPhone;
    }

    // Overrides Comparator.compare to sort by name
    public static class NameComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return ((Person)o1).getName().compareTo(((Person)o2).getName());
        }
    };
    static NameComparator compareByName  = new NameComparator();
    public void sortByName (){
        peopleList.sort(compareByName);
    }

    // Overrides Comparator.compare to sort by Age
    public static class AgeComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2)  {
            return ((Person)o1).getBirthYear() -((Person)o2).getBirthYear();
        }
    };
    static AgeComparator compareByAge  = new AgeComparator();
    public void sortByAge (){
        peopleList.sort(compareByAge);
    }

    // Finds the oldest person
    public ArrayList<String> getOldestEmployee (){
         peopleList.sort(compareByAge);
        int i=0;
        for (T person:peopleList){
            try {
                addOldest.add(((Employee) person).getName());
                if (((Employee)peopleList.get(i)).getBirthYear()!=((Employee)peopleList.get(i+1)).getBirthYear()) {
                    return addOldest;
                }
            }catch (ClassCastException e){
                e.getMessage();
            }
            i++;
        }
       return addOldest;
    }

    //Finding the customer who works in the definite organization
    public ArrayList<String> getCustomerByOrganiz(String organization){
        for (T person:peopleList) {
            try {
                if (((Customer) person).getOrganization().equals(organization)) {
                    addByOrganiz.add(person.getName());
                }
            } catch (ClassCastException e) {
                e.getMessage();
            }
        }return addByOrganiz;
    }




}




