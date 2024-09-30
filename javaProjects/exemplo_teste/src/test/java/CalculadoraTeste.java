import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

import com.example.Calculadora;

public class CalculadoraTeste {

       
class CalculadoraTest {

    Calculadora calculadora = new Calculadora();

    @Test
    void testSoma() {
        int resultado = calculadora.soma(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    void testSubtrai() {
        int resultado = calculadora.subtrai(5, 2);
        assertEquals(3, resultado);
    }

    @Test
    void testMultiplica() {
        int resultado = calculadora.multiplica(4, 2);
        assertEquals(8, resultado);
    }

    @Test
    void testDivide() {
        int resultado = calculadora.divide(10, 2);
        assertEquals(5, resultado);
    }

    @Test
    void testDividePorZero() {
        // Verifica se a exceção é lançada ao dividir por zero
        assertThrows(IllegalArgumentException.class, () -> calculadora.divide(10, 0));
    }
}

    }
