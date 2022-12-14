//package com.teksystems.capstone1.database.entity;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//
//@Getter
//@Setter
//@ToString
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity
//@Table(name="Product")
//public class Product {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name="id")
//	private Integer id;
//	
//	@Column(name="product_image")
//	private String productImage;
//	
//	
//	@Column(name="product_name")
//	private String productName;
//	
//	@Column(name="description")
//	private String description;
//	
//	@Column(name="price")
//	private String price;
//	
//	@Column(name="category")
//	private String category;
//	
//	@Column(name="type")
//	private String type;
//	
//	@ManyToOne(fetch = FetchType.EAGER, optional = false)
//	@JoinColumn(name="Order_details", nullable = false)
//	private OrderDetails orderDetails;
//}
//
