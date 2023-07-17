package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IPropietarioRepo;
import com.example.demo.repo.modelo.Propietario;

@Service
public class PropietarioServiceImpl implements IPropietarioService{
	
	@Autowired
	private IPropietarioRepo propietarioRepo;

	@Override
	public void agregar(Propietario p) {
		this.propietarioRepo.insertar(p);
	}

	@Override
	public Propietario buscar(String cedula) {
		return this.propietarioRepo.seleccionar(cedula);
	}

}
