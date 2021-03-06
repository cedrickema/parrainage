package parrainage.scholaire.parametres.gestion.acteurs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import parrainage.scholaire.acteurs.Etudiant;
import parrainage.scholaire.parametres.basededonnes.Connexion;

public class ManageurEtudiant {

	private Connection baseDeDonnees;

	public ManageurEtudiant() {
		this.baseDeDonnees = Connexion.ObtenirUneConnection();
	}

	public void enregistrer(Etudiant etudiant) {
		String requeteEnregistrementEtudiant = "insert into ETUDIANT(nom,prenom,matricule,sexe,niveau,filiere) values ('"
				+ etudiant.getNom() + "','" + etudiant.getPrenom() + "'," + etudiant.getMatricule() + ",'"
				+ etudiant.getSexe() + "'," + etudiant.getNiveau() + ",'" + etudiant.getFiliere() + "')";

		try {
			PreparedStatement requeteApprete = baseDeDonnees.prepareStatement(requeteEnregistrementEtudiant);
			requeteApprete.execute();
			System.out.println("etudiant enregistre");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Etudiant> ObtenirLaListDetudiant() {

		List<Etudiant> listeDesEtudiants = new ArrayList<>();

		String requeteObtentionListeEtudiant = "select * from ETUDIANT";

		try {
			PreparedStatement requeteApprete = baseDeDonnees.prepareStatement(requeteObtentionListeEtudiant);
			ResultSet resultat = requeteApprete.executeQuery();
			while (resultat.next()) {
				Etudiant etudiant = new Etudiant();
				etudiant.setIdentifiant(resultat.getInt("IDENTIFIANT"));
				etudiant.setNom(resultat.getString("NOM"));
				etudiant.setPrenom(resultat.getString("PRENOM"));
				etudiant.setPrenom(resultat.getString("PRENOM"));
				etudiant.setMatricule(resultat.getInt("MATRICULE"));
				etudiant.setSexe(resultat.getString("SEXE"));
				etudiant.setNiveau(resultat.getInt("NIVEAU"));
				etudiant.setFiliere(resultat.getString("FILIERE"));
				listeDesEtudiants.add(etudiant);
			}
			System.out.println("liste retiree");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return listeDesEtudiants;
	}
	
	public List<String> listEtudiantEnFonctionNiveauEtFiliere(int niveau, String filiere) {

		List<String> listeDesEtudiants = new ArrayList<>();

		String requeteObtentionListeEtudiant = "select * from ETUDIANT where niveau = "+niveau+" and filiere = '"+filiere+"'";

		try {
			PreparedStatement requeteApprete = baseDeDonnees.prepareStatement(requeteObtentionListeEtudiant);
			ResultSet resultat = requeteApprete.executeQuery();
			while (resultat.next()) {
				String etudiant = resultat.getInt("IDENTIFIANT")+","+resultat.getString("NOM")+","+resultat.getString("PRENOM")+"\n";
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
		
		mgrEtudiant.enregistrer(appreterUnEtudiant());

		List<Etudiant> liste = mgrEtudiant.ObtenirLaListDetudiant();

		for (Etudiant etudiant : liste) {
			System.out.println(etudiant.getNom() + "," + etudiant.getPrenom());
		}
	}

	private static Etudiant appreterUnEtudiant() {
		Etudiant etudiant = new Etudiant();
		etudiant.setNom("Tchabat");
		etudiant.setPrenom("test");
		etudiant.setMatricule(1);
		etudiant.setSexe("M");
		etudiant.setNiveau(1);
		etudiant.setFiliere("TIC");
		
		return etudiant;
	}

}
