package com.ProductManager;

import com.ProductManager.dao.Impl.ProductRepositoryImpl;
import com.ProductManager.dao.ProductRepository;
import com.ProductManager.entity.ProductEntity;
import com.ProductManager.model.ProductDetails;
import com.ProductManager.service.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertTrue;

@TestPropertySource("/application-test.properties")
@SpringBootTest
public class ProductServiceTest {
    @Autowired
    private ProductService productService;
    @Autowired
    private ProductRepository productRepository;

    private ProductDetails productDetails;
    private ProductEntity productEntity;
    @BeforeEach
    void setUp() {
        productDetails = createProductDetails();  
    }

    @Test
    public void addProductService(){


        assertTrue(productService.addProduct(productDetails),"add product failed");

    }



    private ProductDetails createProductDetails() {
            productEntity.setName("productTest");
        return ProductDetails.builder()
                .price(5000.0)
                .name("productTest")
                .available(true)
                .manufacturer("TestFactory")
                .expirationDate(LocalDate.now())
                .productId(productEntity)
                .build();
    }

}
