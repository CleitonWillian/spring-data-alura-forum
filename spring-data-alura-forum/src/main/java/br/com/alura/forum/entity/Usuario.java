package br.com.alura.forum.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Usuario {

	@Id
	private String email;
	private String nome;
	private LocalDate criadoEm;

	

}
