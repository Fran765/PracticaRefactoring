package ar.unrn.eje3;

import java.time.LocalDate;

public class ImplementacionProvedorDeFecha implements ProvedorDeFecha {

	@Override
	public LocalDate devolverFecha() {

		return LocalDate.now();
	}

}
