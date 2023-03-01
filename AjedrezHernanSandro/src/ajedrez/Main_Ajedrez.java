package ajedrez;

public class Main_Ajedrez {

	public static void main(String[] args) {
		System.out.println("INICIO DE LA PARTIDA");
		Jugador.usuario();
		Tablero.ini();
		Tablero.mostrar();
		Rey king = new Rey(null);
		String cogerPosi = king.mover();

		//Tablero.mostrar();

	}

}
