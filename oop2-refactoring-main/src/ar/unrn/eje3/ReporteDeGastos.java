package ar.unrn.eje3;

import java.time.LocalDate;
import java.util.List;

public class ReporteDeGastos {

	private List<Gasto> gastos;
	private LocalDate fecha;

	public ReporteDeGastos(List<Gasto> misGastos, LocalDate unaFecha) {
		this.gastos = misGastos;
		this.fecha = unaFecha;
	}

	public String imprimir() {

		int total = 0;
		int gastosDeComida = 0;

		String reporte = "Expenses " + this.fecha + ":\n";

		for (Gasto gasto : gastos) {
			gastosDeComida += gasto.devolverMontoDeComida();

			String marcaExcesoComidas = gasto.exceso();

			reporte += (gasto.devolverNombre() + "\t" + gasto.devolverMonto() + "\t" + marcaExcesoComidas + "\n");

			total += gasto.devolverMonto();
		}

		reporte += ("Gastos de comida: " + gastosDeComida + "\n" + "Total de gastos: " + total);

		return reporte;
	}
}
