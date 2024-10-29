package com.dawissem.gestionmedical.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RendezVous {
    @Id
    private Long id_rendezvous;
    private Date date;

    public void ajouter(int id_rendezvous){
    this.id_rendezvous=getId_rendezvous();
    }
}
