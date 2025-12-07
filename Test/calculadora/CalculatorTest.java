package calculadora;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testSumarDosNumerosPositivos() {
        Calculator calc = new Calculator();
        double resultado = calc.sumar(2.0, 3.0);
        assertEquals(5.0, resultado, 1e-9);
    }
    
    @Test
public void testSumarPositivoYNegativo() {
    Calculator calc = new Calculator();
    double resultado = calc.sumar(5.0, -2.0);
    assertEquals(3.0, resultado, 1e-9);
}

@Test
public void testSumarConCero() {
    Calculator calc = new Calculator();
    double resultado = calc.sumar(0.0, 7.5);
    assertEquals(7.5, resultado, 1e-9);
}

@Test
public void testRestarDosNumerosPositivos() {
    Calculator calc = new Calculator();
    double resultado = calc.restar(5.0, 3.0);
    assertEquals(2.0, resultado, 1e-9);
}

@Test
public void testRestarPositivoYNegativo() {
    Calculator calc = new Calculator();
    double resultado = calc.restar(5.0, -2.0);
    assertEquals(7.0, resultado, 1e-9);
}

@Test
public void testMultiplicarDosPositivos() {
    Calculator calc = new Calculator();
    double resultado = calc.multiplicar(4.0, 2.5);
    assertEquals(10.0, resultado, 1e-9);
}

@Test
public void testMultiplicarPositivoYNegativo() {
    Calculator calc = new Calculator();
    double resultado = calc.multiplicar(5.0, -3.0);
    assertEquals(-15.0, resultado, 1e-9);
}

@Test
public void testMultiplicarPorCero() {
    Calculator calc = new Calculator();
    double resultado = calc.multiplicar(7.0, 0.0);
    assertEquals(0.0, resultado, 1e-9);
}

@Test
public void testDividirDosPositivos() {
    Calculator calc = new Calculator();
    double resultado = calc.dividir(10.0, 2.0);
    assertEquals(5.0, resultado, 1e-9);
}

@Test
public void testDividirPositivoYNegativo() {
    Calculator calc = new Calculator();
    double resultado = calc.dividir(9.0, -3.0);
    assertEquals(-3.0, resultado, 1e-9);
}

@Test(expected = IllegalArgumentException.class)
public void testDividirEntreCeroLanzaExcepcion() {
    Calculator calc = new Calculator();
    calc.dividir(5.0, 0.0);
}

@Test
public void testRaizCuadradaDeNumeroPerfecto() {
    Calculator calc = new Calculator();
    double resultado = calc.raizCuadrada(4.0);
    assertEquals(2.0, resultado, 1e-3);  // precisión 1e-3
}

@Test
public void testRaizCuadradaDeDos() {
    Calculator calc = new Calculator();
    double resultado = calc.raizCuadrada(2.0);
    // valor real ≈ 1.4142
    assertEquals(1.414, resultado, 1e-3);
}

@Test
public void testExponencialDeCero() {
    Calculator calc = new Calculator();
    double resultado = calc.exponencial(0.0);
    assertEquals(1.0, resultado, 1e-3);
}

@Test
public void testExponencialDeUno() {
    Calculator calc = new Calculator();
    double resultado = calc.exponencial(1.0);
    // e ≈ 2.718
    assertEquals(2.718, resultado, 1e-3);
}

@Test
public void testExponencialDeMenosUno() {
    Calculator calc = new Calculator();
    double resultado = calc.exponencial(-1.0);
    // e^-1 ≈ 0.3679
    assertEquals(0.368, resultado, 1e-3);
}


}

