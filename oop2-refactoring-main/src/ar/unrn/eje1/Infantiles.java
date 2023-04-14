package ar.unrn.eje1;

public class Infantiles extends Libro {

	public Infantiles(String nombre) {
		super(nombre);
	}

	@Override
	public double calcularDeuda(int diasAlquilados) {
		double monto = 1.5;

		if (diasAlquilados > 3)
			monto += (diasAlquilados - 3) * 1.5;

		return monto;
	}

}
