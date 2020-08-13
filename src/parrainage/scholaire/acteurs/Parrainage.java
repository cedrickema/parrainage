package parrainage.scholaire.acteurs;

public class Parrainage {

	private int identifiantFieule;
	private int identifiantParrain;

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

	public Parrainage(int identifiantFieule, int identifiantParrain) {
		this.identifiantFieule = identifiantFieule;
		this.identifiantParrain = identifiantParrain;
	}

}
