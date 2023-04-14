package ar.unrn.eje1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AlquilerTest {

	@Test
	void testAlquiler() {
		
		Libro elTunel = new Regulares("El Túnel");
		Libro antesDelFin = new NuevosLanzamientos("Antes del Fin");

		CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
		CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);

		Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
		Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 3);

		Cliente yo = new Cliente("Javier");

		yo.alquilar(alquilerElTunel);
		yo.alquilar(alquilerAntesDelFin);

		ComprobanteConsulta resultado = yo.consultarTotalDeDeudaYPuntosObtenidos();
		
		assertEquals(15.5, resultado.obtenerMonto());
		assertEquals(3, resultado.obtenerPuntos());
	}

}
