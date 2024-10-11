package com.example.clase7gtics.repository;
import com.example.clase7gtics.entity.obras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObrasRepository extends JpaRepository<obras, Integer> {
}

