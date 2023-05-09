package com.assnigment.demo.Entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int productid;
private String product;
private int quantity;
private int price;
public int getProductid() {
	return productid;
}
public void setProductid(int productid) {
	this.productid = productid;
}
public String getProduct() {
	return product;
}
public void setProduct(String product) {
	this.product = product;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public Product(int productid, String product, int quantity, int price) {
	super();
	this.productid = productid;
	this.product = product;
	this.quantity = quantity;
	this.price = price;
}
public Product() {
	super();
	
}
@Override
public String toString() {
	return "Product [productid=" + productid + ", product=" + product + ", quantity=" + quantity + ", price=" + price
			+ "]";
}

}
