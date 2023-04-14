package ar.unrn.eje1;

import java.util.Objects;

public class ComprobanteConsulta {

	private Double monto;
	private int puntos;

	public ComprobanteConsulta(Double monto, int puntos) {
		
		this.monto = Objects.requireNonNull(monto);
		this.puntos = Objects.requireNonNull(puntos);
	}

	public Double obtenerMonto() {
		return monto;
	}

	public int obtenerPuntos() {
		return puntos;
	}
}
