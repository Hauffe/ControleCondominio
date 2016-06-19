/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominio.controller;

import condominio.dao.BoletoDao;
import condominio.model.Boleto;
import condominio.model.Condominio;

/**
 * @author Alexandre
 */
public class BoletoConstroller {
    
    private static BoletoConstroller instance = new BoletoConstroller();
    
    private BoletoConstroller(){
    }
    
    public static BoletoConstroller getInstance(){
        return instance;
    }
    
	public Long insert(Boleto object) throws Exception {
		validar(object);
		return BoletoDao.getInstance().insert(object);
	}
	
	public boolean update(Boleto object) throws Exception {
		validar(object);
		return BoletoDao.getInstance().update(object);
	}

	public boolean delete(Boleto object) {
		return BoletoDao.getInstance().delete(object);
	}
        
	public boolean novoBoleto(Boleto object) throws Exception {
		validar(object);
		return false;
	}
	
	public boolean gravarBoleto(Boleto object) throws Exception {
		validar(object);
		return false;
	}

	public boolean enviarBoleto(Boleto boleto, Condominio condominio) throws Exception {
                validar(boleto);
		return false;
	}
        

    private void validar(Boleto object) throws Exception{
        if(object == null)
            throw new Exception();
        
    }
    
}
