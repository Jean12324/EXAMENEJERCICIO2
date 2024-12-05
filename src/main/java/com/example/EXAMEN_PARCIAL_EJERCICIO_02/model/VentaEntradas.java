/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.EXAMEN_PARCIAL_EJERCICIO_02.model;
import jakarta.validation.constraints.*;
/**
 *
 * @author Jeanc
 */
public class VentaEntradas {
    @NotBlank(message = "El nombre es obligatorio.")
    private String nombres;

    @NotBlank(message = "El apellido es obligatorio.")
    private String apellidos;

    @NotBlank(message = "El DNI es obligatorio.")
    @Pattern(regexp = "\\d{8}", message = "El DNI debe tener exactamente 8 dígitos.")
    private String dni;

    @NotBlank(message = "El lugar de residencia es obligatorio.")
    private String lugarResidencia;

    @NotBlank(message = "El número de contacto en caso de emergencia es obligatorio.")
    @Pattern(regexp = "\\d{9}", message = "El número de contacto debe tener 9 dígitos.")
    private String numeroContactoEmergencia;

    @NotBlank(message = "El número de teléfono personal es obligatorio.")
    @Pattern(regexp = "\\d{9}", message = "El número de teléfono personal debe tener 9 dígitos.")
    private String telefonoPersonal;

    @NotBlank(message = "El tipo de sangre es obligatorio.")
    private String tipoSangre;

    private String alergias;

    @Min(value = 1, message = "El número de kilómetros debe ser al menos 1.")
    private int kilometros;

    // Getters y Setters
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getLugarResidencia() {
        return lugarResidencia;
    }

    public void setLugarResidencia(String lugarResidencia) {
        this.lugarResidencia = lugarResidencia;
    }

    public String getNumeroContactoEmergencia() {
        return numeroContactoEmergencia;
    }

    public void setNumeroContactoEmergencia(String numeroContactoEmergencia) {
        this.numeroContactoEmergencia = numeroContactoEmergencia;
    }

    public String getTelefonoPersonal() {
        return telefonoPersonal;
    }

    public void setTelefonoPersonal(String telefonoPersonal) {
        this.telefonoPersonal = telefonoPersonal;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }
}
