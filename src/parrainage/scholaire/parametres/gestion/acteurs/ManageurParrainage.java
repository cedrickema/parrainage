package parrainage.scholaire.parametres.gestion.acteurs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import parrainage.scholaire.acteurs.Parrainage;
import parrainage.scholaire.parametres.basededonnes.Connexion;

public class ManageurParrainage {

	private Connection baseDeDonnees;

	public ManageurParrainage() {
		baseDeDonnees = Connexion.ObtenirUneConnection();
	}

	public void etablirUnParrainage(Parrainage parrainage) {
		String requeteEnregistrementParrainage = "insert into PARRAINAGE(IDENTIFIANT_FIEULE, FIEULE,IDENTIFIANT_PARRAIN,PARRAIN) values ("
				+ parrainage.getIdentifiantFieule() + ",'"+parrainage.getFieule()+"'," + parrainage.getIdentifiantParrain() + ", '"+parrainage.getParrain()+"')";

		try {
			PreparedStatement requeteApprete = baseDeDonnees.prepareStatement(requeteEnregistrementParrainage);
			requeteApprete.execute();
			System.out.println("parrainage etablit");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Object [][] montrerLeTableauDeParrainage(){
		
	    List<String> names = new ArrayList<>();
		String requete = "Select FIEULE, PARRAIN FROM PARRAINAGE";
		
		PreparedStatement requeteApprete;
		try {
			requeteApprete = baseDeDonnees.prepareStatement(requete);
			ResultSet resultat = requeteApprete.executeQuery();
			while(resultat.next()) {
				names.add(resultat.getString("FIEULE")+":"+resultat.getString("PARRAIN"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		Object [][] objArray = new Object[names.size()][];

	    for(int i=0;i< names.size();i++){
	    	Object[] toarray = names.get(i).split(":");
	        objArray[i] = new Object[2];
	        objArray[i][0] = toarray[0];
	        objArray[i][1] = toarray[1];
	    } 

		return objArray;
	}
	
	public static void main(String []args) {
		ManageurParrainage mp = new ManageurParrainage();
		mp.etablirUnParrainage(new Parrainage(1,"fieule",2,"Parrain"));
	}

}
