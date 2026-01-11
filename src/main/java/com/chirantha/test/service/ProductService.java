package com.chirantha.test.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chirantha.test.model.Product;
import com.chirantha.test.repository.productRepository;

@Service
public class ProductService {

    @Autowired
    productRepository productRepository;

    // List<Product> products = new ArrayList<>(Arrays.asList(
    // new Product(1, "Laptop", 999),
    // new Product(2, "Smartphone", 499),
    // new Product(3, "Tablet", 299)));

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // public Product getProductById(int id) {
    // return products.stream()
    // .filter(product -> product.getProd_id() == id)
    // .findFirst()
    // .orElse(new Product(0, "No Item Found", 0));
    // }

    public Product getProductById(int id) {
        return productRepository.findById(id).orElse(new Product());
    }

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }
}
