package ar.unrn.eje1;

public class NuevosLanzamientos extends Libro {

	public NuevosLanzamientos(String nombre) {
		super(nombre);
	}

	@Override
	public double calcularDeuda(int diasAlquilados) {
		return diasAlquilados * 3;
	}

	@Override
	public int sumarPuntos(int diasAlquilados) {
		if (diasAlquilados > 1)
			return 2;
		return 1;
	}

}
