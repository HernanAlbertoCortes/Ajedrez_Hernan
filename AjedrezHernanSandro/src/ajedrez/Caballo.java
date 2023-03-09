package ajedrez;

import java.util.Scanner;

public class Caballo implements Piezas {
	private String[] posiOriginal;

	public Caballo(String[] posiOriginal, String color) {
		this.posiOriginal = posiOriginal;

	}

	@Override
	public String mover(boolean turnoBlancas) {
		int filaEelegida = Integer.parseInt(posiOriginal[1]);
		int columnaElegida = Integer.parseInt(posiOriginal[2]);
		Scanner src = new Scanner(System.in);
		while (true) {
			System.out.println("Ingresa fila a donde mover ");
			int filaMoverCaballo = src.nextInt();
			System.out.println("Ingresa columna a donde mover ");
			int columnaMoverCaballo = src.nextInt();
			if (filaMoverCaballo == filaEelegida - 2 && columnaMoverCaballo == columnaElegida + 1
					|| filaMoverCaballo == filaEelegida - 1 && columnaMoverCaballo == columnaElegida + 2
					|| filaMoverCaballo == filaEelegida + 1 && columnaMoverCaballo == columnaElegida + 2
					|| filaMoverCaballo == filaEelegida + 2 && columnaMoverCaballo == columnaElegida + 1
					|| filaMoverCaballo == filaEelegida + 2 && columnaMoverCaballo == columnaElegida - 1
					|| filaMoverCaballo == filaEelegida + 1 && columnaMoverCaballo == columnaElegida - 2
					|| filaMoverCaballo == filaEelegida - 1 && columnaMoverCaballo == columnaElegida - 2
					|| filaMoverCaballo == filaEelegida - 2 && columnaMoverCaballo == columnaElegida - 1) {
				// Verificamos que la posición a la que se quiere mover esté vacía o tenga una
				// pieza del
				// color opuesto
				if (Tablero.tablero[filaMoverCaballo][columnaMoverCaballo].equals(" *  ")
						|| (turnoBlancas && Tablero.tablero[filaMoverCaballo][columnaMoverCaballo].contains("n"))
						|| (!turnoBlancas && Tablero.tablero[filaMoverCaballo][columnaMoverCaballo].contains("b"))) {
					Tablero.tablero[filaMoverCaballo][columnaMoverCaballo] = "C" + (turnoBlancas ? "b" : "n");
					Tablero.tablero[filaEelegida][columnaElegida] = " *  ";
					posiOriginal[1] = Integer.toString(filaMoverCaballo);
					posiOriginal[2] = Integer.toString(columnaMoverCaballo);
					return Tablero.tablero[filaMoverCaballo][columnaMoverCaballo];
				} else {
					System.out.println("No puedes mover a esa posición");
				}
			} else {
				System.out.println("Movimiento no válido");
			}
		}
	}

	@Override
	public double comer() {
		return 0;
	}
}