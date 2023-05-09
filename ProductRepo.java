package com.assnigment.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assnigment.demo.Entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>
{
	
}