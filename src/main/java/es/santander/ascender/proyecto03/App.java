package es.santander.ascender.proyecto03;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        long resultado = calculadora.sumar(47,5);
        System.out.print("The result of calculation is - ");
        System.out.println(resultado);
    }
}
