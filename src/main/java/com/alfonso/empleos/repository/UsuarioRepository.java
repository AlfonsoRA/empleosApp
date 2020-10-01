package com.alfonso.empleos.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.alfonso.empleos.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	@Query(value = "select u from Usuario u join fetch u.perfiles where u.id = ?1")
	Optional<Usuario> buscaUsuarioXIdFetch(int id );
	
	}
