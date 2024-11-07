package es.santander.ascender.proyecto03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    Calculadora calculadora = new Calculadora();

    @Test
    public void TestSumar(){
        long resultado = calculadora.sumar(10, 5);
        assertEquals(resultado,15, "10+5 deberia ser 15");

    }

    @Test
    public void testRestar() {
        long resultado = calculadora.restar(4,2);
        assertEquals(resultado, 2,"4-2deberia ser 2");

    }

    @Test
    public void testcalcularTablaMultiplicar() {
        calculadora.calcularTablaMultiplicar(9);

    }
}    
        



    


























































