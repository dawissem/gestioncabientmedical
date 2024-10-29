package com.dawissem.gestionmedical.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Secretaire extends Employe {
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public long getId() {
        return id;
    }
}
