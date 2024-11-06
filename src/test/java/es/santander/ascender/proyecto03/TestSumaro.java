package es.santander.ascender.proyecto03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


public class TestSumaro {

    @Test
    public void TestSumar() {
        Calculadora calculadora = new Calculadora();
        long resultado = calculadora.sumar(5,10);
        
        assertEquals(15, resultado, "10-5 deberla");

    }
    
    @Test
    public void testdividirDivisionPorCero() {
        try {
        long resultado =calculadora.dividir(10, 0);
        fail("Debera haber lanzando un error de division por 0");

    } catch (Exeption e) {

        System.out.println(e);

    }
 
}

