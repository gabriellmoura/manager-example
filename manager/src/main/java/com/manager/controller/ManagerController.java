package com.manager.controller;

import com.manager.dto.ManagerDTO;
import com.manager.service.ManagerService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/manager")
@Validated
class ManagerController {

    private ManagerService service;

    public ManagerController(ManagerService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<ManagerDTO> save(@Valid @RequestBody ManagerDTO managerDTO) {
        return ResponseEntity.ok(service.save(managerDTO));
    }
}
