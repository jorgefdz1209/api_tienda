package com.miempresa.api_tienda.dto;

import jakarta.validation.constraints.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClienteDTO {
    private Long id;

    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;

    @Email(message = "Correo electrónico no válido")
    private String correo;

    @NotBlank(message = "El teléfono es obligatorio")
    private String telefono;
}