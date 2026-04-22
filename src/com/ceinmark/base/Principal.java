package com.ceinmark.base;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		System.out.println("Elige qué operación quieres realizar: SUMA / RESTA / MULTIPLICACIÓN / DIVISIÓN");
		String operacion = ent.nextLine();
		switch (operacion) {
		case "SUMA": suma(ent);
			break;
		case "RESTA":resta(ent);
			break;
		case "MULTIPLICACIÓN":
			multiplicacion(ent);
			break;
		case "DIVISIÓN":
			division(ent);
			break;
		default:
			System.out.println("Esta opción no está disponible");
		}// fin switch case

	}// fin main


  public static void suma(Scanner ent) {
		System.out.println("introduce el primer numero para sumar");
		int a = Integer.parseInt(ent.nextLine());
		System.out.println("introduce el segundo numero");
		int b = Integer.parseInt(ent.nextLine());
		
		System.out.println("el restultado de la suma es " +(a+b) );
  }

	public static void resta(Scanner ent) {
		System.out.println("Ingresa el primer numero: ");
		int a = Integer.parseInt(ent.nextLine());
		
		System.out.println("Ingresa el segundo numero: ");
		int b= Integer.parseInt(ent.nextLine());
		
		System.out.println("El resultado es: " + (a-=b));
  }
  
	public static void multiplicacion(Scanner ent) {
		System.out.println("Ingresa el primer numero");
		double num1 = Double.parseDouble(ent.nextLine());
		System.out.println("Ingresa el segundo numero");
		double num2 = Double.parseDouble(ent.nextLine());
		System.out.println("El resultado es: " + (num1 * num2));
  }

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
