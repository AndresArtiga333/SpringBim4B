package com.andresartiga.soccerfieldmanager.models;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
@Entity
@Data
@Table(name ="reservacion")
public class Reservacion implements Serializable {
    @Id
    @Column(name ="idReservacion")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idReservacion;

    private Date starTime;
    private Date endTime;
    private String payment;

}
