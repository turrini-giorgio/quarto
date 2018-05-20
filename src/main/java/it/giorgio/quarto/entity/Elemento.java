package it.giorgio.quarto.entity;

import java.util.List;
import java.io.Serializable;
import java.util.LinkedList;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "elemento")
public class Elemento implements Serializable {
	private static final long serialVersionUID = 1791991398669653817L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
	@Column
	private String nome;
	@Column
	private String descrizione;
	@Column
	private String foto;
	@Column(name = "livello_sm")
	private int LivelloSulMare;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "elemento")
	private List<Commento> commenti = new LinkedList<>();
}
