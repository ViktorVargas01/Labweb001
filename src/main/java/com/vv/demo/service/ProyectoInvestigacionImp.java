package com.vv.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vv.demo.domain.ProyectoInvestigacion;
import com.vv.demo.repositories.ProyectoRepository;

import jakarta.transaction.Transactional;

@Service
public class ProyectoInvestigacionImp implements ProyectoInvestigacionService {

	@Autowired
	private ProyectoRepository invRep;
	
	@Override
	@Transactional
	public List<ProyectoInvestigacion> listartodos() {
		return invRep.findAll();
	}

	@Override
	@Transactional
	public ProyectoInvestigacion buscarPorId(Long id) {
		Optional<ProyectoInvestigacion> proyecto=invRep.findById(id);
		return proyecto.get();
	}

	@Override
	@Transactional
	public ProyectoInvestigacion grabar(ProyectoInvestigacion proyectoInvestigacion) {
		return invRep.save(proyectoInvestigacion);
	}

	@Override
	@Transactional
	public ProyectoInvestigacion actualizar(ProyectoInvestigacion proyectoInvestigacion, long id) {
		proyectoInvestigacion.setIdProyInv(id);
		return invRep.save(proyectoInvestigacion);
	}

	@Override
	@Transactional
	public void eliminar(Long id) {
		invRep.deleteById(id);

	}

	@Override
	@Transactional
	public ProyectoInvestigacion findByTitulo(String titulo) {
		Optional<ProyectoInvestigacion> inv=invRep.findByTitulo(titulo);
		return inv.get();
	}

	@Override
	@Transactional
	public ProyectoInvestigacion findByEstadoPry(String estadoPry) {
		Optional<ProyectoInvestigacion> inv=invRep.findByEstadoPry(estadoPry);
		return inv.get();
	}

}
