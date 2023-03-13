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

			System.out.println("Ingresa columna");
			int cIngresada = src.nextInt();

			String[] colorF = Juego.PosiIngresada(fIngresada, cIngresada);

			String colorFicha = Juego.colorseleccion(colorF);
			
			if ((turnoBlancas && colorFicha.equals("BLANCO")) || (!turnoBlancas && colorFicha.equals("NEGRO"))) {
				
				boolean movimientoValido = false;
				
				while (!movimientoValido) {
				System.out.println("Ingresa fila a mover ");
				int fIngresadaMover = src.nextInt();
				
				System.out.println("Ingresa columna a mover ");
				int cIngresadaMover = src.nextInt();
				
				String [] posiMovimiento =Juego.PosiMover(fIngresadaMover, cIngresadaMover);
				
				if (colorF[0].equals(" bP ") || colorF[0].equals(" nP ")) {
					Peon peon = new Peon(colorF, posiMovimiento);				
					String comparacionP=peon.mover(turnoBlancas);
					if (comparacionP.equals("true")) {
						movimientoValido=true;
					}
				} else if (colorF[0].equals(" bT ") || colorF[0].equals(" nT ")) {
					Torre torre = new Torre(colorF, posiMovimiento, cIngresadaMover, fIngresadaMover, fIngresada, cIngresada);				
					torre.mover(turnoBlancas);
				}  else if (colorF[0].equals(" bC ") || colorF[0].equals(" nC ")) {
					Caballo caballo = new Caballo(colorF, posiMovimiento);				
					String comparacionC= caballo.mover(turnoBlancas);
					if (comparacionC.equals("true")) {
						movimientoValido=true;
					}				
				}else {
				}
				}
				Tablero.mostrar();
				
				turnoBlancas = !turnoBlancas; 
			} else {
				System.out.println("No es tu turno");
			}

		}
	}
}
