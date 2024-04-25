package es.club.nautico.service;

import java.util.List;

import es.club.nautico.entities.*;

public interface SalidaService {
	Salida findById(int idSalida);
	Salida insertOne(Salida salida);
	int deleteOne(int idSalida);
	List<Salida> findAll();
	Salida updateOne(Salida salida);
}
