package com.entornos.nombreCompleto.algoritmos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testLogaritmos {

    @Test
    public void testFactorial() {
        int valorEsperado = 1 * 2 * 3 * 4 * 5; // 120
        assertEquals(valorEsperado, Algoritmos.factorial(5));

        valorEsperado = 1;
        assertEquals(valorEsperado, Algoritmos.factorial(0));
    }

    @Test
    public void testFibonacci() {
        int valorEsperado = 0;
        assertEquals(valorEsperado, Algoritmos.fibonacci(0));

        valorEsperado = 21 ;// = 8
        assertEquals(valorEsperado, Algoritmos.fibonacci(8));
    }

    @Test
    public void testPrimo() {
        boolean valorEsperado = true;
        assertEquals(valorEsperado, Algoritmos.primo(7));

        valorEsperado = false; 
        assertEquals(valorEsperado, Algoritmos.primo(8));
    }
    
    @Test
    public void testExcepciones() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.factorial(-1));
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.fibonacci(-5));
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.primo(1));
    }

}
