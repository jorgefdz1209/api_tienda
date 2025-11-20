package com.miempresa.api_tienda.service;

import com.miempresa.api_tienda.dto.ProductoDTO;
import java.util.List;

public interface ProductoService {
    ProductoDTO crear(ProductoDTO productoDTO);
    ProductoDTO obtenerPorId(Long id);
    List<ProductoDTO> listarTodos();
    ProductoDTO actualizar(Long id, ProductoDTO productoDTO);
    void eliminar(Long id);
}