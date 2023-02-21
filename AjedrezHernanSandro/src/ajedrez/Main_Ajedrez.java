package ajedrez;

public class Main_Ajedrez {

	public static void main(String[] args) {
		Jugador.usuario();
		Tablero.ini();
		Tablero.mostrar();
	//	Juego.Fila();
		//Juego.Columna();
	//	Juego.FilaAmover();
	//	Juego.ColumnAmover();
		
		Rey king = new Rey(null);
	    String cogerPosi = king.mover();
	    System.out.println(cogerPosi);
	    
	    Tablero.mostrar();

	}

}
