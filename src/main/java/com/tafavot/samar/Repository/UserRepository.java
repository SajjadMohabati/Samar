package com.tafavot.samar.Repository;

import com.tafavot.samar.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<Users, Long> {

}
