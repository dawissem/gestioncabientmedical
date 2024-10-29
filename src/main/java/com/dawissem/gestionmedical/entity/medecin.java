package com.dawissem.gestionmedical.entity;

import jakarta.annotation.sql.DataSourceDefinition;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class medecin extends Employe {

    @Id
    private long id;
    private String Specialite;
    private String Dispobilibiliete;
    private int NbreREndezvous;

}
