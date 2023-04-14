package ar.unrn.eje3;

import java.time.temporal.Temporal;
import java.util.List;

public class ReporteDeGastos {

	private List<Gasto> gastos;
	private Temporal fecha;

	public ReporteDeGastos(List<Gasto> misGastos, Temporal unaFecha) {
		this.gastos = misGastos;
		this.fecha = unaFecha;
	}

	public String imprimir() {

		int total = 0;
		int gastosDeComida = 0;

		String reporte = "Expenses " + this.fecha + ":\n";

		for (Gasto gasto : gastos) {
			if (gasto instanceof Cena || gasto instanceof Desayuno)
				gastosDeComida += gasto.devolverMonto();

			String marcaExcesoComidas = gasto instanceof Cena && gasto.devolverMonto() > 5000
					|| gasto instanceof Desayuno && gasto.devolverMonto() > 1000 ? "X" : " ";

			reporte += (gasto.devolverNombre() + "\t" + gasto.devolverMonto() + "\t" + marcaExcesoComidas + "\n");

			total += gasto.devolverMonto();
		}

		reporte += ("Gastos de comida: " + gastosDeComida + "\n" + "Total de gastos: " + total);

		return reporte;
	}
}
