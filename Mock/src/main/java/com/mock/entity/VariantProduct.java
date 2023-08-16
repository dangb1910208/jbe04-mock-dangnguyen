package com.mock.entity;

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
import jakarta.persistence.OneToOne;
@Entity
public class VariantProduct {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "variantproduct_id")
	private Integer variantProductId;

	@Column(name = "variantproduct_name")
	private String variantProductName;

	@Column(name = "variantproduct_desc")
	private String variantProductDesc;

	@Column(name = "variantproduct_price")
	private Float variantProductPrice;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cart_id", referencedColumnName = "cart_id")
	@JsonManagedReference
	private Cart cart_id;

	@ManyToOne
	@JoinColumn(name = "product_id", referencedColumnName = "product_id")
	@JsonBackReference
	private Product productId;
	
	@ManyToOne
	@JoinColumn(name = "cart_id", referencedColumnName = "cart_id")
	@JsonBackReference
	private Cart cartId;

	public Integer getVariantProductId() {
		return variantProductId;
	}

	public void setVariantProductId(Integer variantProductId) {
		this.variantProductId = variantProductId;
	}

	public String getVariantProductName() {
		return variantProductName;
	}

	public void setVariantProductName(String variantProductName) {
		this.variantProductName = variantProductName;
	}

	public String getVariantProductDesc() {
		return variantProductDesc;
	}

	public void setVariantProductDesc(String variantProductDesc) {
		this.variantProductDesc = variantProductDesc;
	}

	public Float getVariantProductPrice() {
		return variantProductPrice;
	}

	public void setVariantProductPrice(Float variantProductPrice) {
		this.variantProductPrice = variantProductPrice;
	}

	public Product getProductId() {
		return productId;
	}

	public void setProductId(Product productId) {
		this.productId = productId;
	}
	
	
}
