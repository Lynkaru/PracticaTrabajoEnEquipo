package com.ceinmark.base;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		System.out.println("Elige qué operación quieres realizar: SUMA / RESTA / MULTIPLICACIÓN / DIVISIÓN");
		String operacion = ent.nextLine();
		switch (operacion) {
		case "SUMA":
			break;
		case "RESTA":
			break;
		case "MULTIPLICACIÓN":
			break;
		case "DIVISIÓN":
			division(ent);
			break;
		default:
			System.out.println("Esta opción no está disponible");
		}// fin switch case

	}// fin main

	public static void division(Scanner ent) {
		boolean divCero = true;
		double num = 0;
		double div = 0;
		do {
			System.out.println("Ingresa el número");
			num = Double.parseDouble(ent.nextLine());
			System.out.println("Ingresa el divisor");
			div = Double.parseDouble(ent.nextLine());
			if (div == 0) {
				System.out.println("El divisor no puede ser 0");
			} else {
				divCero = false;
			}
		} while (divCero);

		System.out.println("El resultado es: " + (num / div));
	}// fin division

}
