package fr.eni.pizzaria.bo;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    /**
     * 3 attributs
     * idPizza
     * nom
     * prix
     * tous en not null dans la bdd
     */
    private int idPizza;
    private String nom;
    private float prix;
    private List<Aliments> aliments = new ArrayList<>();


    /**
     * Constructeur ne prenant pas de paramétres
     */
    public Pizza(){

    }


    /**
     * Constructeur prenant en parametres les 3 attributs.
     * @param idPizza
     * @param nom
     * @param prix
     */
    public Pizza(Integer idPizza, String nom, float prix) {
        this.idPizza = idPizza;
        this.nom = nom;
        this.prix = prix;
    }


    //GETTER ET SETTER

    public List<Aliments> getAliments() {
        return aliments;
    }

    public void addAliment(Aliments aliment){
        this.aliments.add(aliment);
    }


    public Pizza(String nom, float prix) {
        this.nom = nom;
        this.prix = prix;
    }


    public Integer getidPizza() {
        return idPizza;
    }

    public void setidPizza(Integer idPizza) {
        this.idPizza = idPizza;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }


    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Pizza : "); 
        str.append(this.getNom());
        str.append(" -> Ingredients : [");
        for(Aliments in : aliments) {
            str.append(" " + in.getNom() + " ");
        }
        str.append("]");
        return str.toString();
    }


    //Getter et Setter de Aliments.
   

    

}
