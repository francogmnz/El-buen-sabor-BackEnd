package com.tup.buensabor.repository;
import com.tup.buensabor.entities.IngredienteReceta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticuloInsumoRecetaRepository extends JpaRepository<IngredienteReceta, Long> {
    // Puedes agregar métodos personalizados relacionados con ArticuloInsumoReceta si es necesario
}
