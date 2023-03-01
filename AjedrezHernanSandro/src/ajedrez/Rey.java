package ajedrez;
import java.util.Scanner;

public class Rey extends Juego implements Piezas{
	
	public Rey(String fichas) {
		super(fichas);		
	}

	Tablero matriz = new Tablero();
	String[][] miMatriz = Tablero.tablero;	
	Scanner src= new Scanner(System.in);
	
	@Override
	public String mover() {
	   String[] posicionIngresada =Juego.PosiIngresada();
	   
	   String [] posicionAMover =Juego.PosiMover();
	   
	    if (posicionAMover[0].equals(" *  ")) {
	        // Reemplazamos la posición actual con un asterisco
	        Tablero.tablero[Integer.parseInt(posicionIngresada[1])][Integer.parseInt(posicionIngresada[2])] = " *  ";
	        // Movemos la pieza a la posición deseada
	        Tablero.tablero[Integer.parseInt(posicionAMover[1])][Integer.parseInt(posicionAMover[2])] = posicionIngresada[0];
	    }
	    return "";
	}

	@Override
	public double comer() {
		   String[] posicionIngresada =Juego.PosiIngresada();
		   String [] posicionAMover =Juego.PosiMover();
		   
		    if (posicionAMover[0].contains("n")) {
		        // Reemplazamos la posición actual con un asterisco
		        Tablero.tablero[Integer.parseInt(posicionIngresada[1])][Integer.parseInt(posicionIngresada[2])] = " *  ";
		        // Movemos la pieza a la posición deseada
		        Tablero.tablero[Integer.parseInt(posicionAMover[1])][Integer.parseInt(posicionAMover[2])] = posicionIngresada[0];
		    }
		return 0;
	}
}