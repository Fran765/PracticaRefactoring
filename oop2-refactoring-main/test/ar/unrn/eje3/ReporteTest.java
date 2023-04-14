package ar.unrn.eje3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class ReporteTest {

	@Test
	void testResporte() {
		List<Gasto> misGastos = new ArrayList<Gasto>();

		Gasto auto = new AlquilerAuto(8000);
		Gasto cena = new Cena(4000);
		Gasto desayuno = new Desayuno(3000);

		misGastos.add(auto);
		misGastos.add(cena);
		misGastos.add(desayuno);
		
		FakeProovedorDeFecha prueba = new FakeProovedorDeFecha(); 

		ReporteDeGastos miReporte = new ReporteDeGastos(misGastos, prueba.devolverFecha());

		String resultado1 = "Expenses " + prueba.devolverFecha() + ":\n" + 
				"Alquiler Auto" + "\t" + 8000 + "\t" + " " + "\n" + 
				"Cena" + "\t" + 4000 + "\t" + " " + "\n" + 
				"Desayuno" + "\t" + 3000 + "\t" + "X" + "\n" + 
				"Gastos de comida: " + 7000 + "\n" + "Total de gastos: " + 15000;

		assertEquals(resultado1, miReporte.imprimir());
	}

}
