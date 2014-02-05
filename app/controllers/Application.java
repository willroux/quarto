package controllers;


import play.mvc.*;
import play.data.*;
import views.html.*;
import models.*;

public class Application extends Controller {

	final static Plateau plateau = new Plateau(); 

    public static Result index() {
        return ok(index.render(plateau));
    }

}
