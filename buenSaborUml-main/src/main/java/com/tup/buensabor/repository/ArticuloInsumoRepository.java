package com.tup.buensabor.repository;
import com.tup.buensabor.entities.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticuloInsumoRepository extends JpaRepository<Ingrediente, Long> {
    // Puedes agregar métodos personalizados relacionados con ArticuloInsumo si es necesario
}
