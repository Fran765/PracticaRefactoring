package ar.unrn.eje1;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private List<Alquiler> alquileres = new ArrayList<Alquiler>();
	private String name;

	public Cliente(String nombre) {
		this.name = nombre;
	}

	public ComprobanteConsulta consultarTotalDeDeudaYPuntosObtenidos() {

		double totalDeuda = 0;
		int puntosAlquilerFrecuente = 0;

		for (Alquiler alquiler : alquileres) {
			totalDeuda += alquiler.deudaDelAlquiler();
			puntosAlquilerFrecuente += alquiler.puntosObtenidosConElAquiler();

		}

		return new ComprobanteConsulta(totalDeuda, puntosAlquilerFrecuente);
	}

	public void alquilar(Alquiler rental) {
		alquileres.add(rental);
	}
}