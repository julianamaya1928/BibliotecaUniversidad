package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca("ArteYVida");

        Bibliotecario bibliotecario1 = new Bibliotecario("Jimmy", "120139321", "312124555", "j@gmail.com", 6, 4);

        biblioteca.agregarBibliotecario(bibliotecario1);

        Estudiante estudiante1 = new Estudiante("Alonso", "43453534", "35256778", "al@gmail.com");
        Estudiante estudiante2 = new Estudiante("Julian", "7453352", "31343254", "ju@gmail.com");

        biblioteca.agregarEstudiante(estudiante1);
        biblioteca.agregarEstudiante(estudiante2);

        Libro libro1 = new Libro("01", "89783434", "Mario", "Saber cuando vivir", "periodico", LocalDate.of(2023, 1, 19), 25);
        Libro libro2 = new Libro("02", "5856856", "Leidy", "Solit", "periodico", LocalDate.of(2024, 12, 23), 10);

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        biblioteca.Prestamo(1333, estudiante2, LocalDate.now(), bibliotecario1);
        biblioteca.Prestamo(23242, estudiante2, LocalDate.now(), bibliotecario1);

        biblioteca.mostrarCantidadPrestamosBibliotecario();

        biblioteca.mostrarCantidadPrestamosLibro("Saber cuando vivir");
        biblioteca.mostrarCantidadPrestamosLibro("Solit");

        biblioteca.mostrarEstudianteConMasPrestamos();

        Biblioteca.mostrarMensaje(biblioteca.toString());

    }
}

