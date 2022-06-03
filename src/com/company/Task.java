package com.company;

import java.util.Scanner;

class Person {
    String version = "Person";
}
class Student extends Person {
    String version = "Student";
}
public class Task {
    public static void main(String[] args) {
        Person person = new Student ();
        System.out.println(person.version);
    }
}














