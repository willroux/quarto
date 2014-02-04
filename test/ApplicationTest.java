import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.*;

import play.mvc.*;
import play.test.*;
import play.data.DynamicForm;
import play.data.validation.ValidationError;
import play.data.validation.Constraints.RequiredValidator;
import play.i18n.Lang;
import play.libs.F;
import play.libs.F.*;

import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;

import models.Pion;

/**
*
* Simple (JUnit) tests that can call all parts of a play app.
* If you are interested in mocking a whole application, see the wiki for more details.
*
*/
public class ApplicationTest {

    void assert_isPlein(boolean p, boolean r, boolean n, boolean g, boolean res) {
    	assertThat(new Pion(p, r, n, g).isPlein()).isEqualTo(res);
    }
    void assert_isRond(boolean p, boolean r, boolean n, boolean g, boolean res) {
    	assertThat(new Pion(p, r, n, g).isRond()).isEqualTo(res);
    }
    void assert_isNoir(boolean p, boolean r, boolean n, boolean g, boolean res) {
    	assertThat(new Pion(p, r, n, g).isNoir()).isEqualTo(res);
    }
    void assert_isGrand(boolean p, boolean r, boolean n, boolean g, boolean res) {
    	assertThat(new Pion(p, r, n, g).isGrand()).isEqualTo(res);
    }

    @Test
    public void testPion() {
        Pion p = new Pion(true, true, true, true);
    }

    @Test
    public void testGetters() {
    	assert_isPlein(false, true, true, true, false);
        assert_isRond(true, false, true, true, false);
        assert_isNoir(true, true, false, true, false);
        assert_isGrand(true, true, true, false, false);
    }




}
