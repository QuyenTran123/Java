/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selling_mobile_manager;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Supplier extends Person {
    static ArrayList<Supplier> ListSupplier = new ArrayList<Supplier>();
//    private static int count = 0;
    
    public Supplier(int id, String name){
        this.id = id;
        this.name = name;
    }
    
     public Supplier(){
         
     }
 
    public Supplier(int id,String name, int age, Date birthday, String address, int phonenumber){
        super(id,name,age,birthday,address,phonenumber);
    }
    
    @Override
    
    public String toString(){
        
        return ""+getName()+"                      "+getId();
        
    }
   
    public static void printInvoiceHeader() {
    System.out.printf("%-20s %s\n","Name", "ID");

    }
  
    
    public void enterInforSupply(){  
        System.out.printf("Enter id's supplier: ");
        int id = new Scanner(System.in).nextInt();
        System.out.printf("Enter name's supplier: ");
        String name = new Scanner(System.in).nextLine();
        ListSupplier.add(new Supplier(id, name));  
    }
    
    public void displaySupplier(ArrayList<Supplier> ListSupplier){
        for (int i = 0; i < ListSupplier.size(); i++) {
			System.out.println(ListSupplier.get(i));
		}
        }
    }

