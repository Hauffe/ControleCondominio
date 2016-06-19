package condominio.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexandre
 */
public class Condominio {
    
    private String nomeFantasia;
    
    private Endereco endereco;
    private List<Residencia> residencias;
    private List<Orcamento> orcamentos;
    private List<Regimento> regimentos;

    public Condominio(String nomeFantasia, Endereco endereco) {
        this.nomeFantasia = nomeFantasia;
        
        this.residencias = new ArrayList<>();
        this.regimentos = new ArrayList<>();
        this.orcamentos = new ArrayList<>();
        
        this.endereco = endereco;
        this.endereco.setCondominio(this);
    }
    
    public void addResidencia(Residencia residencia){
        this.residencias.add(residencia);
    }
    public void addOrcamento(Orcamento orcamento){
        this.orcamentos.add(orcamento);
    }
    public void addRegimento(Regimento regimento){
        this.regimentos.add(regimento);
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Residencia> getResidencias() {
        return residencias;
    }

    public void setResidencias(List<Residencia> residencias) {
        this.residencias = residencias;
    }

    public List<Orcamento> getOrcamentos() {
        return orcamentos;
    }

    public void setOrcamentos(List<Orcamento> orcamentos) {
        this.orcamentos = orcamentos;
    }

    public List<Regimento> getRegimentos() {
        return regimentos;
    }

    public void setRegimentos(List<Regimento> regimentos) {
        this.regimentos = regimentos;
    }
    
       

    @Override
    public String toString() {
        return "Condominio{" + "nomeFantasia=" + nomeFantasia + ", endereco=" + endereco + ", residencias=" + residencias + ", orcamentos=" + orcamentos + ", regimentos=" + regimentos + '}';
    }
}
