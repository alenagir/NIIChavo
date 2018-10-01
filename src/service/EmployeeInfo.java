package service;

import model.people.inheritPerson.Employee;

public class EmployeeInfo {
    private Employee employee[];
    private    int bonus[] = {0,0,0,0,0,0,0};
    public Employee sameEmp[]=new Employee[Employee.countEmp];
    private int sameEmpCount=0;
    private   String oldestEmp;
    private   String enterBirthYear;
    private int empNumber;

    public EmployeeInfo (){
        employee = new Employee[Employee.countEmp];
    }
    public void addEmp(Employee emp){
        employee[empNumber]=emp;
        empNumber++;
    }

    // Comparison of the Employee objects
    public Employee [] findSameEmp() {
        for (int i = 0; i < (Employee.countEmp - 1); i++) {
            for (int j = (i + 1); j < Employee.countEmp; j++) {
                if (employee[i].equals(employee[j])) {
                    sameEmp [sameEmpCount] = employee[i];
                    sameEmpCount++;
                    sameEmp [sameEmpCount] = employee[j];
                    sameEmpCount++;
                }
            }
        }return sameEmp;

    }
//

    // Finding the oldest employee

    public String findOldestEmp () {
        int minYear =employee[0].getBirthYear();
        for (int j = 1; j < Employee.countEmp; j++) {
            if (minYear >= (employee[j].getBirthYear()) && (employee[j].getBirthYear()) != 0) {
                minYear = employee[j].getBirthYear();
                oldestEmp = employee[j].getName()+ " was born in "+ employee[j].getBirthYear();
                System.out.println(oldestEmp);
            }
        }return oldestEmp;
    }

    //Sorting employees  with respect to their salary with bonuses

    public void sortEmpSalaryDesc(){
        for (int i=0; i<(Employee.countEmp); i++){
            for (int j=i+1; j<Employee.countEmp; j++) {
                if (employee[i].bonusSalary(bonus[i]) < (employee[j].bonusSalary(bonus[j]))) {
                    Employee sort;
                    sort = employee[j];
                    employee[j] = employee[i];
                    employee[i] = sort;

                }
            }
        }
    }

    public void print(){
        for (int i=0;i<Employee.countEmp;i++){
            System.out.println(employee[i].getName()+": salary with bonuses " + employee[i].bonusSalary(bonus[i]));
        }
    }

}
