package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		// CICLOS O BUCLES 
		//Nos ayudan a ejecutar "n" veces una accion de acuerdo a una condicion
		
		//En el caso de los cilcos nos apoyamos de una variable muchas veces numerica 
		//porque de acuerdo al cambio de esa variable es como se va a ejecutar una accion
		
		//WHILE (Mientras...., se cumpla una condicion)
		
		int x = 1;
		
		/*while (x<5) {//Mientras x sea menor a 5, realiza lo sig
			System.out.println(x);//Se ejecuta 1vez pero se vuelve a evaluar
			x++;//Para evitar que el ciclo tienda al infinito indicamos un incremento de 1 para x
		}
		
		//DO WHILE -Similar al ciclo while pero aseguramos que nuestro codigo se ejecute al menor
		//una vez en caso de caer en una situacion donde una condcion sea falsa porque 
		//la condicion se evaluara al final*/
		
		/*do {//Haz lo siguiente
			System.out.println(x);
			x++;
		}while (x>2); //miestras x sea mayor a 2*/
		
		//FOR -Ciclo determinado Se utiliza cuando conocemos cuantas veces se realice una accion
		
		//Ciclo for (variable iniciada; condicion; incremento)
		for (int i = 1; i <= 5; i++) {
			System.out.println("hola mundo " + i);
		}
	}

}
