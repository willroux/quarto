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
		sac[0].setId(0);
		//plein rond noir petit
        sac[1] = new Pion(true,true,true,false);
        sac[1].setId(1);
        //plein rond blanc grand
        sac[2] = new Pion(true,true,false,true);
        sac[2].setId(2);
        //plein rond blanc petit
        sac[3] = new Pion(true,true,false,false);
        sac[3].setId(3);
        //plein carre noir grand
        sac[4] = new Pion(true,false,true,true);
        sac[4].setId(4);
        //plein carre noir petit
        sac[5] = new Pion(true,false,true,false);
        sac[5].setId(5);
        //plein carre blanc grand
        sac[6] = new Pion(true,false,false,true);
        sac[6].setId(6);
        //plein carre blanc petit
        sac[7] = new Pion(true,false,false,false);
        sac[7].setId(7);
        //creux rond noir grand
        sac[8] = new Pion(false,true,true,true);
        sac[8].setId(8);
        //creux rond noir petit
        sac[9] = new Pion(false,true,true,false);
        sac[9].setId(9);
        //creux rond blanc grand
        sac[10] = new Pion(false,true,false,true);
        sac[10].setId(10);
        //creux rond blanc petit
        sac[11] = new Pion(false,true,false,false);
        sac[11].setId(11);
        //creux carre noir grand
        sac[12] = new Pion(false,false,true,true);
        sac[12].setId(12);
        //creux carre noir petit
        sac[13] = new Pion(false,false,true,false);
        sac[13].setId(13);
        //creux carre blanc grand
        sac[14] = new Pion(false,false,false,true);
        sac[14].setId(14);
        //creux carre blanc petit
        sac[15] = new Pion(false,false,false,false);
        sac[15].setId(15);
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

	public Pion[] getSac(){
		return sac;
	}

	public int getTailleSac(){
		return taille*taille;
	}

}