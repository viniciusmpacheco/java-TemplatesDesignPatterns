package application;

import java.util.Scanner;

import patterns.creational.factory_method.*;

public class Program {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("######################################");
		System.out.println("            DESIGN PATTERNS           ");
		System.out.println("######################################\n");
		
		System.out.println("Escolha qual tipo de design pattern:");
		System.out.println("1 - Padrão criacional:");
		System.out.println("2 - Padrão comportamental:");
		System.out.println("3 - Padrão estrutural:");
		System.out.print("Opção: ");
		
		Integer option = scan.nextInt();
		while(true) {
			switch(option) {
				case 1:
					System.out.println("\nEscolha qual o de design pattern:");
					System.out.println("1 - Factory Method:");
					System.out.println("2 - Abstract Factory:");
					System.out.println("3 - Singleton:");
					System.out.println("4 - Builder:");
					System.out.println("5 - Prototype:");
					System.out.print("Opção: ");
					
					option = scan.nextInt();
					switch(option) {
						case 1:
							FactoryMethodClient.run();
						case 2:
						case 3:
						case 4:
						case 5:
					}
				case 2:
				case 3:
			}
		}
	}
}
