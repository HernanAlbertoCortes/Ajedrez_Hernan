package ajedrez;

public class Main_Ajedrez {

	public static void main(String[] args) {
		System.out.println("INICIO JUEGO");
		Jugador.usuario();
		Tablero.ini();
		Tablero.mostrar();
		
		Rey king = new Rey(null);
	    String cogerPosi = king.mover();
	   // System.out.println(cogerPosi);
	    
	    Tablero.mostrar();

	}

}
