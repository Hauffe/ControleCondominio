package condominio.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alexandre
 */
public class TipoLancamento {
    
    private String nome;
    private String descricao;
    
    private List<Lancamento> lancamentos;

    public TipoLancamento(String nome, String descricao, List<Lancamento> lancamentos) {
        this.nome = nome;
        this.descricao = descricao;
        this.lancamentos = lancamentos;
    }
    public TipoLancamento() {
        lancamentos = new ArrayList<Lancamento>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Lancamento> getLancamentos() {
        return lancamentos;
    }

    public void setLancamentos(List<Lancamento> lancamentos) {
        this.lancamentos = lancamentos;
    }
}
