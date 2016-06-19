/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominio.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexandre
 */
public class Condomino {
    
    private String nome;
    private Integer rg;
    private List<Residencia> residencias;
    private List<Reuniao> reunioes;

    public Condomino(String nome, Integer rg, Residencia residencia) {
        this.nome = nome;
        this.rg = rg;
        this.reunioes = new ArrayList<>();
        this.residencias = new ArrayList<>();
        this.residencias.add(residencia);
    }

    public Condomino() {
    }

    public void addResidencia(Residencia residencia){
        this.residencias.add(residencia);
    }
    public void addReuniao(Reuniao reuniao){
        this.reunioes.add(reuniao);
    }
    
    public List<Reuniao> getReunioes() {
        return reunioes;
    }

    public void setReunioes(List<Reuniao> reunioes) {
        this.reunioes = reunioes;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

    public List<Residencia> getResidencias() {
        return residencias;
    }

    public void setResidencias(List<Residencia> residencias) {
        this.residencias = residencias;
    }
    
    
    

}
