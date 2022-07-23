package com.cinema.app.model;


import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.cinema.app.repository.UsuarioRepository;


@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class UsuarioTest {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	@Test
	@Rollback(false)
	public void testUsuario() {
		Usuario usuario = new Usuario(1017267474, "charlie", "Cédula", "Charlinson", "Perez", "charlinson@gmail.com", "charlie2");
		Usuario usuarioSave = usuarioRepository.save(usuario);
		assertNotNull(usuarioSave);
		
	}
	


}

