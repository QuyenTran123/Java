/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selling_mobile_manager;

import java.util.ArrayList;
import java.util.Scanner;
import static selling_mobile_manager.Supplier.ListSupplier;

/**
 *
 * @author quyen.tran
 */
public class Category {
    int id;
    String name;
    Supplier supplier;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSupplier() {
        return supplier.getName();
    }

    public static ArrayList<Category> getListCategory() {
        return ListCategory;
    }

    public Category(int id, String name, Supplier nameSuplier) {
       this.id = id;
       this.name = name;
       this.supplier = nameSuplier;
    }
    public Category(){
        
    }
    
    @Override
     public String toString(){
        return ""+getId()+"                   "+getName()+"                    "+getSupplier();
    }
     
    public static void printInvoiceHeader() {
    System.out.printf("%-20s %-20s %s\n","ID", "NAME","SUPPLIER");

    }
    
    static ArrayList<Category> ListCategory = new ArrayList<Category>();
    public void enterCategory(){  
        System.out.printf("Enter id's category: ");
        int id = new Scanner(System.in).nextInt();
        System.out.printf("Enter name's category: ");
        String name = new Scanner(System.in).nextLine();
        System.out.printf("Enter your id's supplier: ");
        int id1 = new Scanner(System.in).nextInt();
        Supplier sup = new Supplier();
        if (sup.ListSupplier.contains(id)) {
            System.out.println("This id existed");
            
        }
        
        
        for (int i = 0; i < sup.ListSupplier.size(); i++) {
            if (sup.ListSupplier.get(i).getId() == id1) {
                ListCategory.add(new Category(id, name, sup.ListSupplier.get(i)));  
            }
        }
//        System.out.println("Enter supplier: ");
//        Supplier nameSupplier = new Scanner(System.in).next();
        
    }
    
//    public int checkIdSupplier(int id, ArrayList<Supplier> ListSupplier){
//        Supplier sup = new Supplier();
//        for (int i = 0; i < sup.ListSupplier.size(); i++) {
//            if (sup.ListSupplier.contains(id)) {
//                System.out.println("Exist this id");
//                return 1;
//            }
//            else{
//                return -1;
//            }
//        }
//        return 0;
//    }
    
    
    public void displayCategory(ArrayList<Category> ListCategory){
        for (int i = 0; i < ListCategory.size(); i++) {
			System.out.println(ListCategory.get(i));
		}
        }
}
