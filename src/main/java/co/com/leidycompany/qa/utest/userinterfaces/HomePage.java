package co.com.leidycompany.qa.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target BTN_JOIN =
            Target.the("Join Button").
                    located(By.xpath("//a[@class= 'unauthenticated-nav-bar__sign-up']"));
    public static final Target BTN_LOGIN =
            Target.the("Login Button").
                    located(By.xpath("//a[@]class = 'unauthenticated-nav-bar__link'"));

}
