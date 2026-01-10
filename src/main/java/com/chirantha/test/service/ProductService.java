package com.chirantha.test.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.chirantha.test.model.Product;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(1, "Laptop", 999),
            new Product(2, "Smartphone", 499),
            new Product(3, "Tablet", 299)));

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProductById(int id) {
        return products.stream()
                .filter(product -> product.getProd_id() == id)
                .findFirst()
                .orElse(new Product(0, "No Item Found", 0));
    }

    public Product addProduct(Product product) {
        products.add(product);
        return product;
    }
}
