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
public abstract class Person {
    protected int id;
    protected String name;
    protected int age;
    protected Date birthday;
    protected String address;
    protected int phonenumber;
    
    public Person(){
        
    }
    public Person(int id,String name, int age, Date birthday, String address, int phonenumber){
        id=this.id;
        name=this.name;
        birthday=this.birthday;
        address=this.address;
        phonenumber=this.phonenumber;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }
    
   public void viewProduct() {
       
   }
   
    @Override
   public String toString() {  
        return   address;
    }  
    
   
}
