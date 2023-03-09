package ajedrez;

public class Peon extends Juego implements Piezas {
	private String[] posiOriginal;
	private String[] posiAmover;

	
	public Peon(String[] posiOriginal, String[] posiAmover) {
		this.posiOriginal=posiOriginal;
		this.posiAmover=posiAmover;
	}
	
	@Override
	public String mover (boolean turnoBlancas) {
	    String colorFicha = posiOriginal[0];

	    if (turnoBlancas==true && colorFicha.equals(" bP ")) {
	        if (Tablero.tablero[Integer.parseInt(posiOriginal[1]) +1][Integer.parseInt(posiOriginal[2])] == " *  " ){
	            Tablero.tablero[Integer.parseInt(posiOriginal[1]) +1][Integer.parseInt(posiOriginal[2])] = " bP ";
	            Tablero.tablero[Integer.parseInt(posiOriginal[1])][Integer.parseInt(posiOriginal[2])] = " *  ";
	        }
	    }
	    else if (turnoBlancas==false && colorFicha.equals(" nP ")) {
	        if (Tablero.tablero[Integer.parseInt(posiOriginal[1]) -1][Integer.parseInt(posiOriginal[2])] == " *  "){
	            Tablero.tablero[Integer.parseInt(posiOriginal[1]) -1][Integer.parseInt(posiOriginal[2])] = " nP ";
	            Tablero.tablero[Integer.parseInt(posiOriginal[1])][Integer.parseInt(posiOriginal[2])] = " *  ";
	        }
	    }

	    return "";
	}

	@Override
	public double comer() {
/*		   String[] posicionIngresada =Juego.PosiIngresada();
		   String [] posicionAMover =Juego.PosiMover();
		   
		    if (posicionAMover[0].contains("n")) {
		        // Reemplazamos la posición actual con un asterisco
		        Tablero.tablero[Integer.parseInt(posicionIngresada[1])][Integer.parseInt(posicionIngresada[2])] = " *  ";
		        // Movemos la pieza a la posición deseada
		        Tablero.tablero[Integer.parseInt(posicionAMover[1])][Integer.parseInt(posicionAMover[2])] = posicionIngresada[0];
		    }*/
		return 0;
	}

}
