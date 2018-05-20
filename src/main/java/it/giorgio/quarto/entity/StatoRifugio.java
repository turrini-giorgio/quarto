package it.giorgio.quarto.entity;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
public class StatoRifugio implements Serializable {
	private static final long serialVersionUID = -1845978631214328166L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
	@ManyToOne(optional = true)
	@JoinColumn(name = "elemento_id", unique = true)
	private Elemento rifugio;
}
