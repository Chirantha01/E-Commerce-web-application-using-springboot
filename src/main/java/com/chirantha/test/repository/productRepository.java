package com.chirantha.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chirantha.test.model.Product;

@Repository
public interface productRepository extends JpaRepository<Product, Integer> {

}
