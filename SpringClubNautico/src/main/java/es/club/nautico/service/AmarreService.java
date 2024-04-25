package es.club.nautico.service;

import java.util.List;

import es.club.nautico.entities.*;

public interface AmarreService {
	Amarre findById(int idAmarre);
	Amarre insertOne(Amarre amarre);
	int deleteOne(int idAmarre);
	List<Amarre> findAll();
	Amarre updateOne(Amarre amarre);
}
