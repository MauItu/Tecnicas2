package Controlador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Controlador.Controlador;
import Modelo.Modelo;
import Vista.Vista;

public class Main {
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Controlador controlador = new Controlador(modelo);
        Vista vista = new Vista(controlador);

        Scanner scanner = new Scanner(System.in);

        boolean ejecucion = true;
        while (ejecucion) {
            System.out.println("\n--- Sistema de Gestión Hospitalaria ---");
            System.out.println("1. Ingresar nuevo paciente");
            System.out.println("2. Visualizar pacientes en el hospital");
            System.out.println("3. Salir del programa");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    ingresarNuevoPaciente(scanner, controlador);
                    break;
                case 2:
                    vista.mostrarPacientes();
                    break;
                case 3:
                    ejecucion = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }

        scanner.close();

        System.out.println("Programa finalizado.");
    }

    private static void ingresarNuevoPaciente(Scanner scanner, Controlador controlador) {
        System.out.println("\n--- Ingreso de Nuevo Paciente ---");
        System.out.println("Ingrese el número de seguridad social del paciente:");
        String numeroSeguridadSocial = scanner.nextLine();
        System.out.println("Ingrese el número de cédula del paciente:");
        String CC = scanner.nextLine();
        System.out.println("Ingrese el nombre del paciente:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese los apellidos del paciente:");
        String apellidos = scanner.nextLine();
        System.out.println("Ingrese la fecha de nacimiento del paciente (en formato dd/MM/yyyy):");
        String fechaNacimientoStr = scanner.nextLine();
        Date fechaNacimiento = null;
        try {
            fechaNacimiento = new SimpleDateFormat("dd/MM/yyyy").parse(fechaNacimientoStr);
        } catch (ParseException e) {
            System.out.println("Formato de fecha incorrecto. Por favor, ingrese la fecha en formato dd/MM/yyyy.");
            return;
        }

        controlador.ingresarNuevoPaciente(numeroSeguridadSocial, CC, nombre, apellidos, fechaNacimiento);

        System.out.println("Nuevo paciente ingresado con éxito.");
    }
}
