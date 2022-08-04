package fr.eni.pizzaria.bo;

public class Aliments {

    /**
     * 3 paramétres pour la class Aliments.
     * idAliments
     * nom
     * idPizza.
     * tous en non null en BDD.
     * id pizza FK de la class Pizza.
     * pas de identity pour idAliments, il peux y avoir plusieurs fois le même nom
     * d'aliments en base. l'aliments n'étant pas ratacher a la même pizza.
     * 
     */
    private int idAliments;
    private String nom;
    private int idPizza;

    /**
     * Constructeur vide.
     */
    public Aliments() {

    }

    /**
     * Constructeur prenant en parametres les 3 attributs.
     * 
     * @param idAliments
     * @param nom
     * @param idPizza
     */
    public Aliments(Integer idAliments, String nom, int idPizza) {
        this.idAliments = idAliments;
        this.nom = nom;
        this.idPizza = idPizza;
    }

    /**
     * Constructeur ne prenant pas en paramétre l'id de l'aliments.
     * 
     * @param nom
     * @param idPizza
     */
    public Aliments(String nom, int idPizza) {
        this.nom = nom;
        this.idPizza = idPizza;
    }

    // getter et setter

    public int getIdPizza() {
        return idPizza;
    }

    public void setIdPizza(int idPizza) {
        this.idPizza = idPizza;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getId_aliments() {
        return idAliments;
    }

    public void setId_aliments(Integer idAliments) {
        this.idAliments = idAliments;
    }

    @Override
    public String toString() {
        return "[idAliments=" + idAliments + ", idPizza=" + idPizza + ", nom=" + nom + "]";
    }

}
