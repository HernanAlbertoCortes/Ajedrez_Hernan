package ajedrez;

import java.util.Scanner;

public class Main_Ajedrez {

	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);
		System.out.println("INICIO DE LA PARTIDA");
		boolean turnoBlancas = true; 
		Tablero.ini();
		Tablero.mostrar();
		
		while (true) {
			System.out.println("");
			System.out.println("Turno de las fichas " + (turnoBlancas ? "blancas" : "negras"));
			System.out.println("Ingresa fila");
			int fIngresada = src.nextInt();
			Juego.Fila(fIngresada);

			System.out.println("Ingresa columna");
			int cIngresada = src.nextInt();
			Juego.Columna(cIngresada);

			String[] colorF = Juego.PosiIngresada(fIngresada, cIngresada);

			String colorFicha = Juego.colorseleccion(colorF);
			
			if ((turnoBlancas && colorFicha.equals("BLANCO")) || (!turnoBlancas && colorFicha.equals("NEGRO"))) {
				System.out.println("Ingresa fila a mover ");
				int cIngresadaMover = src.nextInt();
				Juego.ColumnAmover(cIngresadaMover);

				System.out.println("Ingresa columna a mover ");
				int fIngresadaMover = src.nextInt();
				Juego.FilaAmover(fIngresadaMover);

				Juego.PosiMover(cIngresadaMover, fIngresadaMover);
				
				String [] posiMovimiento =Juego.PosiMover(cIngresadaMover, fIngresadaMover);
				
				Peon peon = new Peon (colorF, posiMovimiento);
				
				String cogerPosi = peon.mover(turnoBlancas);

				Tablero.mostrar();
				
				turnoBlancas = !turnoBlancas; 
			} else {
				System.out.println("No es tu turno");
			}

		}
	}
}
