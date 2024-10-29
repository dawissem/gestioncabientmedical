package com.dawissem.gestionmedical.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.management.relation.Role;
import java.util.Date;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Employe {
    @Id
    private long id;
    private String cin;
    private String nom;
    private String prenom;
    private Role String;
    private String motdepasse;
    private String Nimtel;
    private Date  Datederecuretment;

}
