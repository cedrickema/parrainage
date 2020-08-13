package parrainage.scholaire.acteurs;

public class Etudiant {

	private int identifiant;
	private String nom;
	private String prenom;
	private int matricule;
	private String sexe;
	private int niveau;
	private String filiere;

	public Etudiant() {

	}

	public Etudiant(int identifiant, String nom, String prenom, int matricule, String sexe, int niveau, String filiere) {
		this.setIdentifiant(identifiant);
		this.nom = nom;
		this.prenom = prenom;
		this.matricule = matricule;
		this.sexe = sexe;
		this.niveau = niveau;
		this.filiere = filiere;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getMatricule() {
		return matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getFiliere() {
		return filiere;
	}

	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

}
