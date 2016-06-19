package condominio.model;

import java.util.Date;

/**
 *
 * @author Alexandre
 */
public class Regimento {
    
    private Integer numero;
    private Date dataCriacao;
    private String descricao;
    private Condominio condominio;

    public Regimento(Integer numero, Date dataCriacao, String descricao, Condominio condominio) {
        this.numero = numero;
        this.dataCriacao = dataCriacao;
        this.descricao = descricao;
        
        this.condominio = condominio;
        this.condominio.addRegimento(this);
    }

    public Regimento() {
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Condominio getCondominio() {
        return condominio;
    }

    public void setCondominio(Condominio condominio) {
        this.condominio = condominio;
    }
    @Override
    public String toString() {
        return "Regimento{" + "numero=" + numero + ", dataCriacao=" + dataCriacao + ", descricao=" + descricao + ", condominio=" + condominio + '}';
    }
}
