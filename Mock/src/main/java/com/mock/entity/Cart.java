package com.mock.entity;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cart_id")
	private Integer cartId;
	
	@OneToOne(mappedBy = "cart_id")
	@JsonManagedReference
	private User user_id;
	
	@OneToOne(mappedBy = "cart_id")
	@JsonManagedReference
	private VariantProduct variantproduct_id;
	
	@OneToMany(mappedBy = "cartId", cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Cart> carts;
}
