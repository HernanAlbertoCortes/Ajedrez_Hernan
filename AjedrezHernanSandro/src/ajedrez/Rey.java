package ajedrez;
import java.util.Scanner;

public class Rey implements Piezas{
	
	Tablero matriz = new Tablero();
	String[][] miMatriz = Tablero.tablero;
	
	Scanner src= new Scanner(System.in);

	
	@Override
	public String mover() {
	    System.out.println("");
	    System.out.println("");
	    System.out.println("Ingrese la fila de la pieza: ");
	    int fila = src.nextInt();
	    System.out.println("Ingrese la columna de la pieza: ");
	    int columna = src.nextInt();
	    String posicionIngresada = Tablero.tablero[fila][columna];
	    System.out.println(posicionIngresada);
	    
	    System.out.println("");
	    System.out.println("A qué fila quieres mover: ");
	    int moverFila = src.nextInt();
	    System.out.println("A qué columna quieres mover: ");
	    int moverColumna = src.nextInt();
	    String posicionAMover = Tablero.tablero[moverFila][moverColumna];
	    
	    if (posicionAMover.equals(" *  ")) {
	        // Reemplazamos la posición actual con un asterisco
	        Tablero.tablero[fila][columna] = "*";
	        // Movemos la pieza a la posición deseada
	        Tablero.tablero[moverFila][moverColumna] = posicionIngresada;
	    }
	    
	    return posicionAMover;
	}

	@Override
	public double comer() {
		// TODO Auto-generated method stub
		return 0;
	}

}
