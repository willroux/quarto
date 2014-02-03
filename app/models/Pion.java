package models;

public class Pion {
	/*
	public enum _forme{carre,rond};
	public enum _couleur{blanche,noir};
	public enum _taille{grand,petit};
	*/

	/**
	 * disponible est le seul membre modifiable
	 * les autres sont initialisées et leurs caractéristiques
	 * ne pourront être changées. 
	 */

	private boolean disponible=true;
	private boolean plein; 		// true : plein, false : creux
	private boolean forme;		// true : rond, false : carré
	private boolean couleur;	// true : noir, false : blanc
	private boolean taille;		// true : grand, false : petit

	public Pion(boolean p, boolean f, boolean c, boolean t){
		plein = p;
		forme = f;
		couleur = c;
		taille = t;
	}

}