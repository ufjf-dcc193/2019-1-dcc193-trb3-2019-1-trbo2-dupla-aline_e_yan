package br.ufjf.dcc193.trabalho.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ufjf.dcc193.trabalho.Modelo.Atendente;

/**
 * AtendenteRepositorio
 */
@Repository
public interface AtendenteRepositorio extends JpaRepository<Atendente,Long> {

    
}