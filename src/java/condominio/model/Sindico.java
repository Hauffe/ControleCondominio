package condominio.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Alexandre
 */
public class Sindico extends Condomino{
    
    private Date dataInicio;
    private Date dataFim;
    private String status;
    private List<Reuniao> reunioes;

    public Sindico(Date dataInicio, Date dataFim, String status, String nome, Integer rg, Residencia residencia) {
        super(nome, rg, residencia);
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.status = status;
        
        this.reunioes = new ArrayList<>();
    }

    public Sindico(String nome, Integer rg, Residencia residencia) {
        super(nome, rg, residencia);
        this.reunioes = new ArrayList<>();
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
