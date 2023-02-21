package ajedrez;

public class Main_Ajedrez {

	public static void main(String[] args) {
		Tablero.ini();
		Tablero.mostrar();
		
		Rey king = new Rey();
	    String cogerPosi = king.mover();
	    System.out.println(cogerPosi);
	    Tablero.mostrar();
	}

}
