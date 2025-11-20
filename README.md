# api_tienda

Proyecto Java Spring Boot de ejemplo con arquitectura en capas para gestión de tienda (clientes y productos).

## Características

- CRUD REST para Producto y Cliente
- Arquitectura en capas: controller, service, repository, entity, dto, exception, config, security
- Spring Web, Spring Data JPA, Validation, Lombok, H2, springdoc-openapi (Swagger), MySQL (perfil)
- Manejo global de errores y validaciones
- Logging básico y configuración recomendada
- Documentación Swagger: [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

## Ejecución

Por defecto usa H2 en memoria.  
Para usar MySQL:  
```bash
SPRING_PROFILES_ACTIVE=mysql ./mvnw spring-boot:run
```

## Estructura de paquetes

- `controller` – Exposición de endpoints REST
- `service` y `service.impl` – Lógica de negocio
- `repository` – Acceso a datos (JPA)
- `entity`, `dto` – Entidades y DTOs con validación
- `exception` – Manejo global de errores
- `config` – OpenAPI/Swagger, otros beans
- `security` – Configuración básica de seguridad

---
> Autor: jorgefdz1209
