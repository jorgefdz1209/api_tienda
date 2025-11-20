package com.miempresa.api_tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.miempresa.api_tienda.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}