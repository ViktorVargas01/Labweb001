package com.vv.demo.service;

import java.util.List;

import com.vv.demo.domain.Investigador;
import com.vv.demo.exception.EntityNotFoundException;
import com.vv.demo.exception.IllegalOperationException;

public interface InvestigadorService {
	List<Investigador> listartodos();
	Investigador buscarPorId(Long id);
	Investigador grabar(Investigador investigador) throws IllegalOperationException;
	Investigador actualizar(Investigador investigador, long id) throws EntityNotFoundException, IllegalOperationException;
	void eliminar(Long id)  throws EntityNotFoundException, IllegalOperationException;
	Investigador findByDni(String dni);
	Investigador findByEmail(String email);
}
