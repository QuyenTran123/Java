/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selling_mobile_manager;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Product {
    static ArrayList<Product> ListProduct = new ArrayList<Product>();
    int id_pro;
    String name_pro;
    float price;
    int quantity;
    String status;
    Supplier supplier;
    Category category;
    
    public Product(){
        
    }
    public Product(int id_pro,String name_pro,float price,int quantity,String status,Supplier supplier, Category category) {
        this.id_pro = id_pro;
        this.name_pro = name_pro;
        this.price = price;
        this.quantity = quantity;
        this.status = status;
        this.supplier = supplier;
        this.category = category;
        
    }

    public int getId_pro() {
        return id_pro;
    }

    public void setId_pro(int id_pro) {
        this.id_pro = id_pro;
    }

    public String getName_pro() {
        return name_pro;
    }

    public void setName_pro(String name_pro) {
        this.name_pro = name_pro;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getSupplier() {
        return supplier.getName();
    }
    
    public String getCategory() {
        return category.getName();
    }
    
    @Override
    public String toString(){
        return ""+getId_pro()+"          "+getName_pro()+"          "+getPrice()+"          "+getQuantity()+"          "+getStatus()+"          "+getSupplier()+"          "+getCategory();
    }
    
    public static void printInvoiceHeader() {
            System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %s\n","ID", "NAME","PRICE","QUANTITY","STATUS","SUPPLIER","CATEGORY");


    }

    
    public void enterProduct(){
        System.out.printf("Enter id: ");
        int id = new Scanner(System.in).nextInt();
        System.out.printf("Enter name: ");
        String name = new Scanner(System.in).nextLine();
        System.out.printf("Enter price: ");
        float price = new Scanner(System.in).nextFloat();
        System.out.printf("Enter quantity: ");
        int quantity = new Scanner(System.in).nextInt();
        System.out.printf("Enter status: ");
        String status = new Scanner(System.in).nextLine();
        System.out.printf("Enter id's suplier: ");
        int name1 = new Scanner(System.in).nextInt();
        System.out.printf("Enter id's suplier: ");
        int name2 = new Scanner(System.in).nextInt();
        
        Supplier sup = new Supplier();
        Category cate = new Category();
        for (int i = 0; i < sup.ListSupplier.size(); i++) {
            for (int j = 0; j < cate.ListCategory.size(); j++){
                if (sup.ListSupplier.get(i).getId()== name1 || cate.ListCategory.get(j).getId()== name2) {
                ListProduct.add(new Product(id, name, price,quantity,status, Supplier.ListSupplier.get(i),cate.ListCategory.get(j)));  
                }
            }
            
        }
        
    }
    
    public void displayProduct(ArrayList<Product> ListProduct){
        for (int i = 0; i < ListProduct.size(); i++) {
			System.out.println(ListProduct.get(i));
		}
    }

    
    
    }

    

