package GestionStocks.service;

import java.util.List;

import GestionStocks.entities.Medicament;



public interface MedicamentService {

	Medicament add(Medicament m);
	Medicament update(Medicament m);
	void delete(int id);
	List<Medicament> list();
	void stockActuel();
}
