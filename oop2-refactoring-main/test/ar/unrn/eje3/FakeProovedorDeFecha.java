package ar.unrn.eje3;

import java.time.LocalDate;

public class FakeProovedorDeFecha implements ProvedorDeFecha {

	@Override
	public LocalDate devolverFecha() {
		return LocalDate.of(2023, 04, 14);
	}

}
