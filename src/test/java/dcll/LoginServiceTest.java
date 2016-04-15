package dcll;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Mayeul Grivet-Roux on 4/15/2016.
 */
public class LoginServiceTest {

    String[] loginsTest = {"MGRI", "JDUL", "RGAR", "JBIL"};
    LoginService monServiceTest = new LoginService(loginsTest);

    @Test
    public void testLoginExists() throws Exception {
        //Test un login existe
        Assert.assertEquals(true, monServiceTest.loginExists("MGRI"));

        //Test un login n'existe pas
        Assert.assertEquals(false, monServiceTest.loginExists("MMIK"));
    }

    @Test
    public void testAddLogin() throws Exception {
        //Test ajout login
        monServiceTest.addLogin("GABI");
        Assert.assertEquals(true, monServiceTest.loginExists("GABI"));
    }

    @Test
    public void testFindAllLoginsStartingWith() throws Exception {
        //Test recherche logins commencant par la lettre "J"
        String[] resultatAttendu = {"JDUL", "JBIL"};
        Assert.assertEquals(true, monServiceTest.findAllLoginsStartingWith("J").equals(Arrays.asList(resultatAttendu)));
    }

}