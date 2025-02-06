package com.vhaporfiro.ProjetoWebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vhaporfiro.ProjetoWebServices.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
