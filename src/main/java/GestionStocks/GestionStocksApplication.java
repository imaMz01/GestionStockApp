package GestionStocks;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import GestionStocks.Controller.MedicamentController;
import GestionStocks.Controller.StockController;
import GestionStocks.entities.Medicament;
import GestionStocks.entities.Stock;
import GestionStocks.enumeration.Operation;

@SpringBootApplication
public class GestionStocksApplication {

	public static void main(String[] args) {
		//SpringApplication.run(GestionStocksApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("Configuration/Medicament.xml");

		MedicamentController Pers = (MedicamentController) context.getBean("MedicamentController");
		Medicament m1 =new Medicament(1, "nom1", 5, 0, 22.5);
		Medicament m2 =new Medicament(2, "nom2", 1, 0, 23);
		Medicament m3 =new Medicament(3, "nom3", 8, 0, 150);
		Medicament m4 =new Medicament(4, "nom4", 5, 0, 18);
		Medicament m5 =new Medicament(5, "nom5", 6, 0, 70);
		Pers.getMed().add(m1);
		Pers.getMed().add(m2);
		Pers.getMed().add(m3);
		Pers.getMed().add(m4);
		Pers.getMed().add(m5);
		System.out.println("*** Afficher la liste des medicaments ***");
		Pers.getMed().list().forEach(elmt -> elmt.info());
		System.out.println("*** Modifier un medicament ***");
		Pers.getMed().update(new Medicament(2, "nom22", 10, 0, 25));
		System.out.println("*** Supprimer un medicament ***");
		Pers.getMed().delete(5);
		System.out.println("*** Afficher la liste des medicaments ***");
		Pers.getMed().list().forEach(elmt -> elmt.info());
		
		ApplicationContext context1 = new ClassPathXmlApplicationContext("Configuration/Stock.xml");

		StockController st = (StockController) context1.getBean("StockController");
		Stock s1=new Stock(1, m1, 100, Operation.Reception, LocalDate.parse("2024-08-12"));
		Stock s2=new Stock(2, m2, 10, Operation.Reception, LocalDate.parse("2024-08-12"));
		Stock s3=new Stock(3, m3, 300, Operation.Reception, LocalDate.parse("2024-08-13"));
		Stock s4=new Stock(4, m4, 100, Operation.Reception, LocalDate.parse("2024-08-12"));
		
		st.getStc().recevoirQuantite(s1);
		st.getStc().recevoirQuantite(s2);
		st.getStc().recevoirQuantite(s3);
		st.getStc().recevoirQuantite(s4);
		
		System.out.println("*** Afficher la liste des stock ***");
		st.getStc().list().forEach(elmt -> elmt.info());
		System.out.println("*** Afficher l'historique des réceptions ***");
		st.getStc().list(Operation.Reception).forEach(elmt -> elmt.info());
		System.out.println("*** Ajouter des ventes ***");
		Stock s6=new Stock(6, m3, 250, Operation.Vente, LocalDate.parse("2024-08-18"));
		System.out.println(st.getStc().VendreQuantite(s6,50));
		System.out.println("*** Afficher la liste des medicaments ***");
		Pers.getMed().list().forEach(el->el.info());
		System.out.println("*** Afficher l'historique des réceptions et des ventes ***");
		st.getStc().list().forEach(elmt -> elmt.info());
		System.out.println("*** Ajouter des ventes ***");
		Stock s7=new Stock(7, m1, 110, Operation.Vente, LocalDate.parse("2024-08-18"));
		System.out.println(st.getStc().VendreQuantite(s7,10));
		System.out.println("*** Afficher la liste des medicaments ***");
		Pers.getMed().list().forEach(elmt -> elmt.info());
		System.out.println("*** Le stock actuel de chaque medicament ***");
		Pers.getMed().stockActuel();
	}

}
