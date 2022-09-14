package com.generation.lojadegames.repository;

import java.util.Optional;

import com.generation.lojadegames.model.Usuario;
import com.generation.lojadegames.model.UsuarioLogin;

public interface UsuarioRepository {

	Optional<Usuario> findByUsuario(String userName);

	Optional<UsuarioLogin> findById(Long id);

	Object findAll();

	Object save(Usuario usuario);



}
