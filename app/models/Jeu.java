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


	public Integer changeJoueurCourant() {
		if (joueurCourant == 1) {
			joueurCourant = 2;
		} else {
			joueurCourant = 1;
		}
		return joueurCourant;
	}

	
}