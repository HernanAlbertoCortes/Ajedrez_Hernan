package ajedrez;

public class Tablero {
	static String[][] tablero = new String[9][9];

	static void ini() {
		tablero[0][0] = "  __";
		tablero[0][1] = "A___";
		tablero[0][2] = "B___";
		tablero[0][3] = "C___";
		tablero[0][4] = "D___";
		tablero[0][5] = "E___";
		tablero[0][6] = "F___";
		tablero[0][7] = "G___";
		tablero[0][8] = "H__";

		tablero[1][0] = "1| ";
		tablero[2][0] = "2| ";
		tablero[3][0] = "3| ";
		tablero[4][0] = "4| ";
		tablero[5][0] = "5| ";
		tablero[6][0] = "6| ";
		tablero[7][0] = "7| ";
		tablero[8][0] = "8| ";

		tablero[1][1] = " bT ";
		tablero[1][2] = " bC ";
		tablero[1][3] = " bA ";
		tablero[1][4] = " bQ ";
		tablero[1][5] = " bK ";
		tablero[1][6] = " bA ";
		tablero[1][7] = " bC ";
		tablero[1][8] = " bT ";

		tablero[2][1] = " bP ";
		tablero[2][2] = " bP ";
		tablero[2][3] = " bP ";
		tablero[2][4] = " bP ";
		tablero[2][5] = " bP ";
		tablero[2][6] = " bP ";
		tablero[2][7] = " bP ";
		tablero[2][8] = " bP ";

		tablero[7][1] = " nP ";
		tablero[7][2] = " nP ";
		tablero[7][3] = " nP ";
		tablero[7][4] = " nP ";
		tablero[7][5] = " nP ";
		tablero[7][6] = " nP ";
		tablero[7][7] = " nP ";
		tablero[7][8] = " nP ";

		tablero[8][1] = " nT ";
		tablero[8][2] = " nC ";
		tablero[8][3] = " nA ";
		tablero[8][4] = " nQ ";
		tablero[8][5] = " nK ";
		tablero[8][6] = " nA ";
		tablero[8][7] = " nC ";
		tablero[8][8] = " nT ";

	}

	public static void mostrar() {
	
        for (int i = 0; i < 9; i++) {
            System.out.println("");
            for (int j = 0; j < 9; j++) {
                if (tablero[i][j] == null || tablero[i][j].equals("")) {
                    tablero[i][j] = " *  ";
                }
                System.out.print(tablero[i][j]);
            }
        }
 }
}
