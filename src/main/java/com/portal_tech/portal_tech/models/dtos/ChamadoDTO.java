package com.portal_tech.portal_tech.models.dtos;

import com.portal_tech.portal_tech.models.Chamado;
import com.portal_tech.portal_tech.models.Pessoa;
import com.portal_tech.portal_tech.models.Prioridade;
import com.portal_tech.portal_tech.models.Status;
import com.portal_tech.portal_tech.repositores.PessoaRepository;

import com.portal_tech.portal_tech.models.*; //

import com.portal_tech.portal_tech.repositores.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

public class ChamadoDTO {
    private Long id;

    private String descricao;

    private LocalDate dt_abertura;


    private LocalDate dt_fim;

    private Pessoa id_tecnico;

    private Pessoa id_usuario;

    private Prioridade id_prioridade;

    private Status id_status;

    private Setor id_setor;

    @Autowired
    private StatusRepository statusRepository;

    @Autowired
    private PessoaRepository pessoaRepository;

    public ChamadoDTO() {
    }

    public ChamadoDTO(Chamado chamado) { //esse construtor transforma o chamado em chamadoDTO
        this.id = chamado.getId();
        this.descricao = chamado.getDescricao();
        this.dt_abertura = chamado.getDt_abertura();
        this.dt_fim = chamado.getDt_fim();
        this.id_usuario = chamado.getIdUsuario();
        this.id_tecnico = chamado.getIdTecnico();
        this.id_prioridade = chamado.getIdPrioridade();
        this.id_status = chamado.getIdStatus();
    }

    public static Chamado convert(ChamadoDTO chamadoDTO) { //converterá o chamadoDTO em chamado - inverso do método anterior
        Chamado chamado = new Chamado();
        chamado.setId(chamadoDTO.getId());
        chamado.setDescricao(chamadoDTO.getDescricao());
        chamado.setDt_abertura(chamadoDTO.getDt_abertura());
        chamado.setDt_fim(chamadoDTO.getDt_fim());

        chamado.setIdUsuario(chamadoDTO.getId_usuario());

        chamado.setIdTecnico(chamadoDTO.getId_tecnico());

        chamado.setIdPrioridade(chamadoDTO.getId_prioridade());

        chamado.setIdStatus(chamadoDTO.getId_status());




        return chamado;
    }




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDt_abertura() {
        return dt_abertura;
    }

    public void setDt_abertura(LocalDate dt_abertura) {
        this.dt_abertura = dt_abertura;
    }


    public LocalDate getDt_fim() {
        return dt_fim;
    }

    public void setDt_fim(LocalDate dt_fim) {
        this.dt_fim = dt_fim;
    }

    public Pessoa getId_tecnico() {
        return id_tecnico;
    }

    public void setId_tecnico(Pessoa id_tecnico) {
        this.id_tecnico = id_tecnico;
    }

    public Pessoa getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Pessoa id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Prioridade getId_prioridade() {
        return id_prioridade;
    }

    public void setId_prioridade(Prioridade id_prioridade) {
        this.id_prioridade = id_prioridade;
    }

    public Status getId_status(){
        return id_status;
        //return id_status != null ? id_status.getId() : null;
    }

    public void setId_status(Status id_status) {
        this.id_status = id_status;
    }

}


