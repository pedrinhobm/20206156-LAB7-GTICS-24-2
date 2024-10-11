package com.example.clase7gtics.repository;

import com.example.clase7gtics.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
    public Users findByEmail(String email);

}


