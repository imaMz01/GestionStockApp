package GestionStocks.Controller;

import GestionStocks.service.MedicamentServiceImp;

public class MedicamentController {

	private MedicamentServiceImp med;

	public MedicamentController(MedicamentServiceImp med) {
		super();
		this.med = med;
	}

	public MedicamentController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MedicamentServiceImp getMed() {
		return med;
	}

	public void setMed(MedicamentServiceImp med) {
		this.med = med;
	}
	
	
}
