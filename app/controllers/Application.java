package controllers;


import play.mvc.*;
import play.data.*;
import views.html.*;
import models.*;

public class Application extends Controller {

	final static Jeu jeu = new Jeu(); 

    public static Result index() {
        return ok(index.render());
    }

    public static Result choixcase() {
        return ok(choixcase.render(jeu));
    }

    public static Result pion() {
        return ok(pion.render(jeu));
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
