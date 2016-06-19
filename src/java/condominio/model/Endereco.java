package condominio.model;

/**
 *
 * @author Alexandre
 */
public class Endereco {
    
    private Integer numero;
    private String rua;
    private String cidade;
    private Integer cep;
    private String uf;

    private Condominio condominio;

    public Endereco(Integer numero, String rua, String cidade, Integer cep, String uf, Condominio condominio) {
        this.numero = numero;
        this.rua = rua;
        this.cidade = cidade;
        this.cep = cep;
        this.uf = uf;
        this.condominio = condominio;
    }
    
    public Endereco() {
        
    }
    
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Condominio getCondominio() {
        return condominio;
    }

    public void setCondominio(Condominio condominio) {
        this.condominio = condominio;
    }

    @Override
    public String toString() {
        return "Endereco{" + "numero=" + numero + ", rua=" + rua + ", cidade=" + cidade + ", cep=" + cep + ", uf=" + uf + ", condominio=" + condominio + '}';
    }
    
}
