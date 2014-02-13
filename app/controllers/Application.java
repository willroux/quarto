package controllers;


import play.mvc.*;
import play.data.*;
import views.html.*;
import models.*;

public class Application extends Controller {

	final static Jeu jeu = new Jeu();
	public static Pion pionaposer;
	
    public static Result index() {
        return ok(index.render());
    }

    public static Result choixcase(Long pion) {
    	pionaposer = jeu.getPlateau().getSac(pion.intValue());
        return ok(choixcase.render(jeu,pion));
    }

    public static Result afficherPion(Long casepion) {
    	if (casepion!=-1){
    		poserPion(pionaposer,casepion.intValue());
    	}
    	return ok(pion.render(jeu));
    }

    public static void poserPion(Pion p, int casepion){
		
		int cx=casepion/10;
		int cy=casepion%10;
		
		jeu.getPlateau().getGrille()[cx-1][cy-1].setPion(p);
		//alignee(cx-1,cy-1);

	}


	public void choixPion() {

	}

	public void choixCase() {
		
	}

	public void jouerUnTour() {
		/*
		Doit contenir :
			- Changement du joueur courant
			- Le joueur non courant choisit un pion
			- Le joueur courant choisit où il place le pion
			- Fin du tour
		*/

		// Changement du joueur courant :
			jeu.changeJoueurCourant();

		// Le joueur non courant choisit un pion :
			choixPion();

		// Le joueur courant choisit où il place le pion :
			choixCase();

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
