package co.com.leidycompany.qa.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    //Login class="instructions"
    public static final Target TXT_USERNAME =
            Target.the("Username").located(By.id("username"));
    public static final Target TXT_PASSWORD_LOGIN =
            Target.the("Password").located(By.id("password"));
    public static final Target BTN_SIGN_IN = Target.the("Sign In").
            located(By.id("kc-login"));
}
