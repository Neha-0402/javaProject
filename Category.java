package com.assnigment.demo.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int categoryid;
	private String electronics;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="c_id", referencedColumnName = "categoryid")
	private List<Product> prd;

	
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
