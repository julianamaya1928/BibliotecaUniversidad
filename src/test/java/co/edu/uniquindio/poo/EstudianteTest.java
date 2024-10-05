package co.edu.uniquindio.poo;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
public class EstudianteTest {
    
    private static final Logger LOG = Logger.getLogger(EstudianteTest.class.getName());

    @Test
    public void datosvacios() {
        LOG.info("Inicializando test datos vacios");
        assertThrows(Throwable.class, ()->new Estudiante(" ", " ", " ", " "));
        LOG.info("Finalizando test datos vacios");
    }
}
