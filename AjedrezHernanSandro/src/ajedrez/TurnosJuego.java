package ajedrez;

public class TurnosJuego {

	public TurnosJuego() {
	}
	
	public static boolean comprobacion(String colorElegido, String colorFicha) {
	
		if(colorElegido.equals(colorFicha)) {
		System.out.println("Ingresa fila a mover ");
		int cIngresadaMover = src.nextInt();
		Juego.ColumnAmover(cIngresadaMover);

		System.out.println("Ingresa columna a mover ");
		int fIngresadaMover = src.nextInt();
		Juego.FilaAmover(fIngresadaMover);

		Juego.PosiMover(cIngresadaMover, fIngresadaMover);
		
		String [] posiMovimiento =Juego.PosiMover(cIngresadaMover, fIngresadaMover);
		
	}
	}
}
