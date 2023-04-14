package ar.unrn.eje1;

public abstract class Libro {
	
	private static final int PUNTOS = 1;
	
	private String nombre;
	
	public Libro(String nombre) {
		this.nombre = nombre;
	}

	public String nombre() {
		return nombre;
	}
	
	public abstract double calcularDeuda(int diasAlquilados);
	
	public int sumarPuntos(int diasAlquilados) {
		return PUNTOS;
	}

}
