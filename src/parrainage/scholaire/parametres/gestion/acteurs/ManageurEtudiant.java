package parrainage.scholaire.parametres.gestion.acteurs;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import parrainage.scholaire.acteurs.Etudiant;
import parrainage.scholaire.parametres.basededonnes.Connexion;

public class ManageurEtudiant {

	private Connection baseDeDonnees;

	public ManageurEtudiant() {
		this.baseDeDonnees = Connexion.ObtenirUneConnection();
	}

	public void enregistrer(Etudiant etudiant) {

		String requeteEnregistrementEtudiant = "insert into etudiant(nom,prenom) values ('" + etudiant.getNom() + "','"
				+ etudiant.getPrenom() + "')";

		try {
			PreparedStatement requeteApprete = baseDeDonnees.prepareStatement(requeteEnregistrementEtudiant);
			requeteApprete.execute();
			System.out.println("etudiant enregistre");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Etudiant> ObtenirLaListDetudiant(){
		
		List<Etudiant> listeDesEtudiants = new ArrayList<>();
		
		String requeteObtentionListeEtudiant = "select * from etudiant";
		
		try {
			PreparedStatement requeteApprete = baseDeDonnees.prepareStatement(requeteObtentionListeEtudiant);
			ResultSet resultat = requeteApprete.executeQuery();
			while(resultat.next()) {
				Etudiant etudiant = new Etudiant(resultat.getString("NOM"), resultat.getString("PRENOM"));
				listeDesEtudiants.add(etudiant);
			}
			System.out.println("liste retiree");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listeDesEtudiants;
	}
	
	public static void main(String args[]) {
		ManageurEtudiant mgrEtudiant = new ManageurEtudiant();

		mgrEtudiant.enregistrer(new Etudiant("Tchoko", "Andress"));
		
	    List<Etudiant> liste = mgrEtudiant.ObtenirLaListDetudiant();
	    
	    for(Etudiant etudiant:liste) {
	    	System.out.println(etudiant.getNom()+","+etudiant.getPrenom());
	    }
	}

}
