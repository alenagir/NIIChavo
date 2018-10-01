package test.serviceTest;

import model.people.Person;
import model.people.inheritPerson.Customer;
import model.people.inheritPerson.Employee;
import model.people.enums.Education;
import model.people.enums.Position;
import model.people.inheritEmployee.Researcher;
import model.people.inheritEmployee.TechStaff;
import org.junit.jupiter.api.Test;
import service.PeopleInfo;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PeopleInfoTest {



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

    PeopleInfo <Person> peopleInfo =new PeopleInfo <> ();


    @Test
    void PositiveGetFullPersInfo() {
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
       assertEquals(researcher1, peopleInfo.getFullPersInfo("Ойра-ойра Р."));
    }

    @Test
    void NegativeGetFullPersInfo() {
        assertNotEquals(researcher1, peopleInfo.getFullPersInfo("Ойра-ойра"));
    }

     @Test
    void PositiveGetPersNameByPhone1() {
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

         String exp []={"Ойра-ойра Р.", "Привалов А.", "Привалов А.", null, null, null, null};
         String act []=peopleInfo.getPersNameByPhone("2-81");
         assertArrayEquals(exp, act);
    }

    @Test
    void PositiveGetFullPersonInfo() {
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

        ArrayList <Person> exp=new ArrayList<>();
        exp.add(researcher3);
        exp.add(researcher5);

        assertIterableEquals(exp, peopleInfo.getFullPersonInfo("Привалов А."));
    }

    @Test
    void getPersonalTelNumber() {
    }

    @Test
    void getPersonNameByPhone() {
    }

    @Test
    void sortByName() {
    }

    @Test
    void sortByAge() {
    }

    @Test
    void getOldestPerson() {
    }
}