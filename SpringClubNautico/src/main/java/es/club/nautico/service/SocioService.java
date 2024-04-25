package es.club.nautico.service;

import java.util.List;

import es.club.nautico.entities.Socio;


public interface SocioService {

	Socio findById(int idSocio);
	Socio updateOne(Socio socio);
	Socio insertOne(Socio socio);
	int deleteOne(int idSocio);
	List<Socio> findAll();

}
