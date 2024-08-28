package GestionStocks.Controller;

import GestionStocks.service.StockServiceImp;

public class StockController {

	private StockServiceImp stc;

	public StockController(StockServiceImp stc) {
		super();
		this.stc = stc;
	}

	public StockController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StockServiceImp getStc() {
		return stc;
	}

	public void setStc(StockServiceImp stc) {
		this.stc = stc;
	}
	
}
