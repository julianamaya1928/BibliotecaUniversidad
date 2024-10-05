package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;

public class Biblioteca {
    private String nombre;
    private LinkedList<Estudiante> estudiantes;
    private LinkedList<Bibliotecario> bibliotecarios;
    private LinkedList<Libro> libros;
    private LinkedList<Prestamo> prestamos;


    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new LinkedList<>();
        this.bibliotecarios = new LinkedList<>();
        this.libros = new LinkedList<>();
        this.prestamos = new LinkedList<>();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return " En la Biblioteca " + nombre + ", se ecuentran los siguientes estudiantes :\n " + estudiantes + "\n los siguientes bibliotecarios :\n " + bibliotecarios
                + "\n y los libros : \n" + libros + ", con los prestamos : " + prestamos;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void agregarBibliotecario(Bibliotecario bibliotecario) {
        bibliotecarios.add(bibliotecario);
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public Prestamo Prestamo(double valor, Estudiante estudiante, LocalDate localDate, Bibliotecario bibliotecario) {
        Prestamo prestamo = new Prestamo(valor, estudiante, LocalDate.now());
        prestamos.add(prestamo);
        bibliotecario.aumentarPrestamos(); 
        return prestamo;
    }

    public void mostrarCantidadPrestamosBibliotecario() {
        for (Bibliotecario bibliotecario : bibliotecarios) {
            System.out.println("Bibliotecario: " + bibliotecario.getNombre() + " - Préstamos realizados: " + bibliotecario.getNumeroPrestamos());
        }
    }

    public void mostrarCantidadPrestamosLibro(String tituloBuscado) {
        int cantidad = 0;
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(tituloBuscado)) {
                cantidad++;
            }
        }
        System.out.println("Cantidad de préstamos para el libro : " + tituloBuscado + " : " + cantidad);
    }
    
    
    public Estudiante obtenerEstudianteConMasPrestamos() {
        Estudiante estudianteConMasPrestamos = null;
        int maxPrestamos = 0;
        for (Estudiante estudiante : estudiantes) {
            int prestamosEstudiante = contarPrestamosEstudiante(estudiante);
            if (prestamosEstudiante > maxPrestamos) {
                maxPrestamos = prestamosEstudiante;
                estudianteConMasPrestamos = estudiante;
            }
        }
        return estudianteConMasPrestamos;
    }
    
    public int contarPrestamosEstudiante(Estudiante estudiante) {
        int prestamosEstudiante = 0;
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getEstudiante().equals(estudiante)) {
                prestamosEstudiante++;
            }
        }
        return prestamosEstudiante;
    }
    
    public void mostrarEstudianteConMasPrestamos() {
        Estudiante estudianteConMasPrestamos = obtenerEstudianteConMasPrestamos();
        if (estudianteConMasPrestamos != null) {
            System.out.println("Estudiante con más préstamos: " + estudianteConMasPrestamos.getNombre()+"");
        } else {
            System.out.println("No hay préstamos registrados.");
        }
    }
    

    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
}




