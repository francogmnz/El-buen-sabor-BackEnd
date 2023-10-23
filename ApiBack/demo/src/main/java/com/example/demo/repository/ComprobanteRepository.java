package com.example.demo.repository;

import com.example.demo.entities.Comprobante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComprobanteRepository extends JpaRepository <Comprobante, Long> {
}
