package ajedrez;

import java.util.Scanner;

public class Jugador {

	private String colorJugador;

	public Jugador(String colorJugador) {
		this.colorJugador = colorJugador;
	}

	public String getColorJugador() {
		return colorJugador;
	}

	public static String usuario() {
		Scanner src = new Scanner(System.in);

		System.out.println("Elija el color :");
		System.out.println("Blanco o Negro");
		String usuario = src.next().toUpperCase();

		if (usuario.equals("BLANCO")) {
			System.out.println("Has elegido Fichas Blancas");
			
			//Guardar color introducido
			String colorJugador = src.nextLine();
			//Asignar ese color al jugador
			Jugador colorAsignado = new Jugador(colorJugador);

		} else if (usuario.equals("NEGRO")) {
			System.out.println("Has elegido Fichas Negras");
			
			//Guardar color introducido
			String colorJugador = src.nextLine();
			//Asignar ese color al jugador
			Jugador colorAsignado = new Jugador(colorJugador);

		} else {
			System.out.println("Opcion incorrecta. Vuelve a introducirlo");
		}
		System.out.println("");

		return "";
	}

}
