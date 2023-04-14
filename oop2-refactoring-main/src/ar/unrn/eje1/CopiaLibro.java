package ar.unrn.eje1;

public class CopiaLibro {
	
	private Libro libro;

	public CopiaLibro(Libro libro) {
		this.libro = libro;
	}

	public Libro libro() {
		return libro;
	}
	
	public double devolverDeuda(int diasAlquialdos) {
		return libro.calcularDeuda(diasAlquialdos);
	}
	
	public int devolverPuntos(int diasAlquilados) {
		return libro.sumarPuntos(diasAlquilados);
	}
}