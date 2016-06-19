package condominio.model;

import java.util.Date;

/**
 *
 * @author Alexandre
 */
public class Boleto {
    
    private Double valor;
    private String status;
    private Date dataLancamento;
    private Date dataVencimento;
    
    private Orcamento orcamento;

    public Boleto(Double valor, String status, Date dataLancamento, Date dataVencimento, Orcamento orcamento) {
        this.valor = valor;
        this.status = status;
        this.dataLancamento = dataLancamento;
        this.dataVencimento = dataVencimento;
        this.orcamento = orcamento;
    }

    public Boleto() {
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Orcamento orcamento) {
        this.orcamento = orcamento;
    }
    @Override
    public String toString() {
        return "Boleto{" + "valor=" + valor + ", status=" + status + ", dataLancamento=" + dataLancamento + ", dataVencimento=" + dataVencimento + ", orcamento=" + orcamento + '}';
    }
}
