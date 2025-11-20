package com.miempresa.api_tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.miempresa.api_tienda.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}