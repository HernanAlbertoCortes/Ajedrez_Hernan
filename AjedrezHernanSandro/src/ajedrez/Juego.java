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
		System.out.println("Introduzca la fila de la figura que quieres usar");
		int fila = src.nextInt();
		return fila;
	}

	// metodo para recibir columna
	public static int Columna() {
		Scanner src = new Scanner(System.in);
		System.out.println("");
		System.out.println("Introduzca la columna de la figura que quieres usar");
		int columna = src.nextInt();
		return columna;
	}

	public static String[] PosiIngresada() {

		String[] datosPosIngresada = new String[3];
		int fila = Juego.Fila();
		int columna = Juego.Columna();
		String posicionIngresada = Tablero.tablero[fila][columna];
		datosPosIngresada[0] = posicionIngresada;
		datosPosIngresada[1] = Integer.toString(fila);
		datosPosIngresada[2] = Integer.toString(columna);
		System.out.println(posicionIngresada);
		// public static void comprobarColorFicha() {

		if (posicionIngresada.contains("b")) {
			System.out.println("La ficha seleccionada es blanca");

		} else if (posicionIngresada.contains("n")) {
			System.out.println("La ficha seleccionada es negra");
		} else {
			System.out.println("No hay ficha en la posición seleccionada");
		}

		return datosPosIngresada;
	}

	// metodo para recibir fila
	public static int FilaAmover() {
		Scanner src = new Scanner(System.in);
		System.out.println("");
		System.out.println("Introduzca la fila donde quieres mover la pieza seleccionada");
		int filaA = src.nextInt();
		return filaA;
	}

	// metodo para recibir columna
	public static int ColumnAmover() {
		Scanner src = new Scanner(System.in);
		System.out.println("");
		System.out.println("Introduzca la columna donde quieres mover la pieza seleccionada");
		int columnaA = src.nextInt();
		return columnaA;
	}

	public static String[] PosiMover() {
		String[] datosPosiMover = new String[3];
		int moverFila = Juego.FilaAmover();
		int moverColumna = Juego.ColumnAmover();
		String posicionAMover = Tablero.tablero[moverFila][moverColumna];
		datosPosiMover[0] = posicionAMover;
		datosPosiMover[1] = Integer.toString(moverFila);
		datosPosiMover[2] = Integer.toString(moverColumna);

		return datosPosiMover;
	}
}
