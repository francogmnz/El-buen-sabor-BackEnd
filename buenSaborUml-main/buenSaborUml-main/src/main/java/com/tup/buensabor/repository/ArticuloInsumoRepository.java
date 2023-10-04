package com.tup.buensabor.repository;
import com.tup.buensabor.entities.ArticuloInsumo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticuloInsumoRepository extends JpaRepository<ArticuloInsumo, Long> {
    // Puedes agregar métodos personalizados relacionados con ArticuloInsumo si es necesario
}
