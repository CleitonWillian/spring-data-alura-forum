package br.com.alura.forum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.alura.forum.repository.UsuarioRepository;

@Configuration
public class BeanConstrutor {

	@Autowired
	UsuarioRepository repository; 

	@Bean
	public TestUsuario beanTestUsuario() {
		return new TestUsuario(repository);
	}
	
	
}
