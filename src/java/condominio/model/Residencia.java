package condominio.model;

/**
 *
 * @author Alexandre
 */
public class Residencia {
    
    private Integer numero;
    private Condominio condominio;
    private Condomino condomino;

    public Residencia(Integer numero, Condominio condominio, Condomino condomino) {
        this.numero = numero;
        
        this.condominio = condominio;
        this.condominio.addResidencia(this);
        
        this.condomino = condomino;
        this.condominio.addResidencia(this);
    }

    public Residencia() {
        
    }
    
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Condominio getCondominio() {
        return condominio;
    }

    public void setCondominio(Condominio condominio) {
        this.condominio = condominio;
    }

    public Condomino getCondomino() {
        return condomino;
    }

    public void setCondomino(Condomino condomino) {
        this.condomino = condomino;
    }
    
    
    
    
    
}
