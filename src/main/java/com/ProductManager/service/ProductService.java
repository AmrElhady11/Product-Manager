package com.ProductManager.service;

import com.ProductManager.model.Product;
import com.ProductManager.model.ProductDetails;

import java.util.List;


public interface ProductService {
 boolean addProduct(ProductDetails productDetails);
 List<Product> getAllProduct ();
 boolean updateProduct(ProductDetails productDetails);
 boolean deleteProduct(int id);
 ProductDetails getProductDetails(int id);
 ProductDetails getProductDetailsByProductId(int ProductId);
}
