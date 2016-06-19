/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominio.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Alexandre
 */
public class Reuniao {
    
    private Date data;
    private String pauta;
    private String decisao; 
    
    private List<Condomino> condominos;
    private Sindico sindico;

    public Reuniao(Date data, String pauta, String decisao, Sindico sindico, List<Condomino> condominos) {
        this.condominos = condominos;
        
        for (Condomino condomino : condominos) {
            condomino.addReuniao(this);
        }

        this.data = data;
        this.pauta = pauta;
        this.decisao = decisao;
        
        this.sindico = sindico;
        sindico.getReunioes().add(this);
        
    }
    
    public void addCondomino(Condomino condomino){
        this.condominos.add(condomino);
    } 

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getPauta() {
        return pauta;
    }

    public void setPauta(String pauta) {
        this.pauta = pauta;
    }

    public String getDecisao() {
        return decisao;
    }

    public void setDecisao(String decisao) {
        this.decisao = decisao;
    }

    public List<Condomino> getCondominos() {
        return condominos;
    }

    public void setCondominos(List<Condomino> condominos) {
        this.condominos = condominos;
    }

    public Sindico getSindico() {
        return sindico;
    }

    public void setSindico(Sindico sindico) {
        this.sindico = sindico;
    }

    @Override
    public String toString() {
        return "Reuniao{" + "data=" + data + ", pauta=" + pauta + ", decisao=" + decisao + ", condominos=" + condominos + ", sindico=" + sindico + '}';
    }
}
