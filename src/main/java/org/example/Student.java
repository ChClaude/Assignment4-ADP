package org.example;

public class Student {

    private String stdNumber;
    private String name;
    private String surname;
    private int age;
    private String sex;

    public Student(String stdNumber, String name, String surname, int age, String sex) {
        this.stdNumber = stdNumber;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stdNumber='" + stdNumber + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
