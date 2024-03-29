package br.ufjf.dcc193.trabalho.Modelo;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

/**
 * Atendimento
 */
@Entity
public class Atendimento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Categoria idCategoria;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = true)
    private Date dataFechamento;

    @Temporal(TemporalType.TIMESTAMP)
    @NotBlank
    private Date dataCriacao;

    @NotBlank
    private String descricaoTextual;

    @OneToOne
    private Atendente idAtendente;

    @OneToOne(optional = true)
    private Usuario idUsuario;

    @NotBlank
    private String status;

    @NotBlank
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idatendimento", cascade = CascadeType.ALL)
    private List<Evento> idEventos;

    public Atendimento() {
    }

    public Atendimento(Long id, Categoria idCategoria, Date dataFechamento, @NotBlank Date dataCriacao,
            @NotBlank String descricaoTextual, Atendente idAtendente, Usuario idUsuario, @NotBlank String status,
            @NotBlank List<Evento> idEventos) {
        this.id = id;
        this.idCategoria = idCategoria;
        this.dataFechamento = dataFechamento;
        this.dataCriacao = dataCriacao;
        this.descricaoTextual = descricaoTextual;
        this.idAtendente = idAtendente;
        this.idUsuario = idUsuario;
        this.status = status;
        this.idEventos = idEventos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Categoria getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Categoria idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Date getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(Date dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getDescricaoTextual() {
        return descricaoTextual;
    }

    public void setDescricaoTextual(String descricaoTextual) {
        this.descricaoTextual = descricaoTextual;
    }

    public Atendente getIdAtendente() {
        return idAtendente;
    }

    public void setIdAtendente(Atendente idAtendente) {
        this.idAtendente = idAtendente;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Evento> getIdEventos() {
        return idEventos;
    }

    public void setIdEventos(List<Evento> idEventos) {
        this.idEventos = idEventos;
    }

    @Override
    public String toString() {
        return "Atendimento [dataCriacao=" + dataCriacao + ", dataFechamento=" + dataFechamento + ", descricaoTextual="
                + descricaoTextual + ", id=" + id + ", idAtendente=" + idAtendente + ", idCategoria=" + idCategoria
                + ", idEventos=" + idEventos + ", idUsuario=" + idUsuario + ", status=" + status + "]";
    }

}