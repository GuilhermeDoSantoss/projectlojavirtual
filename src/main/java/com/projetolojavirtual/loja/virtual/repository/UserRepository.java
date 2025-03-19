package com.projetolojavirtual.loja.virtual.repository;


import com.projetolojavirtual.loja.virtual.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
