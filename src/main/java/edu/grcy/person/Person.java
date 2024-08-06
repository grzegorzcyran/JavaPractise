package edu.grcy.person;

public class Person implements Comparable<Person> {
    private final String name;
    private String surname;
    private int age;
    private Gender gender;

    //add private constructor
    private Person(String name, String surname, int age, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    //add public static method to create object
    public static Person createPerson(String name, String
                                      surname, int age, String gender) {
        return new Person(name, surname, age, Gender.fromName(gender));
    }

    public String getPersonData() {
        return "Name: " + name + ", Surname: " + surname + ", Age: " + age + ", Gender: " + gender;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    public int getAge() {
        return age;
    }

    public String getSurname() {
        return surname;
    }
}
