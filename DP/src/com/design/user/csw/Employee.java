package com.design.user.csw;

import java.util.ArrayList;
/**
 *
 * @author Prabhu
 */
public class Employee implements Subject{
    private String empName;
    private float salary;
    private ArrayList observers;
    public Employee()
    {
        observers       = new ArrayList();
    }

    public void setEmployeeValues(String empName,float salary)
    {
        this.empName    =   empName;
        this.salary     =   salary;
        changedEmployeeDetails();
    }
    public void changedEmployeeDetails()
    {
        notifyObservers();
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int index   =   observers.indexOf(o);
        if (index >= 0)
        {
            observers.remove(index);
        }
    }

    public void notifyObservers() {
       for (int i = 0; i < observers.size(); i++) {
           Observer observer = (Observer)observers.get(i);
           observer.update();
        }
    }
    public float getSalary()
    {
        return salary;
    }
    public String getEmployeeName()
    {
        return empName;
    }
    public void display()
    {
        System.out.println("Employee Details:" +
                "\nName:"   + empName +
                "\nSalary:" + salary);
    }

}