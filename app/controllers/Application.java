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

}
