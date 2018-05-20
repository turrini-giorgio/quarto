package it.giorgio.quarto.entity;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "foto")
public class Foto implements Serializable {
	private static final long serialVersionUID = 6974718924837417215L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
	@Column
	private String filename;
	@ManyToOne
	@JoinColumn(name = "elemento_id")
	private Elemento elemento;
	@ManyToOne
	@JoinColumn(name = "utente_id")
	private Utente utente;
}
