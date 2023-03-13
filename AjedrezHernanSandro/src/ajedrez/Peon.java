package ajedrez;

import java.util.Scanner;

public class Peon implements Piezas {
    private String[] posiOriginal;
    private String[] posiAmover;
    private boolean primerMovimiento;

    public Peon(String[] posiOriginal, String[] posiAmover) {
        this.posiOriginal = posiOriginal;
        this.posiAmover = posiAmover;
        this.primerMovimiento = false;
    }

    @Override
    public String mover(boolean turnoBlancas) {
        String colorFicha = posiOriginal[0];

        int fila = Integer.parseInt(posiOriginal[1]);
        int columna = Integer.parseInt(posiOriginal[2]);

        int filaAmover = Integer.parseInt(posiAmover[1]);
        int columnaAmover = Integer.parseInt(posiAmover[2]);

        int difFila = filaAmover - fila;
        int difColumna = columnaAmover - columna;

        // Verificar si el movimiento es válido para el peón
        if (turnoBlancas && colorFicha.equals(" bP ")) {
        	if (fila == 2 && difFila == 2 && difColumna == 0
        	        && Tablero.tablero[filaAmover - 1][columna].equals(" *  ")
        	        && columnaAmover == columna) {
        	    this.primerMovimiento = true;
        	    Tablero.tablero[filaAmover][columnaAmover] = " bP ";
        	    Tablero.tablero[fila][columna] = " *  ";
        	    return "true";
        	
        	
            } else if (difFila == -1 && Math.abs(difColumna) == 3
                    && Tablero.tablero[filaAmover][columnaAmover].contains(" n")) {
            	this.primerMovimiento = true;
                Tablero.tablero[filaAmover][columnaAmover] = " bP ";
                Tablero.tablero[fila][columna] = " *  ";
                return "true";
            } else if (difFila == 1 && difColumna == 0
                    && Tablero.tablero[filaAmover][columnaAmover].equals(" *  ")) {
            	this.primerMovimiento = true;
                Tablero.tablero[filaAmover][columnaAmover] = " bP ";
                Tablero.tablero[fila][columna] = " *  ";
                return "true";
            }
       
        } else if (!turnoBlancas && colorFicha.equals(" nP ")) {
        	if (fila == 7 && difFila == -2 && difColumna == 0
        	        && Tablero.tablero[filaAmover + 1][columna].equals(" *  ")
        	        && columnaAmover == columna) {
        	    this.primerMovimiento = true;
        	    Tablero.tablero[filaAmover][columnaAmover] = " nP ";
        	    Tablero.tablero[fila][columna] = " *  ";
        	    return "true";
        	
            } else if (difFila == 1 && Math.abs(difColumna) == 2
                    && Tablero.tablero[filaAmover][columnaAmover].contains(" b")) {
            	this.primerMovimiento = true;
                Tablero.tablero[filaAmover][columnaAmover] = " nP ";
                Tablero.tablero[fila][columna] = " *  ";
                return "true";
            } else if (difFila == -1 && difColumna == 0
                    && Tablero.tablero[filaAmover][columnaAmover].equals(" *  ")) {
            	this.primerMovimiento = true;
                Tablero.tablero[filaAmover][columnaAmover] = " nP ";
                Tablero.tablero[fila][columna] = " *  ";
                return "true";
            }
        }
        return "false";
    }
	@Override
	public double comer() {
		return 0;
	}
}
