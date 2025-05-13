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

}
