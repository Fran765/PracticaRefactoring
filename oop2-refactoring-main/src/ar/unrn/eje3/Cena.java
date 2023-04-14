package ar.unrn.eje3;

public class Cena extends Gasto {

	private static final String nombre = "Cena";
	private static final int exceso = 5000;

	public Cena(int monto) {
		super(monto, nombre);
	}

	@Override
	public int devolverMontoDeComida() {
		return this.devolverMonto();
	}

	@Override
	public String exceso() {
		if (exceso < this.devolverMonto())
			return "X";
		return " ";
	}

}
