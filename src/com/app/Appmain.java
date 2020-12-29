package com.app;
import java.util.Scanner;
import com.model.ElectronicProduct;

public class Appmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Product Id:");
		int productid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Product Name:");
		String productname=sc.nextLine();
		System.out.println("Enter the Product Price:");
		float productprice=sc.nextFloat();
		sc.nextLine();
		System.out.println("Enter the dimension:");
		String dimension=sc.nextLine();
		System.out.println("Enter the warrenty:");
		int warrenty=sc.nextInt();
		ElectronicProduct electronicproduct=new ElectronicProduct(productid,productname,productprice,dimension,warrenty);
		System.out.println("Product Id-"+electronicproduct.getProductId());
		System.out.println("Product Name-"+electronicproduct.getProductName());
		System.out.println("Product Price-"+electronicproduct.getPrice());
		System.out.println("Dimension-"+electronicproduct.getDimension());
		System.out.println("Warrenty-"+electronicproduct.getWarrenty());
		System.out.println("Discount amount-"+electronicproduct.calculateDiscount());

	}

}
