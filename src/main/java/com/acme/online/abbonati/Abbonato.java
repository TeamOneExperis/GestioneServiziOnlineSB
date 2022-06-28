package com.acme.online.abbonati;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.acme.online.contenuti.Contenuto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "abbonati")
public class Abbonato {
	
	private long id;
	private String nome;
	private String cognome;
	private String codiceFiscale;
	@ManyToMany
	private List<Contenuto> listaContenuti;

}
