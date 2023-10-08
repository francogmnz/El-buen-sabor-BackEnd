package com.tup.buensabor.repository;
import com.tup.buensabor.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredienteRepository extends JpaRepository<Producto, Long> {
    // Puedes agregar métodos personalizados relacionados con ArticuloInsumo si es necesario
}
