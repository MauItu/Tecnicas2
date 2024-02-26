package Vista;

import Controlador.Controlador;
import Modelo.Paciente;
import java.util.List;


public class Vista {
    private Controlador controlador;

    public Vista(Controlador controlador) {
        this.controlador = controlador;
    }

    public void mostrarPacientes() {
        List<Paciente> pacientes = controlador.obtenerPacientes();
        System.out.println("--- Lista de Pacientes ---");
        for (Paciente paciente : pacientes) {
            System.out.println("Nombre: " + paciente.getNombreCompleto());
            System.out.println("Número de Seguro Social: " + paciente.getNumSegSocial());
            System.out.println("Cédula: " + paciente.getCC());
            System.out.println("Fecha de Nacimiento: " + paciente.getFechaNacimiento());
            System.out.println("----------------------------");
        }
    }
}
