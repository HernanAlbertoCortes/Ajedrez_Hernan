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
	   String posicionIngresada =Juego.PosiIngresada();
	   String posicionAMover =Juego.PosiMover();
	   int fila =Juego.Fila();
	   int columna =Juego.Columna();
	   int moverFila =Juego.FilaAmover();
	   int moverColumna =Juego.ColumnAmover();	
	   
	    if (posicionAMover.equals(" *  ")) {
	        // Reemplazamos la posición actual con un asterisco
	        Tablero.tablero[fila][columna] = " *  ";
	        // Movemos la pieza a la posición deseada
	        Tablero.tablero[moverFila][moverColumna] = posicionIngresada;
	    }
	    
	    return "";
	}

	@Override
	public double comer() {
		
		return 0;
	}

}
