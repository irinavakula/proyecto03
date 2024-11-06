package es.santander.ascender.proyecto03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestSumaro {

    @Test
    public void TestSumar() {
        Calculadora calculadora = new Calculadora();
        long resultado = calculadora.sumar(5,10);
        
        assertEquals(15, resultado, "10-5 deberla");

    }
}

