package com.cisco.training.ui;

import java.util.Scanner;

import com.cisco.training.domain.Product;
import com.cisco.training.service.ProductService;
import com.cisco.training.service.ProductServiceImpl;

public class ProductConsoleUI {
	
	ProductService service = new ProductServiceImpl();
	
	public void addProductWithUI()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter name : ");
		String name = kb.nextLine();
		
		System.out.println("Enter Price : ");
		float price = Float.parseFloat(kb.nextLine());
		
		
		System.out.println("Enter Quantity : ");
		int q= Integer.parseInt(kb.nextLine());
		
		Product p = new Product(name,price,q);
		
		int id = service.addNewPorduct(p);
		
		System.out.println("Created a product with id : "+id);
		
		kb.close();
		
	}
}
