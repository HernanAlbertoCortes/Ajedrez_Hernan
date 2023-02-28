package ajedrez;

public class Torre {

	public static boolean moverTorre(int fila, int columna, int filaA, int columnaA, String[][] tablero, int moverColumna, int moverFila) {

		// Verificar si la posición actual es una torre
		if (!tablero[fila][columna].equals(" bT ") && !tablero[fila][columna].equals(" nT ")) {
			return false;
		}

		// Verificar si el movimiento es válido
		if (fila != filaA && columna != columnaA) {
			return false;
		}

		// Verificar si no hay piezas en el camino
		if (fila == filaA) {
			int columnaInicio = Math.min(columna, columnaA);
			int columnaFin = Math.max(columna, columnaA);
			for (int columnaT = columna + 1; columna < moverColumna; columna++) {
				if (!tablero[fila][columna].equals("   ")) {
					return false;
				}
			}
		} else {
			int filaInicio = Math.min(fila, filaA);
			int filaFin = Math.max(fila, filaA);
			for (int filaT = fila + 1; fila < moverFila; fila++) {
				if (!tablero[fila][columna].equals("   ")) {
					return false;
				}
			}
		}

		// Actualizar la posición de la torre en el tablero
		tablero[filaA][columnaA] = tablero[fila][columna];
		tablero[filaA][columnaA] = "   ";

		return true;
	}
}
