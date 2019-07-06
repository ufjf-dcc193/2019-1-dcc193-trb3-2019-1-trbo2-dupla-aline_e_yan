package br.ufjf.dcc193.trabalho.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ufjf.dcc193.trabalho.Modelo.Evento;

/**
 * EventoRepositorio
 */
@Repository
public interface EventoRepositorio extends JpaRepository<Evento,Long> {

    
}