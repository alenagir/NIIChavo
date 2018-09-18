package service;

import model.people.Customer;

public class CustomerInfo {
    private Customer customer[];
    private int custNumber;
    private Customer findCustomer[];

    public CustomerInfo (){
      customer = new Customer[Customer.countCust];
    }
    public void addCustomer (Customer cust){
      customer[custNumber]=cust;
      custNumber++;
    }


                                    //Finding the customer who works in the definite organization
    public Customer [] customerFromOrganization(String organizat){
        int fc=0;
        for (int i=0; i<Customer.countCust;i++){
            if (organizat.equals(customer[i].getOrganization()))
                findCustomer[fc]=customer[i];
                fc++;
        }return findCustomer;
    }

}
