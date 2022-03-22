package com.example.Integracion_Siom.Repository;

import com.example.Integracion_Siom.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
}
