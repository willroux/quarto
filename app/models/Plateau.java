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

		//plein rond noir grand
		sac[0] = new Pion(true,true,true,true);
		//plein rond noir petit
        sac[1] = new Pion(true,true,true,false);
        //plein rond blanc grand
        sac[2] = new Pion(true,true,false,true);
        //plein rond blanc petit
        sac[3] = new Pion(true,true,false,false);
        //plein carre noir grand
        sac[4] = new Pion(true,false,true,true);
        //plein carre noir petit
        sac[5] = new Pion(true,false,true,false);
        //plein carre blanc grand
        sac[6] = new Pion(true,false,false,true);
        //plein carre blanc petit
        sac[7] = new Pion(true,false,false,false);
        //creux rond noir grand
        sac[8] = new Pion(false,true,true,true);
        //creux rond noir petit
        sac[9] = new Pion(false,true,true,false);
        //creux rond blanc grand
        sac[10] = new Pion(false,true,false,true);
        //creux rond blanc petit
        sac[11] = new Pion(false,true,false,false);
        //creux carre noir grand
        sac[12] = new Pion(false,false,true,true);
        //creux carre noir petit
        sac[13] = new Pion(false,false,true,false);
        //creux carre blanc grand
        sac[14] = new Pion(false,false,false,true);
        //creux carre blanc petit
        sac[15] = new Pion(false,false,false,false);


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
		return sac[i];
	}

}