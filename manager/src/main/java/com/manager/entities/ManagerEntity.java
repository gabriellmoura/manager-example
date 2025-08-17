package com.manager.entities;


import com.manager.dto.ManagerDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "manager")
public class ManagerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column
    private String name;

    @Column
    private Long capacity;

    private UUID centralId;

    private UUID tenantId;

    private UUID groupId;

    private String funcional;

    public ManagerEntity() {
    }

    public ManagerEntity(String name, Long capacity, UUID centralId, UUID tenantId, UUID groupId, String funcional) {
        this.name = name;
        this.capacity = capacity;
        this.centralId = centralId;
        this.tenantId = tenantId;
        this.groupId = groupId;
        this.funcional = funcional;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCapacity() {
        return capacity;
    }

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }

    public UUID getCentralId() {
        return centralId;
    }

    public void setCentralId(UUID centralId) {
        this.centralId = centralId;
    }

    public UUID getTenantId() {
        return tenantId;
    }

    public void setTenantId(UUID tenantId) {
        this.tenantId = tenantId;
    }

    public UUID getGroupId() {
        return groupId;
    }

    public void setGroupId(UUID groupId) {
        this.groupId = groupId;
    }

    public String getFuncional() {
        return funcional;
    }

    public void setFuncional(String funcional) {
        this.funcional = funcional;
    }

    public ManagerDTO toDTO(){
        return new ManagerDTO(this.getName(), this.getCapacity(), this.getCentralId(),
                this.getTenantId(), this.getGroupId(), this.getFuncional());
    }
}
