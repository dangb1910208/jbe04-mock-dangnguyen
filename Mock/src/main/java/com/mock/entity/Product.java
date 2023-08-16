package com.mock.entity;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private Integer productId;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "product_desc")
	private String productDesc;
	
	@ManyToOne
	@JoinColumn(name = "category_id", referencedColumnName = "category_id")
	@JsonBackReference
	private Category category_id;
	
	@OneToMany(mappedBy = "productId", cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<VariantProduct> variantproducts;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public Category getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Category category_id) {
		this.category_id = category_id;
	}

	public List<VariantProduct> getVariantproducts() {
		return variantproducts;
	}

	public void setVariantproducts(List<VariantProduct> variantproducts) {
		this.variantproducts = variantproducts;
	}
	
	


}
