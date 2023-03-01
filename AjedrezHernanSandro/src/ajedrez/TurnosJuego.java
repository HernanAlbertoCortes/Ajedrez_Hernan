package ajedrez;

public class TurnosJuego {

	public static void main(String[] args) {

		boolean siguienteJugada = true;

		while (siguienteJugada) {
			String[] posInicial = Juego.PosiIngresada();
			String colorSeleccionado = Juego.colorseleccion();

			System.out.println("El color seleccionado es: " + colorSeleccionado);

			String[] posFinal = Juego.PosiMover();
			
            // Aquí puedes hacer lo que sea necesario con las posiciones inicial y final FALTA PONER 
            // por ejemplo, actualizar el estado del tablero o mostrar un mensaje de error si el movimiento no es válido FALTA PONER

		}
	}
}
