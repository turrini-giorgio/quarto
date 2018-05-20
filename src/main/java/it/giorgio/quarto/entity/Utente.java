package it.giorgio.quarto.entity;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
public class Utente implements Serializable {
	private static final long serialVersionUID = -8271845821706887137L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
	@Column(length = 48)
	private String nome;
	@Column(length = 48)
	private String cognome;
	@Column(length = 256, nullable = false)
	private String email;
	@Column(length = 64)
	private String password;
	@Column(nullable = false)
	private TipoUtente tipo = TipoUtente.Normale;

}
