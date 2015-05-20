package com.design.user.csw;

public class TaxDepartment implements Observer{
    private Employee employee;
    private float taxAmount;
    public TaxDepartment(Employee employee)
    {
        this.employee   =   employee;
        employee.addObserver(this);
    }

    public void update() {
        taxAmount = employee.getSalary() * 0.07f;
        display();
    }
    public void display()
    {
        System.out.println("Hurray! we got some tax money!\n Be ready Mr." +
                employee.getEmployeeName() +
                " a sum of " + taxAmount+ "will be REDUCED from your salary");
    }
}