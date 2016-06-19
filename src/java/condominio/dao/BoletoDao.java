package condominio.dao;

import condominio.model.Boleto;
import condominio.model.Orcamento;

/**
 * @author Alexandre
 */
public class BoletoDao {
    
    private static StringBuilder insertSQL = new StringBuilder()
            .append("INSERT INTO boleto ")
            .append("	(valor, status, dataLancamento, dataVencimento) ")
            .append("VALUES ")
            .append("	(?, ?, ?, ?)");

    private static StringBuilder updateSQL = new StringBuilder()
            .append("UPDATE boleto ")
            .append("SET valor = ?, status = ?, dataLancamento = ?, dataVencimento = ? ")
            .append("WHERE ID = ? ");

    private static StringBuilder deleteSQL = new StringBuilder()
            .append("DELETE FROM boleto ")
            .append("WHERE ID = ? ");

    private static StringBuilder selectIdSQL =  new StringBuilder()
            .append("SELECT id, valor, status, dataLancamento, dataVencimento")
            .append("FROM boleto ")
            .append("WHERE id = ? ");

    private static StringBuilder selectAllSQL =  new StringBuilder()
            .append("SELECT id, valor, status, dataLancamento, dataVencimento ")
            .append("FROM boleto ");
    
    private static StringBuilder enviarBoletoSQL =  new StringBuilder()
            .append("UPDATE boleto ")
            .append("SET id_orcamento = ? ")
            .append("WHERE id = ? ");
    
    private static BoletoDao instance = new BoletoDao();
    
    private BoletoDao(){
    }
    
    public static BoletoDao getInstance(){
        return instance;
    }
    
	public Long insert(Boleto object) {
		return null;
	}

	public boolean update(Boleto object) {
		return true;
	}

	public boolean delete(Boleto object) {
		return true;
	}
        
	public boolean persistirBoleto(Boleto object) {
		return true;
	}
	public boolean enviarBoleto(Boleto boleto, Orcamento orcamento) {
		return true;
	}
        
        
    
}
