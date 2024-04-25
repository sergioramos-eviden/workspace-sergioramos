package es.club.nautico.service;

import java.util.List;

import es.club.nautico.entities.Barco;

public interface BarcoService {
	Barco findById(int idBarco);
	Barco insertOne(Barco barco);
	int deleteOne(int idBarco);
	List<Barco> findAll();
	Barco updateOne(Barco barco);
}
