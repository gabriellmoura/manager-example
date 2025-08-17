package com.manager.service;

import com.manager.dto.ManagerDTO;
import com.manager.repositories.ManagerRepository;
import org.springframework.stereotype.Service;

@Service
public class ManagerService {

    private ManagerRepository repository;

    public ManagerService(ManagerRepository repository) {
        this.repository = repository;
    }

    public ManagerDTO save(ManagerDTO dto) {
        return repository.save(dto.toEntity()).toDTO();
    }
}
