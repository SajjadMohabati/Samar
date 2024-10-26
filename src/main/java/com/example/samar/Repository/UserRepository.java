package com.example.samar.Repository;

import com.example.samar.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<Users, Long> {

}
