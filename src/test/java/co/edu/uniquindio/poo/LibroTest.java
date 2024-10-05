package co.edu.uniquindio.poo;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class LibroTest {
    
    private static final Logger LOG = Logger.getLogger(LibroTest.class.getName());

    @Test
    public void datosvacios() {
        LOG.info("Inicializando test datos vacios");
        assertThrows(Throwable.class, ()->new Libro(" ", " ", " ", " ", "",LocalDate.parse("2000-01-01"),0));
        LOG.info("Finalizando test datos vacios");
    }
    @Test
    public void testStockNegativo() {
    Libro libro = new Libro("123", "987-654321", "Autor", "Titulo", "Editorial", LocalDate.now(), -5);
    assertTrue(libro.getstock() >= 0, "El stock no puede ser negativo");
    }

    @Test
    public void testValoresNulos() {
    assertThrows(NullPointerException.class, () -> new Libro(null, null, null, null, null, null, 0));
    }
}
