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
	private boolean rond;		// true : rond, false : carré
	private boolean noir;		// true : noir, false : blanc
	private boolean grand;		// true : grand, false : petit

	public Pion(boolean p, boolean r, boolean n, boolean g){
		plein = p;
		rond = r;
		noir = n;
		grand = g;
	}

	
}