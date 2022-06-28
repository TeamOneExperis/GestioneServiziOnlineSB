package com.acme.online.contenuti;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.acme.online.abbonati.Abbonato;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "contenuti")
public class Contenuto {
	
	private long id;
	private String nomeContenuto; // tutti i contenuti offerti
	private double prezzo;
	@ManyToMany
	private List<Abbonato> listaAbbonati;

}
