package co.edu.uniquindio.poo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
//import org.junit.platform.commons.logging.Logger;
import java.util.logging.Logger;

public class PrestamoTest {
    
    private static final Logger LOG = Logger.getLogger(PrestamoTest.class.getName());
        //getLogger(PrestamoTest.class.getName())
    @Test
    public void datosvacios() {
        LOG.info("Inicializando test datos vacios");
        LocalDate fecha = LocalDate.of(0, 0, 00);
        Estudiante estudiante = new Estudiante("", "", "", "");
        assertThrows(Throwable.class, ()->new Prestamo(0.0,estudiante,fecha));
        LOG.info("Finalizando test datos vacios");
    }

    @Test
public void testFechaPrestamo() {
    Estudiante estudiante = new Estudiante("Mario", "78901", "555-1234", "mario@example.com");
    LocalDate fecha = LocalDate.of(2022, 5, 14);
    Prestamo prestamo = new Prestamo(1000.0, estudiante, fecha);
    
    assertEquals(fecha, prestamo.getFechaPrestamo());
    assertEquals("Mario", prestamo.getEstudiante().getNombre());
    assertEquals("78901", prestamo.getEstudiante().getCedula());
    assertEquals("555-1234", prestamo.getEstudiante().getTelefono());
    assertEquals("mario@example.com", prestamo.getEstudiante().getCorreo());
}

    @Test
    public void testValorNegativo() {
    Estudiante estudiante = new Estudiante("Luis", "67890", "555-6789", "luis@example.com");
    LocalDate fecha = LocalDate.of(2023, 7, 10);
    Prestamo prestamo = new Prestamo(-2000.0, estudiante, fecha);
    assertTrue(prestamo.getValor() >= 0, "El valor del préstamo no puede ser negativo");
    }


}
