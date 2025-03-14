package com.antoscorp.glpi_backend.repositories;

import com.antoscorp.glpi_backend.entities.Computer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputerRepository extends JpaRepository<Computer, Long> {

}
