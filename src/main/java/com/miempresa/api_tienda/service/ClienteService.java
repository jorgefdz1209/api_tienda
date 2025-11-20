package com.miempresa.api_tienda.service;

import com.miempresa.api_tienda.dto.ClienteDTO;
import java.util.List;

public interface ClienteService {
    ClienteDTO crear(ClienteDTO clienteDTO);
    ClienteDTO obtenerPorId(Long id);
    List<ClienteDTO> listarTodos();
    ClienteDTO actualizar(Long id, ClienteDTO clienteDTO);
    void eliminar(Long id);
}