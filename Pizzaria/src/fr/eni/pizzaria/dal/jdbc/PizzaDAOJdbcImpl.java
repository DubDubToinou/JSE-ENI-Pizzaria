package fr.eni.pizzaria.dal.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.eni.pizzaria.bo.Aliments;
import fr.eni.pizzaria.bo.Pizza;
import fr.eni.pizzaria.dal.DAO;

public class PizzaDAOJdbcImpl implements DAO<Pizza> {

    public void insert(Pizza pizz) {

        try {

            Connection con = JdbcTools.getConnection();
            PreparedStatement stmt = con.prepareStatement("INSERT INTO Pizza (idPizza,nom,prix) VALUES (?,?,?)");

            stmt.setInt(1, pizz.getidPizza());
            stmt.setString(2, pizz.getNom());
            stmt.setDouble(3, pizz.getPrix());

            stmt.executeUpdate();

            stmt.close();
            JdbcTools.closeConnection();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public List<Pizza> selectAll() {

        List<Pizza> listeDesPizza = new ArrayList<Pizza>();

        Pizza pizz = null;
        Aliments aliment = null;
        Statement stmt;
        Statement stmt2;

        String sqlSelect = ("SELECT idPizza,nom,prix FROM Pizza");
        String sqlSelectAliments = ("SELECT idAliments,nom,idPizza FROM Aliments WHERE idPizza = ");

        try {

            Connection con = JdbcTools.getConnection();
            stmt = con.createStatement();
            stmt2 = con.createStatement();

            ResultSet rs = stmt.executeQuery(sqlSelect);

            while (rs.next()) {
                pizz = new Pizza(rs.getInt("idPizza"), rs.getString("nom"), rs.getFloat("prix"));

                listeDesPizza.add(pizz);

                ResultSet rsAliments = stmt2.executeQuery(sqlSelectAliments + pizz.getidPizza());
                
                while (rsAliments.next()) {
                    aliment = new Aliments(rsAliments.getInt("idAliments"), rsAliments.getString("nom"),
                            rsAliments.getInt("idPizza"));
                    pizz.addAliment(aliment);
                }

            }

            
            stmt.close();
            stmt2.close();
            JdbcTools.closeConnection();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return listeDesPizza;

    }

}
