package com.tup.buensabor.repository;
import com.tup.buensabor.entities.ArticuloInsumoReceta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticuloInsumoRecetaRepository extends JpaRepository<ArticuloInsumoReceta, Long> {
    // Puedes agregar métodos personalizados relacionados con ArticuloInsumoReceta si es necesario
}
