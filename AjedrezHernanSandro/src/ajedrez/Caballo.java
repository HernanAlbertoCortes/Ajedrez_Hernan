package ajedrez;

import java.util.Scanner;

public class Caballo  extends Juego implements Piezas {
	private String[] posiOriginal;
	private String[] posiAmover;
	
    public Caballo(String[] posiOriginal, String[] posiAmover) {
    	this.posiOriginal=posiOriginal;
    	this.posiAmover=posiAmover;
    }

    @Override
    public String mover(boolean turnoBlancas) {
        String colorFicha = posiOriginal[0];

        int fila = Integer.parseInt(posiOriginal[1]);
        int columna = Integer.parseInt(posiOriginal[2]);

        int filaAmover = Integer.parseInt(posiAmover[1]);
        int columnaAmover = Integer.parseInt(posiAmover[2]);

        int difFila = Math.abs(fila - filaAmover);
        int difColumna = Math.abs(columna - columnaAmover);

        // Verifying if move is valid for the knight
        if ((difFila == 1 && difColumna == 2) || (difFila == 2 && difColumna == 1)) {
            if (turnoBlancas == true && colorFicha.equals(" bC ")) {
                Tablero.tablero[filaAmover][columnaAmover] = " bC ";
                Tablero.tablero[fila][columna] = " *  ";
            } else if (turnoBlancas == false && colorFicha.equals(" nC ")) {
                Tablero.tablero[filaAmover][columnaAmover] = " nC ";
                Tablero.tablero[fila][columna] = " *  ";
            }
            return "true";
        } else {
        System.out.println("Movimiento no valido . introduce una posicion correcta");
            return "false";
        }
    }
	@Override
	public double comer() {
		return 0;
	}
}