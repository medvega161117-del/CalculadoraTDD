package calculadora;

public class Calculator {

    // Método de suma implementado con TDD
    public double sumar(double a, double b) {
        return a + b;
    }

    // Método de resta implementado con TDD
    public double restar(double a, double b) {
        return a - b;
    }

    // Método multiplicar implementado y probado con TDD
    public double multiplicar(double a, double b) {
        return a * b;
    }

    // Método dividir con manejo de excepción y TDD
    public double dividir(double a, double b) {
        if (b == 0.0) {
            throw new IllegalArgumentException("No se puede dividir entre cero");
        }
        return a / b;
    }

    private double valorAbsoluto(double x) {
        return x < 0 ? -x : x;
    }

    //Metodo raiz cuadrada implementado y probado con TDD
    public double raizCuadrada(double x) {
        if (x < 0.0) {
            throw new IllegalArgumentException("No se puede calcular la raíz de un número negativo");
        }
        if (x == 0.0) {
            return 0.0;
        }

        double aproximacion = x;
        for (int i = 0; i < 50; i++) {
            double mejor = 0.5 * (aproximacion + x / aproximacion);
            if (valorAbsoluto(mejor - aproximacion) < 1e-6) {
                aproximacion = mejor;
                break;
            }
            aproximacion = mejor;
        }
        return aproximacion;
    }

    //Metodo funcion exponencial implementado y probado con TDD
    public double exponencial(double x) {
        double suma = 1.0;
        double termino = 1.0;

        for (int n = 1; n < 50; n++) {
            termino = termino * x / n;
            suma += termino;
            if (valorAbsoluto(termino) < 1e-6) {
                break;
            }
        }
        return suma;
    }
}
