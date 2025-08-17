package com.manager.dto;


import com.manager.entities.ManagerEntity;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record ManagerDTO(
        @NotEmpty(message = "name must be fulfilled.")
        String name,
        @NotNull(message = "capacity must be fulfilled.")
        Long capacity,
        @NotNull(message = "centralId must be fulfilled.")
        UUID centralId,
        @NotNull(message = "tenantId must be fulfilled.")
        UUID tenantId,
        @NotNull(message = "groupId must be fulfilled.")
        UUID groupId,
        @NotEmpty(message = "funcional must be fulfilled.")
        String funcional
) {
        public ManagerEntity toEntity() {
                return new ManagerEntity(this.name, this.capacity, this.centralId,
                        this.tenantId, this.groupId, this.funcional);
        }
}
