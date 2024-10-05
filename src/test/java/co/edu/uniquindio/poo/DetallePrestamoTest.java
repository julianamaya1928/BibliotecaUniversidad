package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class DetallePrestamoTest {
    private static final Logger LOG = Logger.getLogger(DetallePrestamoTest.class.getName());
        //getLogger(PrestamoTest.class.getName())
    @Test
    public void datosvacios() {
        Libro libro = new Libro("", "", "", "", "", null, 0);
        LOG.info("Inicializando test datos vacios");
        assertThrows(Throwable.class, ()->new DetallePrestamo(libro,0,0.0));
        LOG.info("Finalizando test datos vacios");
    }

    @Test
    public void testCantidadNegativa() {
    Libro libro = new Libro("001", "12345", "Autor", "Título", "Editorial", LocalDate.now(), 10);
    assertThrows(IllegalArgumentException.class, () -> new DetallePrestamo(libro, -1, 500.0), 
        "No se debe permitir una cantidad negativa en el préstamo");
    }
    @Test
    public void testValorNegativo() {
    Libro libro = new Libro("001", "12345", "Autor", "Título", "Editorial", LocalDate.now(), 10);
    assertThrows(IllegalArgumentException.class, () -> new DetallePrestamo(libro, 2, -100.0), 
        "No se debe permitir un valor negativo en el préstamo");
    }
    @Test
    public void testCantidadCero() {
    Libro libro = new Libro("001", "12345", "Autor", "Título", "Editorial", LocalDate.now(), 10);
    assertThrows(IllegalArgumentException.class, () -> new DetallePrestamo(libro, 0, 500.0), 
        "La cantidad del préstamo no puede ser 0");
}



}
