/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selling_mobile_manager;

import java.util.Date;

/**
 *
 * @author admin
 */
public class Salesman extends Employee {
    public Salesman(){
        
    }
    
    public Salesman(int id,String name, int age, Date birthday, String address, int phonenumber,double salary,Date hire){
        super(id,name,age,birthday,address,phonenumber,salary,hire);
    }
    
    public void payAmount(){
        
    }
}

