package org.structure.orderedArrays;

public class PersonObj {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public PersonObj(String first, String last, int age) {
        this.firstName = first;
        this.lastName = last;
        this.age = age;
    }

    public void displayPerson() {
        System.out.println("Last Name " + lastName);
        System.out.println("First Name " + firstName);
        System.out.println("Age " + age);
    }
}
