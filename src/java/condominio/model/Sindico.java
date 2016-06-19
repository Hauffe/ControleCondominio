package condominio.model;

import java.util.Date;

/**
 *
 * @author Alexandre
 */
public class Sindico extends Condomino{
    
    private Date dataInicio;
    private Date dataFim;
    private String status;

    public Sindico(Date dataInicio, Date dataFim, String status, String nome, Integer rg, Residencia residencia) {
        super(nome, rg, residencia);
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.status = status;
    }

    public Sindico(String nome, Integer rg, Residencia residencia) {
        super(nome, rg, residencia);
    }
    
    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
}
