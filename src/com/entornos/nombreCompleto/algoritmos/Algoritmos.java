package com.entornos.nombreCompleto.algoritmos;

public abstract class Algoritmos {
		
	    /**
	     * Calcula el número de Fibonacci de un numero que lo recibimos
	     * @param numero numero entero 
	     * @return el numero de Fibonacci correspondiente al numero que hemos recibido
	     * @throws IllegalArgumentException si el número es menor que 0
	     */
		
		public static int fibonacci(int numero) {
	        if (numero < 0) {
	            throw new IllegalArgumentException("El numero debe de ser positivo para poder hacer los calculos oportunos");
	        }
	        
	        if (numero == 1) {
	        	return 1;
	        }
	        
	        if (numero == 0) {
	        	return 0;
	        }
	        
	       int a = 0;
	       int b = 1;
	               
	        for (int i = 2; i <= numero; i++) {
	            int res = a + b;
	            a = b;
	            b = res;
	        }
	        return b;
	    }
		
		/**
	     * Calcula el factorial de un numero que recibimos.
	     * @param numero numero entero
	     * @return el factorial del numero recibido
	     * @throws IllegalArgumentException si el numero es menor que 0
	     */
	    public static int factorial(int numero) {
	        if (numero < 0) {
	            throw new IllegalArgumentException("El número no puede ser negativo");
	        }
	        int resultado = 1;
	        for (int i = 2; i <= numero; i++) {
	            resultado *= i;
	        }
	        return resultado;
	    }
	    
	    /**
	     * Calcula si el numero es primo o no
	     * @param numero numero entero
	     * @return true si el número es primo o false en caso de que no lo sea
	     * @throws IllegalArgumentException si el número es menor que 2
	     */
	    public static boolean primo(int numero) {
	        if (numero < 2) {
	            throw new IllegalArgumentException("El número debe ser mayor o igual a 2");
	        }
	        for (int i = 2; i <= Math.sqrt(numero); i++) {
	            if (numero % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

}
