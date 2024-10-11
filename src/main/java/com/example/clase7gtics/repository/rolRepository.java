package com.example.clase7gtics.repository;

import com.example.clase7gtics.entity.rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface rolRepository extends JpaRepository<rol, Integer>{


}

