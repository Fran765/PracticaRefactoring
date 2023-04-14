package ar.unrn.eje4;

import static org.junit.jupiter.api.Assertions.*;

import org.jdbi.v3.core.Jdbi;
import org.junit.jupiter.api.Test;

class PersonaRepositoryTest {

	@Test
	void test() {

		Jdbi jdbi = Jdbi.create("jdbc:hsqldb:mem;create=true");

		new SetUpDatabase(jdbi).setUp();

		var repo = new PersonaRepository(jdbi);
		var personas = repo.buscarPorNombre("Vla");

		for (Persona persona : personas) {
			assertEquals("Vladimir Varkov", persona.nombre() + " " + persona.apellido());
			System.out.println(persona.nombre() + " " + persona.apellido());
		}

		var persona = repo.buscarId(1L);
		persona.ifPresent(p -> {
			assertEquals("José Laurenti", p.nombre() + " " + p.apellido());
			System.out.println(p.nombre() + " " + p.apellido());
		});

	}
}
