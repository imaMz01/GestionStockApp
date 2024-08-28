package GestionStocks.service;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import GestionStocks.entities.Medicament;


public class MedicamentServiceImp implements MedicamentService{

	List<Medicament> medicaments;

//	public MedicamentServiceImp() {
//		super();
//		this.medicaments = new ArrayList<>();
//	}
	
	
	@Override
	public Medicament add(Medicament m) {
		// TODO Auto-generated method stub
		medicaments.add(m);
		return null;
	}

	public List<Medicament> getMedicaments() {
		return medicaments;
	}

	public void setMedicaments(List<Medicament> medicaments) {
		this.medicaments = medicaments;
	}

	@Override
	public Medicament update(Medicament m) {
		// TODO Auto-generated method stub
		
		medicaments
		.stream()
		.filter(elemt-> elemt.getId()==m.getId()).findFirst().ifPresent(e-> {
			e.setDosage(m.getDosage());
			e.setNom(m.getNom());
			e.setPrix(m.getPrix());
			e.setQuantiteEnSTock(m.getQuantiteEnSTock());
		
		});
		return m;
		
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Optional<Medicament> med=medicaments
		.stream()
		.filter(elemt-> elemt.getId()==id).findFirst();
		if(med.isPresent()) {
			medicaments.remove(med.get());
		}
	}

	@Override
	public List<Medicament> list() {
		// TODO Auto-generated method stub
		return medicaments;
	}

	@Override
	public void stockActuel() {
		// TODO Auto-generated method stub
		medicaments.forEach(elm-> {
			System.out.println("Stock actuel du medicament N "+ elm.getId());
			System.out.print("Nom : "+elm.getNom());
			System.out.println("  ||  La quantite en stock : "+elm.getQuantiteEnSTock());
		});
		
	}
	
	
	
	
}
