package co.edu.unbosque.view;

import java.util.Scanner;

public class Consola {
	private Scanner sc;
	
	public Consola() {
		sc = new Scanner(System.in);
	}
	
	public int readInt() {
		return sc.nextInt();
	}
	
	public String readLine() {
		return sc.nextLine();
	}
	
	public String readWord() {
		return sc.next();
	}
	
	public void printWithLine(String text) {
		System.out.println(text);
	}
	
	public void printMenu() {
		System.out.println("Bienvenido, ingrese la opcion a realizar: ");
		System.out.println("1)Crear\n2)Eliminar\n3)Mostrar\n4)Actualizar\n5)Contar\n99)Salir");
	}
	
	public boolean readBoolean() {
		String entry = readLine();
		if (entry.toLowerCase().contains("si")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void quemarLinea() {
		sc.nextLine();
	}
	
}
