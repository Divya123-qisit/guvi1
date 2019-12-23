package com.product;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ProductApp {
	private List<Product> productList = new LinkedList<Product>();
	public void sellProduct(int id, int qunatiy)throws InvalidProductException{
			ListIterator<Product>ls=productList.ListIterator();
			Product product=null;
			double price=0;
			while (Is.hasNext()) {
			product = Is.next();
			if (Product.getId()==id) {
				price=((quantity*(product.getPrice())))*product.getDiscount())/100;
				System.out.println("total price"+price);
				break;
		}
			else{
				throw new InvalidProductException("invalid product id");
			}
		}
			return product.getPrice()*quantity-price;
	}
	public void purchageProduct(int id,int quantity){

	public ProductApp(String fileName) {
		// read the file and populate booklist
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));

			String line = null;
			while ((line = br.readLine()) != null) {
				String[] tokens = line.split(":");
				Product product = new Product(Integer.parseInt(tokens[0]), tokens[1],
						Double.parseDouble(tokens[2]),Integer.parseInt(tokens[3]),Integer.parseInt(4));
				productList.add(product);

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		public void printAllBooks() {
			for (Product product : productList) {
				System.out.println(product);
			}
		}




}
