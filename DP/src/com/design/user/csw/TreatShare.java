package com.design.user.csw;

public class TreatShare implements Observer{
    private Employee employee;
    private float treatAmount = 0;
    public TreatShare(Employee employee){
        this.employee   =   employee;
        employee.addObserver(this);
    }
    public void noMoreTreat()
    {
        System.out.println("I will not give Treat anymore *lump*");
        employee.removeObserver(this);
        System.out.println("You are removed from our observer list " +
                "Mr."+employee.getEmployeeName()+"\nSo long miser :P");
    }
    public void update() {
        treatAmount += employee.getSalary() * 0.05;
        display();
    }
    public void display()
    {
        System.out.println(employee.getEmployeeName()+
                "will give a treat for "+treatAmount+"bucks");
    }
}