package com.example.clase7gtics.repository;

import com.example.clase7gtics.entity.rooms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface roomRepository extends JpaRepository<rooms, Integer> {

}

