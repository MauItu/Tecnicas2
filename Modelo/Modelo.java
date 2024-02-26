package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Modelo {
    private List<Paciente> pacientes;

    public Modelo() {
        this.pacientes = new ArrayList<>();
    }

    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }
}
