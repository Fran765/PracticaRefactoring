package ar.unrn.eje1;

public class Alquiler {
	private CopiaLibro copia;
	private int diasAlquilados;

	public Alquiler(CopiaLibro copia, int diasAlquilados) {
		this.copia = copia;
		this.diasAlquilados = diasAlquilados;
	}
	
	public int puntosObtenidosConElAquiler() {
		return copia.devolverPuntos(diasAlquilados);
	}
	
	public double deudaDelAlquiler() {
		return copia.devolverDeuda(diasAlquilados);
	}
}
