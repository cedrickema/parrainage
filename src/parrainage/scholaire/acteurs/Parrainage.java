package parrainage.scholaire.acteurs;

public class Parrainage {

	private int identifiantFieule;
	private int identifiantParrain;
	private String fieule;
	private String parrain;

	public int getIdentifiantFieule() {
		return identifiantFieule;
	}

	public void setIdentifiantFieule(int identifiantFieule) {
		this.identifiantFieule = identifiantFieule;
	}

	public int getIdentifiantParrain() {
		return identifiantParrain;
	}

	public void seIdentifiantParrain(int identifiantParrain) {
		this.identifiantParrain = identifiantParrain;
	}

	public Parrainage(int identifiantFieule,String fieule, int identifiantParrain, String parrain) {
		this.identifiantFieule = identifiantFieule;
		this.fieule = fieule;
		this.identifiantParrain = identifiantParrain;
		this.parrain = parrain;
	}

	public String getFieule() {
		return fieule;
	}

	public String getParrain() {
		return parrain;
	}

}
