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
public class Document {
    @Id
    private Long id;
    private String type;
    private Date datedecreatopn;
    void ajouter(){
        System.out.print("Doucment a ajoute");
    }
}
