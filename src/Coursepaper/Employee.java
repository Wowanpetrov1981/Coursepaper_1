package Coursepaper;


public class Employee {
    private String fullName;
    private int departments;
    private double salary;
    private int id;
    public static int count = 1;


    public Employee(String fullName, int departments, double salary) {
        this.fullName = fullName;
        this.departments = departments;
        this.salary = salary;
        this.id = count;
        count++;
    }
    public String getFullName() {
        return this.fullName;
    }

    public int getDepartments() {
        return this.departments;
    }

    public double getSalary() {
        return this.salary;
    }




    @Override
    public String toString() {
        return  this.id + ". " + this.fullName + ", " + "отдел: " + this.departments + ", " + "заработная плата: " + this.salary + " рублей";
    }

    public void setDepartments(int departments) {
        this.departments = departments;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(double salary) {
        this.salary = salary;
    }


}
