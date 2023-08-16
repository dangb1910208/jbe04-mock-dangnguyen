package com.mock.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_id")
	private Integer addressId;
	@Column(name = "city")
	private String city;
	@Column(name = "country")
	private String country;
	@Column(name = "address")
	private String address;
	
	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "user_id")
	@JsonBackReference
	private User user_id;
	
}
