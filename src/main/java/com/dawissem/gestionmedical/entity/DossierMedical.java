package com.dawissem.gestionmedical.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DossierMedical {
    @jakarta.persistence.Id
    @Id
    private  long id ;

public void afficher(String rapport){

}
}
