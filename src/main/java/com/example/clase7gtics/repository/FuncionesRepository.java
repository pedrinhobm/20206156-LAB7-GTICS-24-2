package com.example.clase7gtics.repository;
import com.example.clase7gtics.entity.Funciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionesRepository extends JpaRepository<Funciones,Integer> {

}

