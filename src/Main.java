import model.departments.Committee;
import model.people.*;
import model.people.Customer;
import model.people.Education;
import model.people.Employee;
import model.people.Position;
import model.people.implEmployee.Researcher;
import model.people.implEmployee.TechStaff;
import service.CustomerInfo;
import service.EmployeeInfo;
import service.PeopleInfo;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       int bonus[] = {5,5,5,5,5,5,5}; // the value of bonuses % // ПРОВЕРИТЬ ВНОСЯТ ОШИБКУ


        Researcher researcher1 = new Researcher("Ойра-ойра Р.", 1930, "(8183590) 2-81", "наб. бухты Благополучия, 1",
                Education.HIGH, Position.SENIORSCI, 9, 1.4, "МГУ");
        Researcher researcher2 = new Researcher("Почкин В.", 1940, "(8183590) 2-97","ул. Приморская, 11",
                Education.HIGH,  Position.RESEARCHASSIST,  8, 1.0, "ДГУ");
        Researcher researcher3 = new Researcher("Привалов А.", 1938, "(8183590) 2-81", "наб. бухты Благополучия, 1",
                Education.HIGH, Position.PROGRAMMER, 10, 1.3, "ЛГУ");
        Researcher researcher4 = new Researcher("Киврин Ф.С.", 1900, "(8183590) 3-31", "ул. Заозерная, 26",
                Education.NO, Position.DEPARTMENTHEAD, 8, 1.8, null);
        Researcher researcher5 = new Researcher("Привалов А.", 1938, "(8183590) 2-81", "наб. бухты Благополучия, 1",
                Education.HIGH, Position.RESEARCHASSIST, 4, 1.3, "ЛГУ");


        TechStaff techStaff1 = new TechStaff("Камноедов М.М.", 1915, " (8183590) 2-83", "ул. Сивко, 20",
                Education.TECH, Position.HOUSHOLDMANAG, 8, 1.0, "Главный");
        TechStaff techStaff2 = new TechStaff("Горыныч Н.К.", 0, "(8183590) 2-31", "ул. Лукоморье, 1",
                Education.NO, Position.DEPARTMENTHEAD, 8, 1.4, "ИзНаКурНож");


     //Prints out the array of employee
//        for (int i=0; i<employee.length; i++){
//            System.out.println(employee [i] + " Gets "+ employee[i].bonusSalary(bonus[i]) + " a day.");
//        }

        // Creates the array of EmployeeInfo objects

//         EmployeeInfo empInfo = new EmployeeInfo();
//        empInfo.addEmp(emp1); empInfo.addEmp(emp2); empInfo.addEmp(emp3); empInfo.addEmp(emp4);
//        empInfo.addEmp(emp5); empInfo.addEmp(emp6); empInfo.addEmp(emp7);
//
//
//     Customer customer1=new Customer("Проницательный Г.", 1923, "(8182) 63-97-18", "г. Архангельск, Троицкий пр-т, д. 52", "газета Правда Севера");
//     Customer customer2=new Customer("Питомник Б.", 1923, "(8182) 63-97-18", "г. Архангельск, Троицкий пр-т, д. 52", "газета Правда Севера");
//     Customer customer3=new Customer("Вий Х.", 0, null, "Лысая гора", "Испытательный центр");
//
//     Customer customer [] = {customer1, customer2, customer3};
//
//      //Creates the array of CustomerInfo objects
//     CustomerInfo custInfo = new CustomerInfo();
//     custInfo.addCustomer(customer1); custInfo.addCustomer(customer2); custInfo.addCustomer(customer3);


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

                          // Ctreates Committee from Researches
       Committee <Researcher> committee = new Committee <> (new Researcher[Researcher.countResearch]);
       committee.addCommitteeMember(researcher1);
       committee.addCommitteeMember(researcher2);
        committee.addCommitteeMember(researcher3);
        committee.addCommitteeMember(researcher4);
        committee.addCommitteeMember(researcher5);

//                    // Prints the Ccommittee members
//        for (int i=0; i<committee.countMember; i++){
//            System.out.println(committee.getMember(i));
//        }
//        System.out.println();

                    //Counts members votes and makes Committee decision
        committee.memberVote(1, true);
        committee.memberVote(1, false);
        committee.memberVote(2, true);
        committee.memberVote(3, false);
        committee.memberVote(4, false);
        committee.memberVote(5, false);

        System.out.println(committee.idError);
        System.out.println("Positive votes: "+committee.getCountPositiveVote());
        System.out.println("Committee decision: "+committee.committeeDecision());

        System.out.println(Employee.countEmp); //The parent knows nothing about his children? If protected, does not work.
        System.out.println(Researcher.countEmp);

        System.out.println(Employee.getCountEmp());
        System.out.println(Researcher.getCountEmp()); //Children do not inherit static?

        // Все смешалось: кони, люди..

        PeopleInfo <Employee> peopleInfo =new PeopleInfo <> (new Employee[Employee.getCountEmp()]);
        peopleInfo.addPeopleInfo(researcher1);
        peopleInfo.addPeopleInfo(researcher5);
        peopleInfo.addPeopleInfo(techStaff1);

        System.out.println();
        peopleInfo.findSameEmp(3);


    }
}
