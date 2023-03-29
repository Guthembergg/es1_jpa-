package model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "eventi")
@NamedQuery(name = "eventi.findAll", query = "SELECT u FROM Evento u")
public class Evento implements Serializable{
	private LocalDate data;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)

	private String titolo;
	@Column(nullable = false)

	private String descrizione;
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private TipoEvento tipo;
	@Column(nullable = false)

	private Integer numeromax;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public TipoEvento getTipo() {
		return tipo;
	}

	public void setTipo(TipoEvento tipo) {
		this.tipo = tipo;
	}

	public Integer getNumeromax() {
		return numeromax;
	}

	public void setNumeromax(Integer numeromax) {
		this.numeromax = numeromax;
	}

	@Override
	public String toString() {
		return "Evento [id=" + id + ", titolo=" + titolo + ", data=" + data + ", descrizione=" + descrizione + ", tipo="
				+ tipo + ", numeromax=" + numeromax + "]";
	}

	public Evento(String titolo,LocalDate data,  String descrizione, TipoEvento tipo, Integer numeromax) {
		super();
		this.data = data;
		this.titolo = titolo;
		this.descrizione = descrizione;
		this.tipo = tipo;
		this.numeromax = numeromax;
	}

	public Evento() {
		// TODO Auto-generated constructor stub
	}



}
