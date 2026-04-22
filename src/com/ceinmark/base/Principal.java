package com.ceinmark.base;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		System.out.println("Elige qué operación quieres realizar: SUMA / RESTA / MULTIPLICACIÓN / DIVISIÓN");
		String operacion = ent.nextLine();
		switch (operacion) {
		case "SUMA": Suma(ent);
			break;
		case "RESTA":
			break;
		case "MULTIPLICACIÓN":
			break;
		case "DIVISIÓN":
			break;
		default:
			System.out.println("Esta opción no está disponible");
		}// fin switch case

	}// fin main

	public static void Suma(Scanner ent) {
		System.out.println("introduce el primer numero para sumar");
		int a = Integer.parseInt(ent.nextLine());
		System.out.println("introduce el segundo numero");
		int b = Integer.parseInt(ent.nextLine());
		
		System.out.println("el restultado de la suma es " +(a+b) );
	}

}
