package ar.unrn.eje3;

public abstract class Gasto {

	private int monto;
	private String nombre;

	public Gasto(int monto, String nombre) {
		this.monto = monto;
		this.nombre = nombre;
	}
	
	public int devolverMonto() {
		return monto;
	}
	
	public String devolverNombre() {
		return nombre;
	}
	
	public abstract int devolverMontoDeComida();
	
	public abstract String exceso();
}
