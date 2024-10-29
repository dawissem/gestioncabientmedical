package com.dawissem.gestionmedical.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class medecin extends Employe {

    @Id
    private long id;
    private String Specialite;
    private String Dispobilibiliete;
    private int NbreREndezvous;

}
