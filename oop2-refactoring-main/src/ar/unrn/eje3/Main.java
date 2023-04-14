package ar.unrn.eje3;

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

		ProvedorDeFecha hoy = new ImplementacionProvedorDeFecha();

		ReporteDeGastos miReporte = new ReporteDeGastos(misGastos, hoy.devolverFecha());

		System.out.println(miReporte.imprimir());

	}

}
