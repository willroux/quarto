package models;

public class Plateau {

	private int taille;
	private Case[][] grille;
	private boolean plein;
	private Pion[] sac ;

	public Plateau() {
		taille = 4;
		grille = new Case[taille][taille];
		sac = new Pion[taille*taille];
		//plein = false;
		init();
		initSac();
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

	public void initSac(){

		
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
		//On set l'attribut plein à vrai
		plein = true;
		for(int j=0; j<taille; ++j) {
			for(int i=0; i<taille; ++i) {
				if(grille[i][j].isVide()) { //Dès qu'on rencontre une case vide
					plein = false; //On set l'attribut plein à faux
				}
			}
		}
		return plein;
	}

	public void setPlein(boolean plein) {
		this.plein = plein;
	}


	public Pion getSac(int i){
		
	}

}