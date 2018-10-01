import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import model.departments.Committee;
import model.people.inheritPerson.Customer;
import model.people.Person;
import model.people.enums.Education;
import model.people.enums.Position;
import model.people.inheritEmployee.Researcher;
import model.people.inheritEmployee.TechStaff;
import service.PeopleInfo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

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


         Customer customer1=new Customer("Проницательный Г.", 1923, "(8182) 63-97-18", "г. Архангельск, Троицкий пр-т, д. 52", "газета Правда Севера");
         Customer customer2=new Customer("Питомник Б.", 1923, "(8182) 63-97-18", "г. Архангельск, Троицкий пр-т, д. 52", "газета Правда Севера");
         Customer customer3=new Customer("Вий Х.", 0, null, "Лысая гора", "Испытательный центр");


                          // Ctreates Committee from Researches
       Committee <Researcher> committee = new Committee <> (new Researcher[Researcher.countResearch]);
       committee.addCommitteeMember(researcher1);
       committee.addCommitteeMember(researcher2);
        committee.addCommitteeMember(researcher3);
        committee.addCommitteeMember(researcher4);
        committee.addCommitteeMember(researcher5);

                        //Counts members votes and makes Committee decision
        committee.memberVote(3, false);
        committee.memberVote(4, false);
        committee.memberVote(6, false);
        committee.memberVote(1, true);
        committee.memberVote(1, false);
        committee.memberVote(2, true);

//        System.out.println(committee.idError);
//        System.out.println(committee.reVoteError);
//        System.out.println("Positive votes: "+committee.getCountPositiveVote());
//        System.out.println("Committee decision: "+committee.committeeDecision());

                    // Adds all employees into PeopleInfo list

        PeopleInfo <Person> peopleInfo =new PeopleInfo <> ();
        peopleInfo.addPeopleInfo(customer1);
        peopleInfo.addPeopleInfo(customer2);
        peopleInfo.addPeopleInfo(customer3);
        peopleInfo.addPeopleInfo(researcher1);
        peopleInfo.addPeopleInfo(researcher2);
        peopleInfo.addPeopleInfo(researcher3);
        peopleInfo.addPeopleInfo(researcher4);
        peopleInfo.addPeopleInfo(researcher5);
        peopleInfo.addPeopleInfo(techStaff1);
        peopleInfo.addPeopleInfo(techStaff2);

       // peopleInfo.print();

       // Gets full information about the person  by person's name
      // System.out.println("PersonalInfo " +  peopleInfo.getFullPersonInfo("Привалов А."));
     // Gets telephone number by person's name
     // System.out.println("Personal telephone 1 " +  peopleInfo.getPersonTelNumber("  Привалов А."));
      // System.out.println("Personal telephone 2 " +  peopleInfo.getPersonTelNumber("  Привалов"));

     // Gets person's name by  telephone number
//     System.out.println("1)Name of the telephone owner " + peopleInfo.getPersonNameByPhone("2-81"));
//     System.out.println("2)Name of the telephone owner " + peopleInfo.getPersonNameByPhone("281"));
//     System.out.println("3)Name of the telephone owner " + peopleInfo.getPersonNameByPhone("(8183590) 2-81"));


      //Finds the oldest employee
//        System.out.println("The oldest Employee is: ");
//        System.out.println(peopleInfo.getOldestEmployee());

     //Sorts by Name
//        System.out.println("Sorted by name:");
//        peopleInfo.sortByName();
//        peopleInfo.print();
//

     //Sorts by Age
//     peopleInfo.sortByAge();
//     peopleInfo.print();
//     System.out.println();

     //Finding the customer who works in the definite organization

   System.out.println(peopleInfo.getCustomerByOrganiz("газета Правда Севера"));



    }
}
