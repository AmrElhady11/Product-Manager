package com.ProductManager.model;

import com.ProductManager.entity.ProductEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDetails {
    private Integer id;
    private ProductEntity productId;
    private String name;
    private LocalDate expirationDate;
    private String manufacturer;
    private Double price;
    private Boolean available ;

}
