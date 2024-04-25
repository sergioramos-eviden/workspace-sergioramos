package es.club.nautico.service;

import java.util.List;

import es.club.nautico.entities.*;

public interface PatronService {
	Patron findById(int idPatron);
	Patron insertOne(Patron patron);
	int deleteOne(int idPatron);
	List<Patron> findAll();
	Patron updateOne(Patron patron);
}

