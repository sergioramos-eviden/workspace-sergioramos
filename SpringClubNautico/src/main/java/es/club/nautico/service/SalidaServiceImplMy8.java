package es.club.nautico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.club.nautico.entities.*;
import es.club.nautico.repository.*;

@Service
public class SalidaServiceImplMy8  implements SalidaService{
	@Autowired
	private SalidaRepository srepo;
	
	@Override
	public Salida findById(int idSalida) {
		// TODO Auto-generated method stub
		return srepo.findById(idSalida).orElse(null);
	}

	@Override
	public Salida updateOne(Salida salida) {
		// TODO Auto-generated method stub
		try {
			return srepo.save(salida);
		}catch(Exception e) {
			return null;
		}
	}

	@Override
	public Salida insertOne(Salida salida) {
		// TODO Auto-generated method stub
		try{
			return srepo.save(salida);
		}catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public int deleteOne(int idSalida) {
		// TODO Auto-generated method stub
		Salida salida = srepo.findById(idSalida).orElse(null);
		try {
			srepo.delete(salida);
			return 1;
		}catch(Exception e) {
			return 0;
		}
	}

	@Override
	public List<Salida> findAll() {
		// TODO Auto-generated method stub
		return srepo.findAll();
	}
}
