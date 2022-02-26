package com.cisco.training.dal;

import java.util.List;
import java.util.Optional;

import com.cisco.training.domain.Product;

public interface ProductDAO {

	public Product save(Product toBeSaved);

	public Optional<Product> findById(int id);

	public List<Product> findAll();

	public void deleteById(int id);
}
