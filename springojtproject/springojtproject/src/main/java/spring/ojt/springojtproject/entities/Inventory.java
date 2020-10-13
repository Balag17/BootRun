package spring.ojt.springojtproject.entities;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Inventory {

	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	
	private long price;
	
	private String ram;

	public Inventory() {
		super();
	}

	public Inventory(int id, String name, long price, String ram) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.ram = ram;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Inventory [id=" + id + ", name=" + name + ", price=" + price + ", ram=" + ram + "]";
	}
	
	
	
}
