package com.antoscorp.glpi_backend.services;

import com.antoscorp.glpi_backend.entities.Computer;
import com.antoscorp.glpi_backend.repositories.ComputerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComputerService {

    private final ComputerRepository computerRepository;

    public ComputerService(ComputerRepository computerRepository) {
        this.computerRepository = computerRepository;
    }

    public List<Computer> getAllComputers() {
        return computerRepository.findAll();
    }
}
