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
			multiplicacion(ent);
			break;
		case "DIVISIÓN":
			break;
		default:
			System.out.println("Esta opción no está disponible");
		}// fin switch case

	}// fin main

	public static void multiplicacion(Scanner ent) {
		System.out.println("Ingresa el primer numero");
		double num1 = Double.parseDouble(ent.nextLine());
		System.out.println("Ingresa el segundo numero");
		double num2 = Double.parseDouble(ent.nextLine());
		System.out.println("El resultado es: " + (num1 * num2));

	}

}
