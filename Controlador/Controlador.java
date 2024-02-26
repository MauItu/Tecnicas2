package Controlador;

import Modelo.Modelo;
import Modelo.Paciente;
import java.util.Date;
import java.util.List;

public class Controlador {
    private Modelo modelo;

    public Controlador(Modelo modelo) {
        this.modelo = modelo;
    }

    public void ingresarNuevoPaciente(String numSegSocial, String CC, String nombre, String apellidos, Date fechaNacimiento) {
        Paciente nuevoPaciente = new Paciente(numSegSocial, CC, nombre, apellidos, fechaNacimiento);
        modelo.agregarPaciente(nuevoPaciente);
    }

    public List<Paciente> obtenerPacientes() {
        return modelo.getPacientes();
    }
}
