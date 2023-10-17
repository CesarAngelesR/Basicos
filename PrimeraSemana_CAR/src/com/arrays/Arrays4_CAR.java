package com.arrays;

public class Arrays4_CAR {

	public static void main(String[] args) {
		/* 4. Dado un array de números de 5 posiciones con los siguientes valores:
		{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con 
		los valores invertidos, es decir, que el segundo array deberá tener los valores 
		{5,4,3,2,1}.*/
		
		int [] numeros1 = {1,2,3,4,5};
		int [] numeros2 = new int [5];
		int cont=0;
		
		for (int i = numeros1.length; 0<i ; i--) {
			numeros2[cont]= numeros1[i-1];
			cont++;
		}
		System.out.println("El array quedo de la siguiente manera: ");
		for (int i = 0; i < numeros2.length; i++) {
			System.out.print(numeros2[i] + " ");
		}
	}

}
