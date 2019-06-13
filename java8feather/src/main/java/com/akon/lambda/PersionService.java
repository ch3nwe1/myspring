package com.akon.lambda;

import java.util.List;

public class PersionService {

    public static void printPersonsOlderThan(List<Person> roster, int age) {

        for (Person person : roster){
            if(person.getAge() >= age)
                person.printPerson();
        }

    }

    public static void printPersonsWithinAgeRange(
            List<Person> roster, int low, int high) {
        for (Person p : roster) {
            if (low <= p.getAge() && p.getAge() < high) {
                p.printPerson();
            }
        }
    }

    public static void printPersons(List<Person> roster, CheckPerson tester) {
            for (Person p : roster) {
                if (tester.test(p)) {
                    p.printPerson();
                }
            }
    }

}
