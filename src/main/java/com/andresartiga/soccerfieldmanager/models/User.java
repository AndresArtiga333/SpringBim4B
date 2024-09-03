package com.andresartiga.soccerfieldmanager.models;

import java.io.Serializable;

import com.andresartiga.soccerfieldmanager.DTOs.UserRegistroDTO;
import com.andresartiga.soccerfieldmanager.utils.PasswordEncrypt;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
@NoArgsConstructor
@Entity
@Data
@Table(name = "user")

public class User implements Serializable {
    @Id
    @Column(name = "id")
    private String id;
    @Email(message="debe de ingresar un correo valido")
    @Column(unique=true, name= "email")
    private String email;
    @Column(unique=true, name ="username")
    private String username;

    private String name;
    private String lastname;
    @NotBlank
    private String password;
    private String profilePhoto;

    public User(UserRegistroDTO userDTO, String img){
        this.email = userDTO.getEmail();
        this.username = userDTO.getUsername();
        this.password = PasswordEncrypt.encryptPassword(userDTO.getPassword());
        this.name = userDTO.getName();
        this.lastname = userDTO.getLastname();
        this.profilePhoto = img;
    }
}
