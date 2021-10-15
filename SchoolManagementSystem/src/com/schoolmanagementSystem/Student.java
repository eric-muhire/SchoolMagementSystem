package com.schoolmanagementSystem;
/*
 *Creted 2021-10-14
 * This class is reponsible for keep the
 * track of students fees, name, grade & fees
 * */

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;


    /**
     * To create a new student by initializing
     *
     * @param id id for student:unique.
     * @param name name for the student.
     * @param grade grade for the student.

     */
    public Student(int id, String name, int grade){
    this.id = id;
    this.name = name;
    this.grade = grade;

}

}
