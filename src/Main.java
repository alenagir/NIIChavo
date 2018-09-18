import model.people.*;
import model.people.Customer;
import model.people.Education;
import model.people.Employee;
import model.people.Position;
import service.CustomerInfo;
import service.EmployeeInfo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       int bonus[] = {5,5,5,5,5,5,5}; // the value of bonuses % // ПРОВЕРИТЬ ВНОСЯТ ОШИБКУ

        Employee emp1 = new Employee("Ойра-ойра Р.", 1930, "(8183590) 2-81", "наб. бухты Благополучия, 1", Education.HIGH, Position.SENIORSCI, 9, 1.4);
        Employee emp2 = new Employee("Почкин В.", 1940, "(8183590) 2-97","ул. Приморская, 11", Education.HIGH,  Position.RESEARCHASSIST,  8, 1.0);
        Employee emp3 = new Employee("Привалов А.", 1938, "(8183590) 2-81", "наб. бухты Благополучия, 1", Education.HIGH, Position.PROGRAMMER, 10, 1.3);
        Employee emp4 = new Employee("Киврин Ф.", 1915, "(8183590) 3-31", "ул. Заозерная, 26", Education.NO, Position.DEPARTMENTHEAD, 8, 1.8);
        Employee emp5 = new Employee("Камноедов М.", 1915, " (8183590) 2-83", "ул. Сивко, 20", Education.TECH, Position.HOUSHOLDMANAG, 8, 1.0);
        Employee emp6 = new Employee("Ойра-ойра Р.", 1930, "(8183590) 2-81", "наб. бухты Благополучия, 1",Education.HIGH, Position.RESEARCHASSIST, 4, 1.4);
        Employee emp7 = new Employee("Привалов А.", 1938, "(8183590) 2-81", "наб. бухты Благополучия, 1", Education.HIGH, Position.RESEARCHASSIST, 4, 1.3);

     Employee employee [] = {emp1, emp2, emp3, emp4, emp5, emp6, emp7};

     //Prints out the array of employee
//        for (int i=0; i<employee.length; i++){
//            System.out.println(employee [i] + " Gets "+ employee[i].bonusSalary(bonus[i]) + " a day.");
//        }

        // Creates the array of EmployeeInfo objects

         EmployeeInfo empInfo = new EmployeeInfo();
        empInfo.addEmp(emp1); empInfo.addEmp(emp2); empInfo.addEmp(emp3); empInfo.addEmp(emp4);
        empInfo.addEmp(emp5); empInfo.addEmp(emp6); empInfo.addEmp(emp7);


     Customer customer1=new Customer("Проницательный Г.", 1923, "(8182) 63-97-18", "г. Архангельск, Троицкий пр-т, д. 52", "газета Правда Севера");
     Customer customer2=new Customer("Питомник Б.", 1923, "(8182) 63-97-18", "г. Архангельск, Троицкий пр-т, д. 52", "газета Правда Севера");
     Customer customer3=new Customer("Вий Х.", 0, null, "Лысая гора", "Испытательный центр");

     Customer customer [] = {customer1, customer2, customer3};

      //Creates the array of CustomerInfo objects
     CustomerInfo custInfo = new CustomerInfo();
     custInfo.addCustomer(customer1); custInfo.addCustomer(customer2); custInfo.addCustomer(customer3);


        //Prints out the array of customers
//        for (int i=0; i<Customer.countCust; i++){
//            System.out.println(customer [i]);
//        }
//        System.out.println();
//

        // Comparison of the Employee objects
//         empInfo.findSameEmp();
//         System.out.println("Following employees are entered more than one time: ");
//        for (int i=0; i<employee.length; i++){
//           if (empInfo.sameEmp [i]!=null) System.out.println(empInfo.sameEmp [i]);
//        }
//        System.out.println();
//
//        // Finding the oldest employee
//        empInfo.findOldestEmp();
//        System.out.println();
//        //Sorting employees  with respect to their salary with bonuses
//
//        empInfo.sortEmpSalaryDesc();
//        empInfo.print();


     Person empl1=new Employee("Ойра-ойра Р.", 1930, "(8183590) 2-81", "наб. бухты Благополучия, 1", Education.HIGH, Position.SENIORSCI, 9, 1.4);
     Person cust1=new Customer("Вий Х.", 1, null, "Лысая гора", "Испытательный центр");
     Person people [] = {empl1, cust1};
     System.out.println(Arrays.toString(people));




    }
}
