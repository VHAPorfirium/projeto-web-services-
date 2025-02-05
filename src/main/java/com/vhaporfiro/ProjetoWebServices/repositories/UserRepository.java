package com.vhaporfiro.ProjetoWebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vhaporfiro.ProjetoWebServices.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
