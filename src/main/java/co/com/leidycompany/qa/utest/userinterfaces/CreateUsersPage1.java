package co.com.leidycompany.qa.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateUsersPage1 {
//Tell us about yourself "//a[@class= 'sub-title']"
    public static final Target TXT_FIRST_NAME =
            Target.the("First Name").located(By.id("firstName"));
    public static final Target TXT_LAST_NAME =
            Target.the("Last Name").located(By.id("lastName"));
    public static final Target TXT_EMAIL =
            Target.the("Email").located(By.id("email"));
    public static final Target LST_BIRTH_MONTH =
            Target.the("Birth Month").located(By.id("birthMonth"));
    public static final Target LST_BIRTH_DAY =
            Target.the("Birth Day").located(By.id("birthDay"));
    public static final Target LST_BIRTH_YEAR =
            Target.the("Birth Year").located(By.id("birthYear"));
    public static final Target BTN_NEXT_LOCATION =
            Target.the("Next Location Button").
                    located(By.xpath("//a[@class= 'btn btn-blue']"));
}
