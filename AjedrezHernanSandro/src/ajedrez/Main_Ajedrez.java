package ajedrez;

import java.util.Scanner;

public class Main_Ajedrez {

	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);
		System.out.println("INICIO DE LA PARTIDA");
		Jugador.usuario();
		Tablero.ini();
		Tablero.mostrar();

		// Luego dividir todo en un metodo mas pequeño
		
		while (true) {
		System.out.println("");
		System.out.println("Ingresa fila");
		int fIngresada = src.nextInt();
		Juego.Fila(fIngresada);

		System.out.println("Ingresa columna");
		int cIngresada = src.nextInt();
		Juego.Columna(cIngresada);

		String[] colorF = Juego.PosiIngresada(fIngresada, cIngresada);

		String boo = Juego.colorseleccion(colorF);

		System.out.println("Ingresa fila a mover ");
		int cIngresadaMover = src.nextInt();
		Juego.ColumnAmover(cIngresadaMover);

		System.out.println("Ingresa columna a mover ");
		int fIngresadaMover = src.nextInt();
		Juego.FilaAmover(fIngresadaMover);

		Juego.PosiMover(cIngresadaMover, fIngresadaMover);
		
		String [] posiMovimiento =Juego.PosiMover(cIngresadaMover, fIngresadaMover);
		
		Peon peon = new Peon (colorF, posiMovimiento, boo);
		
		String cogerPosi = peon.mover();

		Tablero.mostrar();
		}
	}

}

//HAY UN ERROR A LA HORA DE CORRER EL PROGRAMA 
//YA QUE VA PIDIENDO DOS VECES LA FICHA QUE QUIERE 
//USAR Y NO ACABA MOSTRANDO EL TABLERO NI LO ACTUALIZA
//Y VUELVE A PEDIR OTRA VEZ QUE INTRODUZCA UN COLOR
