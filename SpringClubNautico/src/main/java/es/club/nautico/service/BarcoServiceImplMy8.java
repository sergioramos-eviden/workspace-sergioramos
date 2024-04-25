package es.club.nautico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.club.nautico.entities.Barco;
import es.club.nautico.repository.BarcoRepository;

@Service
public class BarcoServiceImplMy8 implements BarcoService{

	@Autowired
	private BarcoRepository brepo;
	
	@Override
	public Barco findById(int idBarco) {
		// TODO Auto-generated method stub
		return brepo.findById(idBarco).orElse(null);
	}

	@Override
	public Barco updateOne(Barco barco) {
		// TODO Auto-generated method stub
		try {
			return brepo.save(barco);
		}catch(Exception e) {
			return null;
		}
	}

	@Override
	public Barco insertOne(Barco barco) {
		// TODO Auto-generated method stub
		try{
			return brepo.save(barco);
		}catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public int deleteOne(int idBarco) {
		// TODO Auto-generated method stub
		 Barco barco = brepo.findById(idBarco).orElse(null);
		try {
			brepo.delete(barco);
			return 1;
		}catch(Exception e) {
			return 0;
		}
	}

	@Override
	public List<Barco> findAll() {
		// TODO Auto-generated method stub
		return brepo.findAll();
	}

}
