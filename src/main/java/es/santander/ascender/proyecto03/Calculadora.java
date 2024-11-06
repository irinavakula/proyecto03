package es.santander.ascender.proyecto03;
public class Calculadora {
    public long sumar(long sumado1, long sumado2) {
        return sumado1 + sumado2;

    }

    public long restar(long substraendo, long minuedo) {
        return substraendo - minuedo;
    }
    
    public long multiplicar(long factor1, long factor2) {
        return factor1 * factor2;
    }   
    
    public long dividir(long dividendo, long divisor) {
        return dividendo / divisor;
    }

    public void presentarTablaDMultiplicar(int numero) {
        for (int i = 0; i <= 10; i = i + 1) {
            System.out.print(1 * numero);
        }
        

    } 
    public void calcularTablaMultiplicar(int numero) {
        int[] ta = null;

        int[] borrame = new int[11];

        borrame[0] = 3;

        borrame[4] = 6;

        borrame[7] = borrame[0] + borrame[4];

        System.out.println(borrame[7]);
    }
}      