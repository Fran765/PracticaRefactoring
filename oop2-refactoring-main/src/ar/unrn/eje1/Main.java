package ar.unrn.eje1;

public class Main {
	public static void main(String args[]) {
		Libro elTunel = new Regulares("El Túnel");
		Libro antesDelFin = new Regulares("Antes del Fin");

		CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
		CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);

		Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
		Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 3);

		Cliente yo = new Cliente("Javier");

		yo.alquilar(alquilerElTunel);
		yo.alquilar(alquilerAntesDelFin);

		ComprobanteConsulta resultado = yo.consultarTotalDeDeudaYPuntosObtenidos();

		System.out.println(resultado.obtenerPuntos());
		System.out.println(resultado.obtenerMonto());
	}
}