package Lesson4;

import java.util.Calendar;

public class Employee {
    private static final int CURRENT_YEAR = Calendar.getInstance().get(Calendar.YEAR);

    private String name;
    private int salary;
    private int birthYear;

    public Employee(String name, int salary, int birthYear) {
        this.name = name;
        this.salary = salary;
        this.birthYear = birthYear;
    }

    public String getName() {return name;}

    public int getSalary() {return salary;}

    public int getAge() {
        return CURRENT_YEAR - birthYear;
    }

    public void setSalary(int salary) {this.salary = salary;}


    @Override
    public String toString() {
        return "Employee " +
                "name '" + name + '\'' +
                ", salary = " + salary + "$" +
                ", age = " + (CURRENT_YEAR - birthYear) +
                '}';
    }
}
