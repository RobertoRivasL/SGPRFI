import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class ContenedorTest {

    private Contenedor contenedor;
    private final InputStream systemIn = System.in;

    @Mock
    private Validaciones validacionesMock;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        contenedor = new Contenedor();
        contenedor.validar = validacionesMock;
    }



    private void provideInput(String data) {
        ByteArrayInputStream testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    private void restoreSystemInput() {
        System.setIn(systemIn);
    }

    @Test
    public void testListarUsuariosVacio() {
        assertEquals(0, contenedor.listaAsesoria.size());
    }

    @Test
    public void testEliminarUsuarioInexistente() {
        String input = "12345678\n";     // RUN inexistente
        provideInput(input);

        try {
            contenedor.eliminarUsuario();
            assertEquals(0, contenedor.listaAsesoria.size());
        } finally {
            restoreSystemInput();
        }
    }
}