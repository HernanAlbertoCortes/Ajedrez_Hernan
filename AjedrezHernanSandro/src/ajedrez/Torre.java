package ajedrez;

public class Torre extends Juego implements Piezas {
	private String[] posiOriginal;
	private String[] posiAmover;
	private int filaDestino;
	private int columnaDestino;
	private int filaOriginal;
	private int columnaOriginal;

	
	public Torre(String[] posiOriginal, String[] posiAmover, int filaDestino, int columnaDestino, int filaOriginal, int columnaOriginal) {
		this.posiOriginal=posiOriginal;
		this.posiAmover=posiAmover;
		this.filaDestino=filaDestino;
		this.columnaDestino=columnaDestino;
		this.filaOriginal=filaOriginal;
		this.columnaOriginal=columnaOriginal;
	}
	
	@Override
	public String mover (boolean turnoBlancas) {
	    String colorFicha = posiOriginal[0];

	    if (turnoBlancas==true && colorFicha.equals(" bT ")) {
	        if (Tablero.tablero[Integer.parseInt(posiOriginal[1]) +1][Integer.parseInt(posiOriginal[2])] == " *  " 
	        	|| Tablero.tablero[Integer.parseInt(posiOriginal[1]) +2][Integer.parseInt(posiOriginal[2])] == " *  "
	        	|| Tablero.tablero[Integer.parseInt(posiOriginal[1]) +3][Integer.parseInt(posiOriginal[2])] == " *  "
	        	|| Tablero.tablero[Integer.parseInt(posiOriginal[1]) +4][Integer.parseInt(posiOriginal[2])] == " *  "
	        	|| Tablero.tablero[Integer.parseInt(posiOriginal[1]) +5][Integer.parseInt(posiOriginal[2])] == " *  "
	        	|| Tablero.tablero[Integer.parseInt(posiOriginal[1]) +6][Integer.parseInt(posiOriginal[2])] == " *  "
	        	|| Tablero.tablero[Integer.parseInt(posiOriginal[1]) +7][Integer.parseInt(posiOriginal[2])] == " *  "
	        	|| Tablero.tablero[Integer.parseInt(posiOriginal[1]) +8][Integer.parseInt(posiOriginal[2])] == " *  "
	        	){
	            Tablero.tablero[filaDestino][columnaDestino] = " bT ";
	            Tablero.tablero[filaOriginal][columnaOriginal] = " *  ";
	        }
	    }
	    else if (turnoBlancas==false && colorFicha.equals(" nT ")) {
	        if (Tablero.tablero[Integer.parseInt(posiOriginal[1]) -1][Integer.parseInt(posiOriginal[2])] == " *  "
		        || Tablero.tablero[Integer.parseInt(posiOriginal[1]) -2][Integer.parseInt(posiOriginal[2])] == " *  "
		        || Tablero.tablero[Integer.parseInt(posiOriginal[1]) -3][Integer.parseInt(posiOriginal[2])] == " *  "
		        || Tablero.tablero[Integer.parseInt(posiOriginal[1]) -4][Integer.parseInt(posiOriginal[2])] == " *  "
		        || Tablero.tablero[Integer.parseInt(posiOriginal[1]) -5][Integer.parseInt(posiOriginal[2])] == " *  "
		        || Tablero.tablero[Integer.parseInt(posiOriginal[1]) -6][Integer.parseInt(posiOriginal[2])] == " *  "
		        || Tablero.tablero[Integer.parseInt(posiOriginal[1]) -7][Integer.parseInt(posiOriginal[2])] == " *  "
		        || Tablero.tablero[Integer.parseInt(posiOriginal[1]) -8][Integer.parseInt(posiOriginal[2])] == " *  "
		        ){
	            Tablero.tablero[filaDestino][columnaDestino] = " nT ";
	            Tablero.tablero[filaOriginal][columnaOriginal] = " *  ";
	        }
	    }

	    return "";
	}

	@Override
	public double comer() {
//no tuvimos tiempo jeje perdon
		return 0;
	}

}
