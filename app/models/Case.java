package models;

public class Case {
	private boolean vide;
	private Pion pion;
	
	/**
	 * Initialise une case vide
	 */
	public Case() {
		vide = true;
		pion = null;
	}

	public boolean isVide() {
		return vide;
	}

	public Pion getPion() {
		return pion;
	}


	public void setVide(boolean vide) {
		this.vide = vide;
	}

	public void setPion(Pion pion) {
		this.pion = pion;
		setVide(false);
	}
}
	