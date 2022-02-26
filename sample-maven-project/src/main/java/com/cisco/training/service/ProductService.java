package com.cisco.training.service;

import java.util.List;
import java.util.Optional;

import com.cisco.training.domain.Product;

public interface ProductService {

	public int addNewPorduct(Product toBeAdded);

	public void removeExisting(int id);

	public Optional<Product> findById(int id);

	public List<Product> findAll();
}
