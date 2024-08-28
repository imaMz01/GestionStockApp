package GestionStocks.entities;

public class Medicament {

	private int id;
	private String nom;
	private int dosage;
	private int quantiteEnSTock;
	private double prix;
	public Medicament(int id, String nom, int dosage, int quantiteEnSTock, double prix) {
		super();
		this.id = id;
		this.nom = nom;
		this.dosage = dosage;
		this.quantiteEnSTock = quantiteEnSTock;
		this.prix = prix;
	}
	public Medicament() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getDosage() {
		return dosage;
	}
	public void setDosage(int dosage) {
		this.dosage = dosage;
	}
	public int getQuantiteEnSTock() {
		return quantiteEnSTock;
	}
	public void setQuantiteEnSTock(int quantiteEnSTock) {
		this.quantiteEnSTock = quantiteEnSTock;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	public void info() {
		System.out.println("**Les information du medicament N "+id);
		System.out.println("Nom : "+nom);
		System.out.println("Prix : "+prix);
		System.out.println("La quantite en stock : "+quantiteEnSTock);
		System.out.println("dosage : "+dosage);
		
	}
}
