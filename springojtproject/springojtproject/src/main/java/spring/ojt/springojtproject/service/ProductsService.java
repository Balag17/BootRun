package spring.ojt.springojtproject.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import spring.ojt.springojtproject.entities.Products;

@Service
public class ProductsService {
	 private List<Products> productList = new ArrayList<>(Arrays.asList(

			 	new Products("1", "Samsung Galaxy", 30000, "2GB"),
	            new Products("2", "Iphone11", 60000, "3GB" ),
	            new Products("3", "Dell Latitude", 40000, "2GB"),
	            new Products("4", "HP", 47000, "4GB"),
	            new Products("5", "Asus", 9000, "1GB"),
	            new Products("6", "Motorola", 12000, "3GB"),
	            new Products("7", "Nokia", 11000, "4GB")

	    ));
	 
	 public List<Products> getAllProductList(){
		 return productList;
	 }
	 
	 public Products getProduct(String id) {
		 return productList.stream().filter(products -> products.getId().equals(id)).findFirst().get();
	 }
	 
	 public double getProductPrice(String id) {
		 double priceHold =0;
		 for(Products product : productList) {
			 if(product.getId().equals(id)) {
				 priceHold=  product.getPrice();
			 }
		 }
		 return priceHold;
	 }
	 
	 public void addProduct(Products products) {
		 productList.add(products);
	 }
	 
	 public void updateProduct(Products products, String id) {
		 int count =0;
		 for(Products product : productList) {
			 if(product.getId().equals(id)) {
				 productList.set(count, products);
			 }
			 count++;
		 }
	 }
	 
	 public void deleteProduct(String id) {
		 productList.removeIf(products -> products.getId().equals(id));
	 }
}
