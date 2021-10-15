package com.schoolmanagementSystem;

import java.util.List;

/**
 * Many teachers,many students.
 * Crated by eric
 */
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpend;

    /**
     *
     * @param teachers list of teacher in the school.
     * @param students list of student in the school.
     */

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpend=0;
    }

    /**
     * When we create school can we alter teachers, alter students, alter money spend
     * @return returns the list of teachers at school.
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * add a techer to the school
     * @param teacher the teacher to be added.
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     *
     * @return return the list of students
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * add a student to the school
     * @param student student to be added
     */
    public void addStudents(Student student) {
        students.add(student);
    }

    /**
     *
     * @return The total money earned by the school.
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * add total money earned by the school
     * @param MoneyEarned money to be added
     */
    public void uppdateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned+=totalMoneyEarned;
    }

    /**
     *
     * @return total money spent by the school.
     */
    public int getTotalMoneySpend() {
        return totalMoneySpend;
    }

    /**
     * update money spend by school, salary to the teachers
     * @param moneySpent teaacher´s salary
     */
    public void setTotalMoneySpend(int moneySpent) {
//        totalMoneySpend =totalMoneyEarned-MoneySpend;
       totalMoneyEarned-=moneySpent;
    }
}
