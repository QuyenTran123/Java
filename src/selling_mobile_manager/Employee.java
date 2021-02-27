/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selling_mobile_manager;

import java.util.Date;

/**
 *
 * @author quyen.tran
 */
public class Employee extends Person {
    protected double salary;
    protected Date hire;
    public Employee(){
        
    }
    public Employee(int id,String name, int age, Date birthday, String address, int phonenumber){
        super(id,name,age,birthday,address,phonenumber);
    }
    public Employee(double salary,Date hire){
        salary=this.salary;
        hire=this.hire;
    }
    public Employee(int id,String name, int age, Date birthday, String address, int phonenumber,double salary,Date hire){
        super(id,name,age,birthday,address,phonenumber);
        salary=this.salary;
        hire=this.hire;
    }
    public double getSalary() {
        return salary;
    }

    public Date getHire() {
        return hire;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setHire(Date hire) {
        this.hire = hire;
    }
    
    /**
     *
     */
    public void tostring(){
        
    }
    
    
    
}

