package com.antoscorp.glpi_backend.controllers;

import com.antoscorp.glpi_backend.entities.Computer;
import com.antoscorp.glpi_backend.services.ComputerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/computers")

public class ComputerController {

    private final ComputerService computerService;

    public ComputerController(ComputerService computerService) {
        this.computerService = computerService;
    }

    @GetMapping
    public List<Computer> getAllComputers() {
        return computerService.getAllComputers();
    }
}
