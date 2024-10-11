package com.example.clase7gtics.repository;
import com.example.clase7gtics.entity.Reservations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservations,Integer> {

}
