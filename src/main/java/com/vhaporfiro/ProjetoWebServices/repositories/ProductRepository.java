package com.vhaporfiro.ProjetoWebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vhaporfiro.ProjetoWebServices.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
