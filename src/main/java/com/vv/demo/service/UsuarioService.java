package com.vv.demo.service;

import java.util.List;

import com.vv.demo.domain.Usuario;

public interface UsuarioService {

	List<Usuario> listartodos();
	Usuario buscarPorId(Long id);
	Usuario grabar(Usuario usuario);
	Usuario actualizar(Usuario usuario, long id);
	void eliminar(Long id);
	Usuario findByEmail(String email);
}
