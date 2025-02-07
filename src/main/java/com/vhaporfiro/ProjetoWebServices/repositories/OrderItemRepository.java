package com.vhaporfiro.ProjetoWebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vhaporfiro.ProjetoWebServices.entities.OrderItem;
import com.vhaporfiro.ProjetoWebServices.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
    
}
