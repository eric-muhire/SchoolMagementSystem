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
     * Fees for every student is $ 30 000
     * fee paid initially is 0
     * @param id id for student:unique.
     * @param name name for the student.
     * @param grade grade for the student.

     */
    public Student(int id, String name, int grade){
    this.id = id;
    this.name = name;
    this.grade = grade;
        this.feesPaid=0;
        this.feesTotal=0;
}
//Not going to alter(ändra) student´s name, student id.

    /**
     * Used to upgrade the student´s grade.
     * @param grade new grade of student
     */
    public void setGrade(int grade){
        this.grade=grade;

    }

    /**
     * keep adding the fees to feesPaid Field.
     * add the fees to the fees paid.
     * The school is going to receive the funds.
     * @param fees the fees that the student pays.
     */
    public void updateFeepaids(int fees){
        feesPaid=fees;

    }

}
