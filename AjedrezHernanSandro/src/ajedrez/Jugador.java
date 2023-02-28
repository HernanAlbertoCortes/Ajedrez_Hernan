package ajedrez;

import java.util.Scanner;

public class Jugador {
	
	private String color;
	private String blanco;
	private String negro;

	public Jugador(String color, String blanco, String negro) {
		this.color = color;
		this.blanco = blanco;
		this.negro = negro;
	}

	public String getBlanco() {
		return blanco;
	}

	public void setBlanco(String blanco) {
		this.blanco = blanco;
	}

	public String getNegro() {
		return negro;
	}

	public void setNegro(String negro) {
		this.negro = negro;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static void usuario() {
		Scanner src = new Scanner(System.in);
		boolean a = true;
		while (a) {
			System.out.println("Elija el color :");
			System.out.println("Blanco o Negro");
			String usuario = src.next().toUpperCase();

			if (usuario.equals("BLANCO")) {
				System.out.println("Has elegido Fichas Blancas");
				
				a = false;

			} else if (usuario.equals("NEGRO")) {
				System.out.println("Has elegido Fichas Negras");
				a = false;

			} else {
				System.out.println("Opcion incorrecta. Vuelve a introducirlo");
			}
			System.out.println("");
		}
	}

}
