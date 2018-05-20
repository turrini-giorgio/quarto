package it.giorgio.quarto.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "commento")
public class Commento implements Serializable {
	private static final long serialVersionUID = -2112646333836327280L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "elemento_id")
	private Elemento elemento;
	@Column(length = 2048)
	private String testo;
	@Column(name = "data_cre")
	private Date dataCreazione;
	@Column(name = "data_upd")
	private Date dataAggiornamento;
	@ManyToOne
	@JoinColumn(name = "utente_id")
	private Utente utente;
}
