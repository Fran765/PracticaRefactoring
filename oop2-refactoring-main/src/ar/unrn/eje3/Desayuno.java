package ar.unrn.eje3;

public class Desayuno extends Gasto {

	private static final String nombre = "Desayuno";
	private static final int exceso = 1000;

	public Desayuno(int monto) {
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
