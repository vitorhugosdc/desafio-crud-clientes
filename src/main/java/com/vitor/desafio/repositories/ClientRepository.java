package com.vitor.desafio.repositories;

import com.vitor.desafio.entites.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
