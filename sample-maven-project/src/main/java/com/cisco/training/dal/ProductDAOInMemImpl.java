package com.cisco.training.dal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.cisco.training.domain.Product;

public class ProductDAOInMemImpl implements ProductDAO {

	Map<Integer, Product> db = new HashMap<Integer, Product>();

	int idSequence = 0;

	public Product save(Product toBeSaved) {
		int id = ++idSequence;
		toBeSaved.setId(id);
		db.put(id, toBeSaved);
		return toBeSaved;
	}

	public Optional<Product> findById(int id) {
		Product p = db.get(id);
		if (p == null)
			return Optional.empty();
		else
			return Optional.of(p);
	}

	public List<Product> findAll() {
		return new ArrayList<Product>(db.values());
	}

	public void deleteById(int id) {
		db.remove(id);
	}

}
