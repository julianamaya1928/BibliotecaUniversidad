package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Prestamo {
    private double valor;
    private Estudiante estudiante;
    private LocalDate fechaPrestamo;

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }
    public Prestamo(double valor, Estudiante estudiante2, LocalDate fechaPrestamo) {
        this.valor = valor;
        this.estudiante = estudiante2;
        this.fechaPrestamo = fechaPrestamo;
    }
    public Estudiante getEstudiante() {
        return estudiante;
    }
    public double getValor() {
        return valor;
    }
    @Override
    public String toString() {
        return "Valor : " + valor + ", estudiante : " + estudiante + ", fechaPrestamo : " + fechaPrestamo;
    }
}

