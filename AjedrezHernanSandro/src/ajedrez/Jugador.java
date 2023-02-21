package ajedrez;

import java.util.Scanner;

public class Jugador {
	
	String color;
	
	public Jugador(String color) {
		this.color=color;
	}
	
	public static void usuario(){
		Scanner src= new Scanner(System.in);
		boolean a =true;
		while(a) {
			System.out.println("");
			System.out.println("Antes de jugar elija el color.");
			System.out.println("Ingrese 1 para Blancas y 2 para Negras.");
			int usuario = src.nextInt();
			if(usuario==1) {
			System.out.println("Has seleccionado jugar con Blancas.");
			a=false;
			} else if(usuario==2) {
			System.out.println("Has seleccionado jugar con Negras.");
			a=false;
			}else {
			System.out.println("Numero incorrecto, introduzca un numero valido");
			
			}
		}
	}
}
