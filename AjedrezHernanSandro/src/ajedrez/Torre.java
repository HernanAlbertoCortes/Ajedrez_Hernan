package ajedrez;

public class Torre extends Juego implements Piezas {
	private String[] posiOriginal;
	private String[] posiAmover;

	
	public Torre(String[] posiOriginal, String[] posiAmover) {
		this.posiOriginal=posiOriginal;
		this.posiAmover=posiAmover;
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
	            Tablero.tablero[Integer.parseInt(posiOriginal[1]) +1][Integer.parseInt(posiOriginal[2])] = " bT ";
	            Tablero.tablero[Integer.parseInt(posiOriginal[1])][Integer.parseInt(posiOriginal[2])] = " *  ";
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
	            Tablero.tablero[Integer.parseInt(posiOriginal[1]) -1][Integer.parseInt(posiOriginal[2])] = " nT ";
	            Tablero.tablero[Integer.parseInt(posiOriginal[1])][Integer.parseInt(posiOriginal[2])] = " *  ";
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
