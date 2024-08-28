package GestionStocks.service;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

import GestionStocks.entities.Stock;
import GestionStocks.enumeration.Operation;


public class StockServiceImp implements StockService{

	List<Stock> stocks;

//	public StockServiceImp() {
//		super();
//		// TODO Auto-generated constructor stub
//		stocks=new ArrayList<>();
//	}

	
	@Override
	public Stock recevoirQuantite(Stock s) {
		// TODO Auto-generated method stub
		stocks.add(s);
		s.getMedicament().setQuantiteEnSTock(s.getMedicament().getQuantiteEnSTock()+s.getQuantite());
		return s;
	}

	public List<Stock> getStocks() {
		return stocks;
	}

	public void setStocks(List<Stock> stocks) {
		this.stocks = stocks;
	}

	@Override
	public List<Stock> list() {
		// TODO Auto-generated method stub
		return stocks;
	}

	@Override
	public List<Stock> list(Operation op) {
		// TODO Auto-generated method stub
		return stocks.stream()
		.filter(elmt-> elmt.getOperation()==Operation.Reception)
		.collect(Collectors.toList());
	}

	@Override
	public String VendreQuantite(Stock s,int seuil) {
		// TODO Auto-generated method stub
		if(s.getMedicament().getQuantiteEnSTock()>=s.getQuantite()) {
			stocks.add(s);
			s.getMedicament().setQuantiteEnSTock(s.getMedicament().getQuantiteEnSTock()-s.getQuantite());
			if(s.getMedicament().getQuantiteEnSTock()<= seuil) {
				System.out.println("Il vous reste moins de "+seuil+" de "+s.getMedicament().getNom());
			}
			return "La modification de la quantite en stock du medicament est bien effectuée";
		}
			return "La quantite en stock du medicament est insuffisante pour realiser cette operation";
	}

	

	
	
	
}
