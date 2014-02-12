package models;

public class Jeu {
	private Plateau plateau;
	private Integer joueurCourant;	// Alterne entre 1 et 2
	private boolean quarto;


	public Jeu() {
		plateau = new Plateau();
		joueurCourant = 1;
		quarto = false;
	}

	public Plateau getPlateau(){
		return plateau;
	}

	public Integer getJoueurCourant(){
		return joueurCourant;
	}

	public boolean getQuarto(){
		return quarto;
	}

	public boolean finPartie(){
		return ( plateau.isPlein() || quarto ) ;
	}

	public void jouerUnTour() {
		/*
		Doit contenir :
			- Changement du joueur courant
			- Le joueur non courant choisit un pion
			- Le joueur courant choisi où il place le pion
			- Fin du tour
		*/
	}

	public void jouerUnePartie() {
		/*
		Contiendra une boucle du genre :
			while( !finPartie() ) {
				jouerUnTour();
				mise_a_jour_de_la_variable_quarto();
			}
		*/
	}
}