package parrainage.scholaire.parametres.gestion.acteurs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import parrainage.scholaire.acteurs.Parrainage;
import parrainage.scholaire.parametres.basededonnes.Connexion;

public class ManageurParrainage {

	private Connection baseDeDonnees;

	public ManageurParrainage() {
		baseDeDonnees = Connexion.ObtenirUneConnection();
	}

	public void etablirUnParrainage(Parrainage parrainage) {
		String requeteEnregistrementParrainage = "insert into PARRAINAGE(IDENTIFIANT_FIEULE,IDENTIFIANT_PARRAIN) values ("
				+ parrainage.getIdentifiantFieule() + "," + parrainage.getIdentifiantParrain() + ")";

		try {
			PreparedStatement requeteApprete = baseDeDonnees.prepareStatement(requeteEnregistrementParrainage);
			requeteApprete.execute();
			System.out.println("parrainage etablit");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String []args) {
		ManageurParrainage mp = new ManageurParrainage();
		mp.etablirUnParrainage(new Parrainage(1, 2));
	}

}
