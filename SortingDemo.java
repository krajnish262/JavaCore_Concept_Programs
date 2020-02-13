package com.example.javacore_concept_programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student> {
    String name;
    int age;
    int rollNo;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollNo=" + rollNo +
                '}';
    }

    public Student(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }


    @Override
    public int compareTo(Student s) {
        int compareAge = s.getAge();
        return age - compareAge;
    }

    public static Comparator<Student> byName = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            String name1 = s1.getName().toUpperCase();
            String name2 = s2.getName().toUpperCase();
            return name1.compareTo(name2);
        }
    };
    public static Comparator<Student> byRoll = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            int roll1 = s1.getRollNo();
            int roll2 = s2.getRollNo();

            return roll1 - roll2;
        }
    };
}

public class SortingDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Rajnish", 38, 101));
        students.add(new Student("shyam", 29, 415));
        students.add(new Student("virat", 35, 515));
        System.out.println("Sorting By age        ");
        Collections.sort(students);
        for (Student s : students) {
            System.out.println(s);


        }
        System.out.println("-------------------------------------");
        System.out.println("Sorting By Name:           ");
        Collections.sort(students, Student.byName);
        for (Student s : students) {

            System.out.println(s);

        }
        System.out.println("----------------------------");
        System.out.println("sorting By Roll No:      ");
        Collections.sort(students, Student.byRoll);
        for (Student s : students) {

            System.out.println(s);

        }

    }
}
