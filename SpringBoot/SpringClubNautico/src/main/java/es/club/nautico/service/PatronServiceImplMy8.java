package es.club.nautico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.club.nautico.entities.*;
import es.club.nautico.repository.*;

@Service
public class PatronServiceImplMy8  implements PatronService{
	@Autowired
	private PatronRepository prepo;
	
	@Override
	public Patron findById(int idPatron) {
		// TODO Auto-generated method stub
		return prepo.findById(idPatron).orElse(null);
	}

	@Override
	public Patron updateOne(Patron patron) {
		// TODO Auto-generated method stub
		try {
			return prepo.save(patron);
		}catch(Exception e) {
			return null;
		}
	}

	@Override
	public Patron insertOne(Patron patron) {
		// TODO Auto-generated method stub
		try{
			return prepo.save(patron);
		}catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public int deleteOne(int idPatron) {
		// TODO Auto-generated method stub
		Patron patron = prepo.findById(idPatron).orElse(null);
		try {
			prepo.delete(patron);
			return 1;
		}catch(Exception e) {
			return 0;
		}
	}

	@Override
	public List<Patron> findAll() {
		// TODO Auto-generated method stub
		return prepo.findAll();
	}
}
