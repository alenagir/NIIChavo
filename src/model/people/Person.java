package model.people;

import java.util.Comparator;

public abstract class Person {
    protected String name;
    protected int birthYear=0;
    protected String telNumber=null;
    protected String address=null;


    protected Person (){};

    protected Person (String name, int birthYear, String telNumber, String address){
        this.name=name;
        this.birthYear=birthYear;
        this.telNumber=telNumber;
        this.address=address;
    }

    protected abstract void changeTelNumber(String telNum);

    protected abstract void changeAddress(String addr);



    public String toString(){
        return name+": "+address+", "+telNumber;
    }

        public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public String getAddress() {
        return address;
    }


}
