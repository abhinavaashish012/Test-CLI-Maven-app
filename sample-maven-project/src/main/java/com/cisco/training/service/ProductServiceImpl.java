package com.cisco.training.service;

import java.util.List;
import java.util.Optional;

import com.cisco.training.dal.ProductDAO;
import com.cisco.training.dal.ProductDAOInMemImpl;
import com.cisco.training.domain.Product;

public class ProductServiceImpl implements ProductService {

	ProductDAO dao = new ProductDAOInMemImpl();

	public int addNewPorduct(Product toBeAdded) {

		if (toBeAdded.getPrice() * toBeAdded.getQuantity() < 10000)
			throw new IllegalArgumentException("Product value is less than 10K");
		else {
			Product saved = dao.save(toBeAdded);
			return saved.getId();
		}
	}

	public void removeExisting(int id) {

		Optional<Product> opt = dao.findById(id);
		if (opt.isPresent()) {
			Product p = opt.get();
			if (p.getPrice() * p.getQuantity() > 100000)
				throw new IllegalStateException("Cant delete the product when value > 100K");
			else
				dao.deleteById(id);
		}

	}

	public Optional<Product> findById(int id) {
		return dao.findById(id);
	}

	public List<Product> findAll() {
		return dao.findAll();
	}

}
