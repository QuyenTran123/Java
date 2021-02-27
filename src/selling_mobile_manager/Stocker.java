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
public class Stocker extends Employee {
    public Stocker(){
        
    }
    
    public Stocker(int id,String name, int age, Date birthday, String address, int phonenumber,double salary,Date hire){
        super(id,name,age,birthday,address,phonenumber,salary,hire);
    }
    
}
