package com.shakti.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.shakti.bean.*;

@Entity
@Table(name="Product")
public class Product {
	
	@Id
	@Column(name="productid")
	private String productid;
	
	@Column(name="productname")
    @NotNull(message="product name is must")
	private String productname;
	
	@ManyToOne
    @JoinColumn(name = "categoryid")
	private Category category;	
	public Product() {
		super();
	}
	public Product(String productid, String productname ,Category category) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.category = category;
	}
	public String getproductid() {
		return productid;
	}
	public void setproductid(String productid) {
		this.productid = productid;
	}
	public String getproductname() {
		return productname;
	}
	public void setproductname(String productname) {
		this.productname = productname;
	}
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	
	}

}
