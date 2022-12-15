package com.teksystems.capstone1.database.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter	
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="order")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
		
	@ManyToOne
	@JoinColumn(name="id", insertable=false, updatable=false)
	@EqualsAndHashCode.Exclude
	@ToString.Include
	private User user;
	
	@OneToMany(mappedBy = "order")
	@ToString.Exclude
	private List<OrderDetails> orderDetails;

		
}
