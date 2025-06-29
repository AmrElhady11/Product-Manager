package com.ProductManager.dao;

import com.ProductManager.entity.ProductDetailsEntity;
import com.ProductManager.entity.ProductEntity;

import java.util.List;

public interface ProductRepository  {
    void save(ProductEntity product);
    ProductEntity insert(ProductDetailsEntity productDetails);
    ProductEntity findById(int id);
    void deleteById(int id);
    void update(ProductDetailsEntity productDetails);
    List<ProductEntity> findAll();
    ProductDetailsEntity findProductDetailsById(int id);
    ProductDetailsEntity findProductDetailsByProductId(int productId);
}
