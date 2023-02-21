package ajedrez;

import java.util.Scanner;

public class Juego {

	private String fichas;

	public Juego(String fichas) {
		this.setFichas(fichas);
	}

	public String getFichas() {
		return fichas;
	}

	public void setFichas(String fichas) {
		this.fichas = fichas;
	}

	// metodo para recibir fila
	public static int Fila() {
		Scanner src = new Scanner(System.in);
		System.out.println("");
		System.out.println("Ingrese la fila de la pieza que quieres mover: ");
		int fila = src.nextInt();
		return fila;
	}
	// metodo para recibir columna
	public static int Columna() {
		Scanner src = new Scanner(System.in);
		System.out.println("");
		System.out.println("Ingrese la columna de la pieza que quieres mover: ");
		int columna = src.nextInt();
		return columna;
	}

	public static String PosiIngresada() {
		Scanner src = new Scanner(System.in);
		int fila=Juego.Fila();
		int columna=Juego.Columna();
		String posicionIngresada = Tablero.tablero[fila][columna];
		System.out.println(posicionIngresada);

		return posicionIngresada;

	}
	// metodo para recibir fila
	public static int FilaAmover() {
		Scanner src = new Scanner(System.in);
		System.out.println("");
		System.out.println("Ingrese la fila donde deseas mover: ");
		int fila = src.nextInt();
		return fila;
	}
	// metodo para recibir columna
	public static int ColumnAmover() {
		Scanner src = new Scanner(System.in);
		System.out.println("");
		System.out.println("Ingrese la columna donde deseas mover: ");
		int columna = src.nextInt();
		return columna;
	}
	public static String PosiMover() {
		Scanner src = new Scanner(System.in);
		int moverFila=Juego.FilaAmover();
		int moverColumna=Juego.ColumnAmover();
		String posicionAMover = Tablero.tablero[moverFila][moverColumna];

		return posicionAMover;
	}
}
