/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selling_mobile_manager;

import java.util.Scanner;
import static javafx.application.Platform.exit;
import static selling_mobile_manager.Supplier.ListSupplier;
import static selling_mobile_manager.Category.ListCategory;
import static selling_mobile_manager.Category.printInvoiceHeader;
import static selling_mobile_manager.Product.ListProduct;
import static selling_mobile_manager.Supplier.printInvoiceHeader;



/**
 *
 * @author quyen.tran
 */
public class Main {
    public static void menu(){
        System.out.println("=============MENU=================");
        System.out.println("What field do you belong to?");
        System.out.println("1: Supplier");
        System.out.println("1: Customer");
        System.out.println("1: Employee");
    }
   
    public static void main(String []args){
        menu();
        
        while (true) {
            System.out.println("Please enter your field: ");
            int variable = new Scanner(System.in).nextInt();
             switch (variable){
            case 1: 
                try {
                    Supplier supplier = new Supplier();
                    supplier.enterInforSupply(); 
                    supplier.printInvoiceHeader();
                    supplier.displaySupplier(ListSupplier);
                } catch (Exception e) {
                    System.err.println("Arithmetic Exception occurs!");
                }
                while (true) {
                     System.out.println("Do you want continute: ");
                System.out.println("1: yes");
                System.out.println("2: no");
                int a = new Scanner(System.in).nextInt();
                switch (a) {
                    case 1:
                            try {
                            Category category = new Category();
                            category.enterCategory();
                            category.printInvoiceHeader();
                            category.displayCategory(ListCategory);
                        } catch (Exception e) {
                            System.err.println("Arithmetic Exception occurs!");
                        }
                        break;
                    case 2:
                        exit();
                        break;
                    default:
                        break;
                }
                }
               
                
                
                
                
//                Product product = new Product();
//                product.enterProduct();
//                  product.printInvoiceHeader();
//                product.displayProduct(ListProduct);
                

            case 2:
                menu();   

            
            default:
            break;    
            }
        } 
        
        
       
        
        
       
  }
    
}
