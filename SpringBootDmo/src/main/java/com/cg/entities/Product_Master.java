package com.cg.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Product_Master
{
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
      private int productId;
      private String productName;
      private float productPrice;
	public int getProductId() {
		return productId;
	}
//	public void setProductId(int productId) {
//		this.productId = productId;
//	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}
	public Product_Master(/*int productId,*/ String productName, float productPrice) {
		super();
		/*this.productId = productId;*/
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public Product_Master() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product_Master [productId=" + productId + ", productName=" + productName + ", productPrice="
				+ productPrice + "]";
	} 
}
	
	
//	use mydb;
//	select*from product_master;
//	create table product_master (productId int primary key,productName varchar(50),productPrice varchar(200));
//	insert into  product_master values(1,'vivo',33.45);
//	insert into  product_master values(2,'oneplus',444.1);
//	insert into  product_master values(3,'samsung',22.33);
//	insert into  product_master values(4,'oppo',111.45);
//	insert into  product_master values(5,'MI',33.45);
//	insert into  product_master values(6,'iPhoneX',313.45);