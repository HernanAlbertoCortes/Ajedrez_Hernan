package ajedrez;

public class Tablero {
	static String[][] tablero = new String[9][9];

	static void ini() {
		tablero[0][0] = "          ";
		tablero[0][1] = "a         ";
		tablero[0][2] = "b         ";
		tablero[0][3] = "c         ";
		tablero[0][4] = "d         ";
		tablero[0][5] = "e         ";
		tablero[0][6] = "f         ";
		tablero[0][7] = "g         ";
		tablero[0][8] = "h         ";

		tablero[0][0] = "          ";
		tablero[1][0] = "1       ";
		tablero[2][0] = "2       ";
		tablero[3][0] = "3       ";
		tablero[4][0] = "4       ";
		tablero[5][0] = "5       ";
		tablero[6][0] = "6       ";
		tablero[7][0] = "7       ";
		tablero[8][0] = "8       ";

		tablero[1][1] = "N_torre   ";
		tablero[1][2] = "N_caballo ";
		tablero[1][3] = "N_alfil   ";
		tablero[1][4] = "N_reina   ";
		tablero[1][5] = "N_rey     ";
		tablero[1][6] = "N_alfil   ";
		tablero[1][7] = "N_caballo ";
		tablero[1][8] = "N_torre   ";

		tablero[2][1] = "B_peon    ";
		tablero[2][2] = "B_peon    ";
		tablero[2][3] = "B_peon    ";
		tablero[2][4] = "B_peon    ";
		tablero[2][5] = "B_peon    ";
		tablero[2][6] = "B_peon    ";
		tablero[2][7] = "B_peon    ";
		tablero[2][8] = "B_peon    ";
		

		tablero[3][1] = "     -   ";
		tablero[3][2] = "     -   ";
		tablero[3][3] = "     -   ";
		tablero[3][4] = "     -   ";
		tablero[3][5] = "     -   ";
		tablero[3][6] = "     -   ";
		tablero[3][7] = "     -   ";
		tablero[3][8] = "     -   ";
		
		tablero[4][1] = "     -   ";
		tablero[4][2] = "     -   ";
		tablero[4][3] = "     -   ";
		tablero[4][4] = "     -   ";
		tablero[4][5] = "     -   ";
		tablero[4][6] = "     -   ";
		tablero[4][7] = "     -   ";
		tablero[4][8] = "     -   ";
		
		tablero[5][1] = "     -   ";
		tablero[5][2] = "     -   ";
		tablero[5][3] = "     -   ";
		tablero[5][4] = "     -   ";
		tablero[5][5] = "     -   ";
		tablero[5][6] = "     -   ";
		tablero[5][7] = "     -   ";
		tablero[5][8] = "     -   ";
		
		tablero[6][1] = "     -   ";
		tablero[6][2] = "     -   ";
		tablero[6][3] = "     -   ";
		tablero[6][4] = "     -   ";
		tablero[6][5] = "     -   ";
		tablero[6][6] = "     -   ";
		tablero[6][7] = "     -   ";
		tablero[6][8] = "     -   ";
		

		tablero[7][1] = "N_peon    ";
		tablero[7][2] = "N_peon    ";
		tablero[7][3] = "N_peon    ";
		tablero[7][4] = "N_peon    ";
		tablero[7][5] = "N_peon    ";
		tablero[7][6] = "N_peon    ";
		tablero[7][7] = "N_peon    ";
		tablero[7][8] = "N_peon    ";

		tablero[8][1] = "N_torre   ";
		tablero[8][2] = "N_caballo ";
		tablero[8][3] = "N_alfil   ";
		tablero[8][4] = "N_reina   ";
		tablero[8][5] = "N_rey     ";
		tablero[8][6] = "N_alfil   ";
		tablero[8][7] = "N_caballo ";
		tablero[8][8] = "N_torre   ";

	}

	public static void mostrar() {

		for (int i = 0; i < 9; i++) {
			System.out.println("");
			for (int j = 0; j < 9; j++) {
				System.out.print(tablero[i][j]);

			}
		}
		// for (int i=0; i<9; i++) {

		// for(int j=0; j<9; j++) {

		// tablero[i][j].replace(" ", " - ");
		// System.out.print(tablero[i][j]);

	}
}
