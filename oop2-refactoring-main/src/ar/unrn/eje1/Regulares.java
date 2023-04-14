package ar.unrn.eje1;

public class Regulares extends Libro {

	public Regulares(String nombre) {
		super(nombre);
	}

	@Override
	public double calcularDeuda(int diasAlquilados) {
		double monto = 2;

		if (diasAlquilados > 2)
			monto += (diasAlquilados - 2) * 1.5;

		return monto;
	}

}
