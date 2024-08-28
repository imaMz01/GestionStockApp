package GestionStocks.entities;

import java.time.LocalDate;

import GestionStocks.enumeration.Operation;



public class Stock {

	private int id;
	private Medicament medicament;
	private int quantite;
	private Operation operation;
	private LocalDate date;
	
	
	public Stock(int id, Medicament medicament, int quantite, Operation operation, LocalDate date) {
		super();
		this.id = id;
		this.medicament = medicament;
		this.quantite = quantite;
		this.operation = operation;
		this.date = date;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Medicament getMedicament() {
		return medicament;
	}


	public void setMedicament(Medicament medicament) {
		this.medicament = medicament;
	}


	public int getQuantite() {
		return quantite;
	}


	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}


	public Operation getOperation() {
		return operation;
	}


	public void setOperation(Operation operation) {
		this.operation = operation;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void info() {
		System.out.println("***Les informations du stock N "+ id);
		System.out.print("Medicament : ");
		medicament.info();
		System.out.println("Operation :"+operation);
		if(operation==Operation.Reception) {
			System.out.println("quantite reçues : "+quantite);
			System.out.println("Date de reception : "+date);
		}
		else {
			System.out.println("quantite vendues : "+quantite);
			System.out.println("Date de vente : "+date);
		}
			
		
	}
}
