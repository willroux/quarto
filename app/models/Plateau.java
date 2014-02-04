package models;

public class Plateau {

	private int taille;
	private Case[][] grille;
	//private boolean plein;


	public Plateau() {
		taille = 4;
		grille = new Case[taille][taille];
		//plein = false;
		init();
	}

	

}