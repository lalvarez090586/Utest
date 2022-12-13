package co.com.leidycompany.qa.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateUsersPage3 {
    //Step 3: Tell us about your devices "//a[@class= 'sub-title']"
    public static final Target BTN_NEXT_LAST_STEP =
            Target.the("Next Last Step Button").located(By.xpath("//a[@class= 'btn btn-blue pull-right']"));

}
