import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraDescuentoTest {

    @Test
    void calcularDescuentoException() {

        assertThrows(IllegalArgumentException.class, () -> new CalculadoraDescuento().calcularDescuento(-1, 1000.0));
    }

    @Test
    void calcularDescuento() {

        assertEquals(800.0, new CalculadoraDescuento().calcularDescuento(75, 1000.0));
        assertEquals(1000.0, new CalculadoraDescuento().calcularDescuento(0, 1000.0));

    }
}