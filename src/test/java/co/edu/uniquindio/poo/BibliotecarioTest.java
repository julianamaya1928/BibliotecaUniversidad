package co.edu.uniquindio.poo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class BibliotecarioTest {
    private static final Logger LOG = Logger.getLogger(BibliotecarioTest.class.getName());

    @Test
    public void datosvacios() {
        LOG.info("Inicializando test datos vacios");
        assertThrows(Throwable.class, ()->new Bibliotecario(" ", " ", " ", " ", 0,0));
        LOG.info("Finalizando test datos vacios");
    }

    @Test
    public void testCalcularSalario() {
    Bibliotecario biblio = new Bibliotecario("Juan", "123456789", "3001234567", "juan@mail.com", 10, 5);
    double salarioEsperado = (10 * 0.20) + ((10 * 0.20) * (5 * 0.02));
    assertEquals(salarioEsperado, biblio.getSalario(), 0.01); // Margen de error para decimales
    }
    @Test
    public void testAumentarPrestamos() {
    Bibliotecario biblio = new Bibliotecario("Ana", "987654321", "3009876543", "ana@mail.com", 5, 2);
    int prestamosAntes = biblio.getNumeroPrestamos();
    biblio.aumentarPrestamos();
    assertEquals(prestamosAntes + 1, biblio.getNumeroPrestamos());
    }

}
