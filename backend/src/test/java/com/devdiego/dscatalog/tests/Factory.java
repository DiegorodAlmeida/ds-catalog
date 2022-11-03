package com.devdiego.dscatalog.tests;

import java.time.Instant;

import com.devdiego.dscatalog.dto.ProductDTO;
import com.devdiego.dscatalog.entities.Category;
import com.devdiego.dscatalog.entities.Product;

public class Factory {

	public static Product createProduct() {
		Product product = new Product(1L, "Phone", "Good Phone", 800.0, "http://img.com/img.png", Instant.parse("2022-10-11T03:00:00Z"));
		product.getCategories().add(new Category(2L, "Electronics"));
		return product;
	}
	

	public static ProductDTO createProductDTO() {
		Product product = createProduct();
		return new ProductDTO(product, product.getCategories());
	}
}
