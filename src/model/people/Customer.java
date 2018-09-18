package model.people;

import model.people.Person;

public class Customer extends Person {

    private String organization;
    public static int countCust;

    public Customer (){                             // default constructor
        countCust++ ;
            }


    public Customer(String name, int birthYear, String telNumber, String address, String organization){
        super(name, birthYear, telNumber, address);
        this.organization=organization;
        countCust++;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getOrganization() {
        return organization;
    }

    @Override
    protected void changeTelNumber(String telNumber) {
        this.telNumber=telNumber;
    }

    @Override
    protected void changeAddress(String address) {
        this.address=address;
    }

    public String toString(){
        return super.toString()+" "+organization;
    }


}
