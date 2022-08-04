package fr.eni.pizzaria.dal;

import java.util.List;

import fr.eni.pizzaria.bo.Aliments;

import fr.eni.pizzaria.bo.Pizza;

public class PizzaTestDAL {

	public static void main(String[] args) throws Exception {

		DAO<Pizza> PizzaDAO = DAOFactory.getPizzaDAO();
		DAO<Aliments> AlimentsDAO = DAOFactory.getAlimentsDAO();

		// Instanciation du jeu d'essai.
		// Ajout des Pizza.
		Pizza a1 = new Pizza(100, "Regina", 9);
		Aliments aReg1 = new Aliments("Jambon", 100);
		Aliments aReg2 = new Aliments("Fromage", 100);
		Aliments aReg3 = new Aliments("Tomate", 100);
		Aliments aReg4 = new Aliments("Olive", 100);
		Pizza a2 = new Pizza(200, "Regalade", 20);
		Aliments aCal1 = new Aliments("Creme", 200);
		Aliments aCal2 = new Aliments("Fromage", 200);
		Aliments aCal3 = new Aliments("Echalote", 200);
		Pizza a3 = new Pizza(300, "4 Fromage", 15);
		Aliments aFro1 = new Aliments("Chevre", 300);
		Aliments aFro2 = new Aliments("Rochefort", 300);
		Aliments aFro3 = new Aliments("Creme", 300);

		System.out.println("---------------------------\n");

		System.out.println("Ajout des Pizzas... ");

		 PizzaDAO.insert(a1);
		 System.out.println("Pizza ajouté  : " + a1.toString());
		 PizzaDAO.insert(a2);
		 System.out.println("Pizza ajouté  : " + a2.toString());
		 PizzaDAO.insert(a3);
		 System.out.println("Pizza ajouté  : " + a3.toString());

		System.out.println("---------------------------\n");

		System.out.println("Ajout des aliments de la pizza : " + a1.getNom());

		AlimentsDAO.insert(aReg1);
		AlimentsDAO.insert(aReg2);
		AlimentsDAO.insert(aReg3);
		AlimentsDAO.insert(aReg4);
		System.out.println("Les Aliments suivant on été ajouté : " + aReg1.getNom() + " | " + aReg2.getNom() + " | "
				+ aReg3.getNom() + " | " + aReg4.getNom()+ "\n");

		System.out.println("---------------------------\n");

		System.out.println("Ajout des aliments de la pizza : " + a2.getNom());

		AlimentsDAO.insert(aCal1);
		AlimentsDAO.insert(aCal2);
		AlimentsDAO.insert(aCal3);
		System.out.println("Les Aliments suivant on été ajouté : " + aCal1.getNom() + " | " + aCal2.getNom() + " | "
				+ aCal3.getNom() + "\n");

		System.out.println("---------------------------\n");

		System.out.println("Ajout des aliments de la pizza : " + a3.getNom());

		AlimentsDAO.insert(aFro1);
		AlimentsDAO.insert(aFro2);
		AlimentsDAO.insert(aFro3);
		System.out.println("Les Aliments suivant on été ajouté : " + aReg1.getNom() + " | " + aReg2.getNom() + " | "
				+ aReg3.getNom() + "\n");

		// --------------Sélection de tous les Pizzas

		List<Pizza> listeDesPizza = PizzaDAO.selectAll();
		System.out.println("Sélection de toutes les Pizzas : \n\n" + listeDesPizza.toString());


		// --------------Sélection de la Pizza par id

		// Pizza a = PizzaDAO.selectById(a2.getIdPizza());
		// System.out.println("Sélection de l'Pizza par id : " + a.toString());

	
		

		// --------------Modification d'un Pizza

		// System.out.println("Modification d'un Pizza : ");
		// System.out.println("Pizza avant modification : " + a1.toString());
		// PizzaDAO.update(a1);
		// System.out.println("Pizza après modification : " + a1.toString());

		// -------------- Suppression d'une Pizza

		// System.out.println("Suppression de l'Pizza : " + a1.toString());
		// PizzaDAO.delete(a1.getIdPizza());
		// Pizzas = PizzaDAO.selectAll();

		// System.out.println("Liste des Pizzas après suppression : " +
		// Pizzas.toString() );

		// System.out.println("Liste des Pizzas après suppression : ");
		// StringBuffer sb = new StringBuffer();
		// for (Pizza art : Pizzas) {
		// sb.append(art.getIdPizza());
		// sb.append(", ref=");
		// //sb.append(art.getReference()).append("]\n");
		// }
		// System.out.println(sb.toString());
		// System.out.println("---------------------------------------------------------------");

	}

}
