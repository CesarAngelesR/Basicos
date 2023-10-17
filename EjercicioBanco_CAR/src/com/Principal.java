package com;

import java.util.HashMap;
import java.util.Map;

public class Principal {

	public static void main(String[] args) {
		//Crear el HashMap que nos va a yudar a simular una base de datos
		
		Map <Integer,Cuenta> cuentas = new HashMap<Integer,Cuenta>(); 
		
		//Podemos almacenar objetos en el HashMap de dos formas:
		//Creando cada objeto cuenta individual y asignarlo posteriormente
		
		Cuenta cesar = new Cuenta("Cesar", 50000, "Debito", 500, 60000);
		cuentas.put(1001, cesar);

		//La segunda forma es creando las cuentas directamente en el:
		
		cuentas.put(1002, new Cuenta("Alanis", 20000, "Debito", 500, 30000));
		cuentas.put(1003, new Cuenta("Oscar", 5000, "Debito", 1000, 30000));
		cuentas.put(1004, new Cuenta("Sergio", 8000, "Debito", 500, 60000));
		cuentas.put(1005, new Cuenta("Rafael", 500, "Debito", 100, 100000));
		cuentas.put(1006, new Cuenta("Guadalupe", 11000, "Debito", 100, 20000));
		
		
		//Las operaciones recaen en el objeto cajero deacuerdo a sus metodos
		//Instanciamos un cajero que realizara dichas operaciones
		Cajero cajero1=new Cajero("Polanco, CDMX",cuentas);
		
		//Consultar la informacion de una cuenta espeficica o buscarla 
		//Quien se encarga de eso es el cajero
		
		//System.out.println(cajero1.buscarCuenta(1001));
		
		//Probando el metodo depositar exitoso		
		//System.out.println(cajero1.depositar(1005, 50000));
		
		//Depostar a una cuenta que no existe
		//System.out.println(cajero1.depositar(1010, 1000));
		
		//Depositar a una cuenta depostitando un monto mayor al saldoMaximo
		//System.out.println(cajero1.depositar(1006, 25000));
		
		//Depositar a una cuenta resultando la suma del saldo mas el monto depositado, mayor que saldoMax
		//System.out.println(cajero1.depositar(1006,10000));
		
		//Probando el metodo retirar exitoso
		//System.out.println(cajero1.retirar(1001,5000));
		
		//Probando metodo transferir
		System.out.println(cajero1.transferir(1001, 1005, 1000));
		System.out.println(cajero1.buscarCuenta(1005));
		
		//Actividad sugerida
		//Ejercicio que simule una maquina expendedora
		
	}

}
