package condominio.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Alexandre
 */
public class Orcamento {
    
    private Date data;
    private List<Boleto> boletos;
    private List<Lancamento> lancamentos;
    private Condominio condominio;

    public Orcamento(Date data, Condominio condominio) {
        this.data = data;
        
        this.condominio = condominio;
        this.condominio.addOrcamento(this);
        
        this.boletos = new ArrayList<>();
        this.lancamentos = new ArrayList<>();
    }

    public void addLancamento(Lancamento lancamento){
        this.lancamentos.add(lancamento);
    }
    public void addBoleto(Boleto boleto){
        this.boletos.add(boleto);
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<Boleto> getBoletos() {
        return boletos;
    }

    public void setBoletos(List<Boleto> boletos) {
        this.boletos = boletos;
    }

    public List<Lancamento> getLancamentos() {
        return lancamentos;
    }

    public void setLancamentos(List<Lancamento> lancamentos) {
        this.lancamentos = lancamentos;
    }

    public Condominio getCondominio() {
        return condominio;
    }

    public void setCondominio(Condominio condominio) {
        this.condominio = condominio;
    }
    

    @Override
    public String toString() {
        return "Orcamento{" + "data=" + data + ", boletos=" + boletos + ", lancamentos=" + lancamentos + ", condominio=" + condominio + '}';
    }
}
