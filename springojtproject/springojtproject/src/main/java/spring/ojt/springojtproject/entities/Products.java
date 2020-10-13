package spring.ojt.springojtproject.entities;

public class Products {

private String id;
private String name;
private double price;
private String memory;

public Products() {
	
}

public Products(String id, String name, double price, String memory) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.memory = memory;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getNameOfProduct() {
	return name;
}

public void setNameOfProduct(String name) {
	this.name = name;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public String getMemory() {
	return memory;
}

public void setMemory(String memory) {
	this.memory = memory;
}

@Override
public String toString() {
	return "Products [id=" + id + ", name=" + name + ", price=" + price + ", memory=" + memory + "]";
}


		
}

