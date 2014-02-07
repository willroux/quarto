package models;

public class Plateau {

	private int taille;
	private Case[][] grille;
	private boolean plein;


	public Plateau() {
		taille = 4;
		grille = new Case[taille][taille];
		//plein = false;
		init();
	}

	/**
	 *	Initialise le Plateau (cases vides)
	 */
	public void init(){
		for(int i=0; i<taille; ++i) {
			for(int j=0; j<taille; ++j) {
				grille[i][j] = new Case();
			}
		}
	}

	/**
	 *	Permet une écriture du type : p.getGrille()[2][3];
	 */
	public Case[][] getGrille() {
		return grille;
	}

	/**
	 * 	Permet une écriture du type : p.getGrille(2,3);
	 */
	public Case getGrille(int x, int y){
		return grille[x][y];
	}

	public int getTaille() {
		return taille;
	}


	public boolean isPlein() {
		
	}

	public void setPlein(boolean plein) {
		
	}

}