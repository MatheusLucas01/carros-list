package com.carros.demo.repository;

import com.carros.demo.entity.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

// Herança da interface JpaRepository
public interface CarroRepository extends JpaRepository<Carro, Long> {

}
