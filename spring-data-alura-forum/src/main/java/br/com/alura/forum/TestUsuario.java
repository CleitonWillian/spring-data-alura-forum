package br.com.alura.forum;

import br.com.alura.forum.repository.UsuarioRepository;

public class TestUsuario {

	public TestUsuario(UsuarioRepository repository) {
		repository.findAll().forEach(System.out::println);
	}
}
