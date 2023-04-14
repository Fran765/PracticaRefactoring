package ar.unrn.eje3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Gasto> misGastos = new ArrayList<Gasto>();

		Gasto auto = new AlquilerAuto(8000);
		Gasto cena = new Cena(4000);
		Gasto desayuno = new Desayuno(3000);

		misGastos.add(auto);
		misGastos.add(cena);
		misGastos.add(desayuno);

		ReporteDeGastos miReporte = new ReporteDeGastos(misGastos, LocalDate.now());

		System.out.println(miReporte.imprimir());

	}

}
