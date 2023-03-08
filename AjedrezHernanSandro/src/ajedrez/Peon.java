package ajedrez;

public class Peon extends Juego implements Piezas {
	private String[] posiOriginal;
	private String[] posiAmover;
	private String boo;

	
	public Peon(String[] posiOriginal, String[] posiAmover, String boo) {
		this.posiOriginal=posiOriginal;
		this.posiAmover=posiAmover;
		this. boo= boo;
	}
	
	@Override
	public String mover() {
	   
	    if (boo.contains(boo) && Tablero.tablero[Integer.parseInt(posiOriginal[1]) +1][Integer.parseInt(posiOriginal[2])] == " *  " ){
	    	
	    	Tablero.tablero[Integer.parseInt(posiOriginal[1]) +1][Integer.parseInt(posiOriginal[2])] = " bP ";	    	
	    	// Reemplazamos la posición actual con un asterisco
	        Tablero.tablero[Integer.parseInt(posiOriginal[1])][Integer.parseInt(posiOriginal[2])] = " *  ";
	        
	    }
	    
	    if (Tablero.tablero[Integer.parseInt(posiOriginal[1]) -1][Integer.parseInt(posiOriginal[2])] == " *  "){
	    	//mover peon de casilla
	    	Tablero.tablero[Integer.parseInt(posiOriginal[1]) -1][Integer.parseInt(posiOriginal[2])] = " nP ";	    	
	    	// Reemplazamos la posición actual con un asterisco
	        Tablero.tablero[Integer.parseInt(posiOriginal[1])][Integer.parseInt(posiOriginal[2])] = " *  ";
	        
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
