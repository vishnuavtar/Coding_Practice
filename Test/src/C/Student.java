package C;

import java.io.*;
import java.util.*;

class Student implements Comparable<Student>{
    private String name;
    private int age;
    private String address;
    private int rollNo;
    
    public Student(String name, int age, String address, int rollNo){
        this.name = name;
        this.age = age;
        this.address = address;
        this.rollNo = rollNo;
    }

    public String getName(){
        return name;
    }

    public int compareTo(Student s){
        return this.getName().compareTo(s.getName());
    }

    public String toString(){
        return "Name: " + name + ", Age: " + age + ", Address: " + address + ", Roll No: " + rollNo;
    }
}
