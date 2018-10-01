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

    public String toString(){
        return name+": "+ birthYear+ " year, "+address+", "+telNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(getClass() == obj.getClass())) return false;
        else {
            Person tmp = (Person) obj;
            if (tmp.name == this.name && tmp.birthYear == this.birthYear) return true;
            else return false;
        }
    }

    @Override
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = PRIME + Integer.parseInt(getName())+getBirthYear();
        return result;
    }

    protected abstract void changeTelNumber(String telNum);

    protected abstract void changeAddress(String addr);


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
