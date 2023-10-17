package com.ciclos;

public class Ciclos5_CAR {

	public static void main(String[] args) {
		/*
		 * 5. Simular el comportamiento de un reloj digital, imprimiendo la hora,
		 * minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59
		 * horas
		 */

		int segundos = 0, minutos = 0, horas = 0;

		while (horas <= 23) {
			segundos++;
			if (segundos == 60) {
				segundos = 0;
				minutos++;
				if (minutos == 60) {
					minutos = 0;
					horas++;
				}
			}
			System.out.println(horas + ":" + minutos + ":" + segundos);
		}
	}
}