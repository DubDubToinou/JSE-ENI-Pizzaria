package fr.eni.pizzaria.dal;

import fr.eni.pizzaria.bo.Pizza;
import fr.eni.pizzaria.bo.Aliments;
import fr.eni.pizzaria.dal.jdbc.AlimentsDAOJdbcImpl;
import fr.eni.pizzaria.dal.jdbc.PizzaDAOJdbcImpl;


public class DAOFactory {

    public static DAO<Pizza> getPizzaDAO(){

        return new PizzaDAOJdbcImpl(); 
        
    }

    public static DAO<Aliments> getAlimentsDAO(){

         return new AlimentsDAOJdbcImpl();
    }

    
}
