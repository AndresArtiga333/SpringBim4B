package com.andresartiga.soccerfieldmanager.models;

import java.io.Serializable;
import java.sql.Date;

import com.andresartiga.soccerfieldmanager.utils.Status;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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

    private Status status;
    @ManyToOne // defecto: fetch eager
    // one to many y meny to many tiene  lazy
    // primer palabra defina a la calse donde esta many es a reservaciones y la segunda hacia el atributo que esta direccionando, one es a user
    private User user;
    @ManyToOne
    private SoccerField soccerField;
}
