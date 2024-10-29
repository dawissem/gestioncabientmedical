package com.dawissem.gestionmedical.entity;

import com.dawissem.gestionmedical.Enum.Sex;
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
public class Patient {
    @Id
    private Long id;

    private int id_patient;
    private String cin;
    private String nom;
    private String prenom;
    private String NumTel;
    private Sex sex;
    private Date Datedenaisance;
    private int age ;
    private String profession;

    public  void afficher(String nom) {
  /*      System.out.println("Invocation de setNom()") ;
        this.rapport = nom ;*/
    }

}
