package com.andresartiga.soccerfieldmanager.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Data
@Table(name ="soccerfield") 
public class SoccerField implements Serializable {
    @Id
    @Column(name ="idsoccerf")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSoccerF;

    @Column(unique = true)
    private String fieldName;
    private String capacidad;
    private String foto;
}
