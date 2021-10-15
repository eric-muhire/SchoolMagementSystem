package com.schoolmanagementSystem;

public class Teacher {
    /**
     * This class is responsible for keeping track of teachers´name, and salary
     */
    private int id;
    private String name;
    private int salary;

    /**
     *
     * @param id id for the teaher.
     * @param name name of the teacher
     * @param salary salary of the teacher.
     */
    public Teacher(int id,String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;

    }

    /**
     *
     * @return return name of the teacher.
     */
    public String getName(){
        return name;
    }

    /**
     *
     * @return return id of the teacher.
     */
    public int getId(){
        return id;
    }

    /**
     *
     * @return return the salary of the teacher.
     */
    public int getSalary(){
        return salary;
    }

    /**
     *
     * @param salary set the teacher´s salary.
     */
    public void setSalary(int salary){
        this.salary=salary;
    }

}