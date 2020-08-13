package parrainage.scholaire.parametres.basededonnes;

import java.sql.Connection;
import java.sql.DriverManager;


public class Connexion {
	
    public static Connection ObtenirUneConnection() {
    String template = "jdbc:mysql://192.168.64.2/%s?useEncoding=true&characterEncoding=UTF-8&user=%s&password=%s";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(String.format(template, "Parrainage", "florient", "florient"));
            System.out.println("Connected succesfully");
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}




