package DSA.Oops2.Encapsulation;

import java.util.Scanner;

public class Employee {
    public static  void main(String args[]){
        EmpInfo e=new EmpInfo();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Employee ID: ");
        int id=s.nextInt();
        e.setEmpId(id);

        System.out.println("Enter the Employee Name: ");
        String name=s.next();
        e.setName(name);

        System.out.println("Enter the Employee Salary: ");
        double salary=s.nextDouble();
        e.setSalary(salary);

        System.out.println("Employee Id: "+e.getEmpId()+" "+"Employee Name: "+e.getName()+" "+"Employee salary: "+e.getSalary());
    }
}

class EmpInfo{
    private int empId;
    private String name;
    private  double salary;

    public int getEmpId(){return empId;}
    public void setEmpId(int empId){this.empId=empId;}

    public String getName(){return name;}
    public void setName(String name){this.name=name;}

    public double getSalary(){return salary;}
    public void setSalary(double salary){this.salary=salary;}
}
