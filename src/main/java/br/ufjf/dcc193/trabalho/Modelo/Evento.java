
package br.ufjf.dcc193.trabalho.Modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import java.util.Date;

/**
 * Evento
 */

@Entity
public class Evento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;
    
    @NotBlank
    private String tipo;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "atendimento_id")
    private Atendimento idatendimento;

    public Evento() {
    }

    public Evento(Long id, Date data, @NotBlank String tipo, Atendimento idatendimento) {
        this.id = id;
        this.data = data;
        this.tipo = tipo;
        this.idatendimento = idatendimento;
    }

    @Override
    public String toString() {
        return "Evento [data=" + data + ", id=" + id + ", idatendimento=" + idatendimento + ", tipo=" + tipo + "]";
    }
    
    
}