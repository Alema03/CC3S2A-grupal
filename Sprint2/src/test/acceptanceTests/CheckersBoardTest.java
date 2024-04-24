package test.acceptanceTests;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import production.business.AmericanCheckersGame;
import production.business.CheckersPiece;
import production.gui.AmericanCheckersGUI;

public class CheckersBoardTest extends TestCase {

    private AmericanCheckersGame juego;

    // Este método se ejecuta antes de cada prueba
    @Before
    public void setUp() throws Exception {
        juego = new AmericanCheckersGame();
    }

    // Este método se ejecuta después de cada prueba
    @After
    public void tearDown() throws Exception {
    }

    // Prueba para comprobar si el tablero se carga correctamente
    @Test
    public void testCheckersBoard() {
        boolean tableroUi = true; // Indicador para saber si el tablero se cargó correctamente
        try {
            new AmericanCheckersGUI(juego); // Intentar crear una nueva interfaz de usuario
        } catch (Exception e) {
            tableroUi = false; // Si ocurre una excepción, se marca como falso
            assertFalse("¡Ocurrió un error al cargar el tablero!", tableroUi); // Prueba fallida
            e.printStackTrace(); // Imprimir el error
        }
        assertTrue("¡El tablero se cargó con éxito!", tableroUi); // Prueba exitosa si el tablero se cargó
    }

    // Prueba para verificar la colocación de las piezas en el tablero
    @Test
    public void testCheckersBoardPiecePlacement() {
        juego.resetGame(); // Reiniciar el juego para obtener la configuración inicial
        CheckersPiece pieza; // Variable para almacenar la pieza actual
        for(int fila = 0; fila < 8; fila++) { // Iterar a través de las filas del tablero
            for(int columna = 0; columna < 8; columna++) { // Iterar a través de las columnas del tablero
                pieza = juego.getCheckersPiece(fila, columna); // Obtener la pieza en la posición actual

                // Comprobar las piezas rojas en las tres primeras filas
                if(fila < 3 && (fila + columna) % 2 == 1) {
                    assertNotNull(pieza); // Debería haber una pieza
                    assertEquals(
                            String.format("Debería haber una pieza roja en la posición fila: %s, columna: %s", fila, columna),
                            "RED",
                            pieza.getColor() // Comprobar que es roja
                    );
                    assertEquals(
                            String.format("No debería haber un rey en la posición fila: %s, columna: %s", fila, columna),
                            false,
                            pieza.isKing() // Comprobar que no es un rey
                    );

                    // Comprobar las piezas negras en las tres últimas filas
                } else if(fila > 4 && (fila + columna) % 2 == 1) {
                    assertNotNull(pieza); // Debería haber una pieza
                    assertEquals(
                            String.format("Debería haber una pieza negra en la posición fila: %s, columna: %s", fila, columna),
                            "BLACK",
                            pieza.getColor() // Comprobar que es negra
                    );
                    assertEquals(
                            String.format("No debería haber un rey en la posición fila: %s, columna: %s", fila, columna),
                            false,
                            pieza.isKing() // Comprobar que no es un rey
                    );

                    // Las filas intermedias no deberían tener piezas
                } else {
                    assertNull(pieza); // No debería haber ninguna pieza
                }
            }
        }
    }
}
