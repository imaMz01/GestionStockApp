package GestionStocks.service;

import java.util.List;

import GestionStocks.entities.Stock;
import GestionStocks.enumeration.Operation;


public interface StockService {

	Stock recevoirQuantite(Stock s);
	List<Stock> list();
	List<Stock> list(Operation op);
	String VendreQuantite(Stock s,int seuil);
	
}
