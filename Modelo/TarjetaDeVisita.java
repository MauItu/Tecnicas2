package Modelo;

import java.util.Date;

public class TarjetaDeVisita {
    private int numeroTarjeta;
    private Date horaInicio;
    private Date horaFin;
    private Paciente paciente;

    public TarjetaDeVisita(int numeroTarjeta, Date horaInicio, Date horaFin, Paciente paciente) {
        this.numeroTarjeta = numeroTarjeta;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.paciente = paciente;
    }

    // Getters y Setters
}
