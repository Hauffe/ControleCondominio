package condominio.model;

import java.util.Date;

/**
 *
 * @author Alexandre
 */
public class Lancamento {
    
    private String descricao;
    private Double valor;
    private Date data;
    
    private TipoLancamento tipoLancamento;

    public Lancamento(String descricao, Double valor, Date data, TipoLancamento tipoLancamento) {
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
        this.tipoLancamento = tipoLancamento;
    }
    public Lancamento() {
    }
    
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public TipoLancamento getTipoLancamento() {
        return tipoLancamento;
    }
    public void setTipoLancamento(TipoLancamento tipoLancamento) {
        this.tipoLancamento = tipoLancamento;
    }
    @Override
    public String toString() {
        return "Lancamento{" + "descricao=" + descricao + ", valor=" + valor + ", data=" + data + ", tipoLancamento=" + tipoLancamento + '}';
    }
}
