package Modelo;

import java.util.Date;

public class Paciente {
    private String numSegSocial;
    private String CC;
    private String nombre;
    private String apellidos;
    private Date fechaNacimiento;

    public Paciente(String numSegSocial, String CC, String nombre, String apellidos, Date fechaNacimiento) {
        this.numSegSocial = numSegSocial;
        this.CC = CC;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNumSegSocial() {
        return numSegSocial;
    }

    public void setNumSegSocial(String numSegSocial) {
        this.numSegSocial = numSegSocial;
    }

    public String getCC() {
        return CC;
    }

    public void setCC(String CC) {
        this.CC = CC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellidos;
    }
}
