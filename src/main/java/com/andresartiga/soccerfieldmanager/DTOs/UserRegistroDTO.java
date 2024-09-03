package com.andresartiga.soccerfieldmanager.DTOs;

import java.io.Serializable;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserRegistroDTO implements Serializable {
    private String id;
    @NotBlank(message = "el correo es obligatorio")
    @Email(message="Ingresa una direccion de correo valida")
    private String email;
    @NotBlank(message = "Ingrese una contra porfa")
    private String password;
    @NotBlank(message = "El usuario es obligatorio")
    private String username;
    private String name;
    private String lastname;

}
