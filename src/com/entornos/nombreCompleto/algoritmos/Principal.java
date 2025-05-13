package com.entornos.nombreCompleto.algoritmos;

public class Principal {

	 public static void main(String[] args) {
	        int[] numeros = new int[3];
	        int count = 0;

	        while (count < 3) {
	            int num = (int) (Math.random() * 9) + 2; 
	            boolean repetido = false;
	            for (int i = 0; i < count; i++) {
	                if (numeros[i] == num) {
	                    repetido = true;
	                    break;
	                }
	            }
	            if (!repetido) {
	                numeros[count++] = num;
	            }
	        }

	        int[] resultadoFibonacci = new int[3];
	        int [] resultadoFactorial = new int[3];
	        boolean[] resultadoPrimos = new boolean[3];

	        for (int i = 0; i < 3; i++) {
	            resultadoFibonacci[i] = Algoritmos.fibonacci(numeros[i]);
	            resultadoFactorial[i] = Algoritmos.factorial(numeros[i]);
	            resultadoPrimos[i] = Algoritmos.primo(numeros[i]);
	        }
	    }
	}

