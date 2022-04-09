package com.shakti.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.shakti.bean.*;

@Entity
@Table(name="Category")
public class Category {
	
	@Id
	@Column(name = "categoryid")
	private String categoryid;
	
	@NotNull(message="category name is must")
	@Column(name = "categoryname")
	private String categoryname;
	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
	private List<Product> product;
	
	
	public Category() {
		super();
	}
	public Category(String categoryid, String categoryname, List<Product> product) {
		super();
		this.categoryid = categoryid;
		this.categoryname = categoryname;
	}
	public String getcategoryid() {
		return categoryid;
	}
	public void setcategoryd(String categoryid) {
		this.categoryid = categoryid;
	}
	public String getcategoryname() {
		return categoryname;
	}
	public void setcategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	
	

}
