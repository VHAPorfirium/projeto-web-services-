package com.vhaporfiro.ProjetoWebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vhaporfiro.ProjetoWebServices.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
