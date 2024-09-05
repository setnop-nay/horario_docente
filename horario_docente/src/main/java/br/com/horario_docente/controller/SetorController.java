package br.com.horario_docente.controller;

import java.io.Serializable;

import org.springframework.stereotype.Controller;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Controller
public class SetorController {

	@Entity
	@Table(name = "Setor" , schema = "horario_docente")
	public class SetorEntity implements Serializable {

	     private static final long serialVersionUID = 1L;
	     
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id_Setor")
		private Long idSetor;
		
		@Column(name = "Setor")
		private String Setor;




}
