package ajedrez;

import java.util.Scanner;

public class Juego {

	public Juego() {	
	}

	// metodo para recibir fila
	public static int Fila(int fIngresada) {
		return fIngresada;
	}

	// metodo para recibir columna
	public static int Columna(int cIngresada) {
		return cIngresada;
	}

	public static String[] PosiIngresada(int f, int c) {

		String[] datosPosIngresada = new String[3];
		String posicionIngresada = Tablero.tablero[f][c];
		datosPosIngresada[0] = posicionIngresada;
		datosPosIngresada[1] = Integer.toString(f);
		datosPosIngresada[2] = Integer.toString(c);
		System.out.println("Has seleccionado la siguiente pieza : " + posicionIngresada);
		return datosPosIngresada;
	}

	// metodo para guardar el color seleccionado
	public static String colorseleccion(String[] colorF) {

		String colorseleccionado = "";

		if (colorF[0].contains("b")) {
			System.out.println("La ficha seleccionada es blanca");
			colorseleccionado = "BLANCO";

		} else if (colorF[0].contains("n")) {
			System.out.println("La ficha seleccionada es negra");
			colorseleccionado = "NEGRO";
		} else {
			System.out.println("No hay ficha en la posición seleccionada");
		}

		return colorseleccionado;
	}

	// metodo para recibir fila
	public static int FilaAmover(int fIngresadaMover) {
		return fIngresadaMover;
	}

	// metodo para recibir columna
	public static int ColumnAmover(int cIngresadaMover) {
		return cIngresadaMover;

	}

	public static String[] PosiMover(int fMover, int cMover) {

		String[] datosPosiMover = new String[3];
		String posicionAMover = Tablero.tablero[fMover][cMover];
		datosPosiMover[0] = posicionAMover;
		datosPosiMover[1] = Integer.toString(fMover);
		datosPosiMover[2] = Integer.toString(cMover);

		return datosPosiMover;
	}
}
