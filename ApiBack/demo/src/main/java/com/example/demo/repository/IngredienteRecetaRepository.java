package com.example.demo.repository;

import com.example.demo.entities.Factura;
import com.example.demo.entities.IngredienteReceta;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IngredienteRecetaRepository extends BaseRepository<IngredienteReceta, Long>{

}
