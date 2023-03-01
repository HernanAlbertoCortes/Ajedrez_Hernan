package ajedrez;

public class Main_Ajedrez {

	public static void main(String[] args) {
		System.out.println("INICIO DE LA PARTIDA");
		Jugador.usuario();
		Tablero.ini();
		Tablero.mostrar();
		Rey king = new Rey(null);
		String cogerPosi = king.mover();

		//Tablero.mostrar();

	}

}

//HAY UN ERROR A LA HORA DE CORRER EL PROGRAMA 
//YA QUE VA PIDIENDO DOS VECES LA FICHA QUE QUIERE 
//USAR Y NO ACABA MOSTRANDO EL TABLERO NI LO ACTUALIZA
//Y VUELVE A PEDIR OTRA VEZ QUE INTRODUZCA UN COLOR
