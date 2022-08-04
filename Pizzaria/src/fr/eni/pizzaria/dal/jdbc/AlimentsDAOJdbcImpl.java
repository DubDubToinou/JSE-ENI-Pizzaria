package fr.eni.pizzaria.dal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import fr.eni.pizzaria.bo.Aliments;
import fr.eni.pizzaria.dal.DALException;
import fr.eni.pizzaria.dal.DAO;

public class AlimentsDAOJdbcImpl implements DAO<Aliments>{

     public void insert(Aliments aliments){

         try {
            Connection con = JdbcTools.getConnection();
            PreparedStatement stmt = con.prepareStatement("INSERT INTO Aliments (nom,idPizza) VALUES (?,?)");


            stmt.setString(1, aliments.getNom());
            stmt.setInt(2, aliments.getIdPizza());

            stmt.executeUpdate();

            stmt.close();
            JdbcTools.closeConnection();

        
         } catch (SQLException ex) {
             ex.printStackTrace();
         }

     }

    @Override
    public List<Aliments> selectAll() throws DALException {
        return null;
    }
     
    
}
