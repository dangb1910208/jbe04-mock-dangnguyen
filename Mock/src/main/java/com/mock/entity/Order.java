package com.mock.entity;



import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id")
	private Integer orderId;
	
	@Column(name = "delivery_time")
	private Date deliveryTime;
	
	@Column(name = "order_date")
	private Date orderDate;
	
	@Column(name = "total_price")
	private Float totalPrice;
	
	@Column(name = "order_status")
	private String orderStatus;
	
	@Column(name = "reveiver_name")
	private String reveiverName;
	
	
	
}
