package edu.grcy;

import edu.grcy.person.Person;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Person person1 = Person.createPerson("Jan", "Kowalski", 35, "male");
        Person person2 = Person.createPerson("Anna", "Nowak", 25, "female");
        Person person3 = Person.createPerson("Piotr", "Zielinski", 40, "male");
        Person person4 = Person.createPerson("Maria", "Wojcik", 30, "female");

        System.out.println("Print person data");
        printPersonData(person1);
        printPersonData(person2);
        printPersonData(person3);
        printPersonData(person4);

        thickLine();
        System.out.println("Print person data using forEach");
        var people = List.of(person1, person2, person3, person4);
        people.forEach(Main::printPersonData);

        thickLine();
        System.out.println("Print person data using stream, default order");
        people.stream()
                .sorted()
                .forEach(Main::printPersonData);

        thickLine();
        System.out.println("Print person data using stream, reverse order");
        people.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(Main::printPersonData);

        thickLine();
        System.out.println("Print only people with age divided by 10");
        people.stream()
                .filter(person -> person.getAge() % 10 == 0)
                .forEach(Main::printPersonData);

        thickLine();
        System.out.println("People sorted by surname descending");
        people.stream()
                .sorted(Comparator.comparing(Person::getSurname).reversed())
                .forEach(Main::printPersonData);
    }

    public static void printPersonData(Person person) {
        System.out.println(person.getPersonData());
    }

    public static void thickLine() {
        System.out.println("====================================");
    }

}