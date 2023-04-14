package ar.unrn.eje3;

public class AlquilerAuto extends Gasto {
	
	private static final String nombre = "Alquiler Auto";

	public AlquilerAuto(int monto) {
		super(monto, nombre);
	}

	@Override
	public int devolverMontoDeComida() {
		return 0;
	}

	@Override
	public String exceso() {
		return " ";
	}

}
