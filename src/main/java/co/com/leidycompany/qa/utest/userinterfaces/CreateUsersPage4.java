package co.com.leidycompany.qa.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateUsersPage4 {
    //Step 4: The last step "//a[@class= 'sub-title']"
    public static final Target TXT_PASSWORD =
            Target.the("Password").located(By.id("password"));
    public static final Target TXT_CONFIRM_PASSWORD =
            Target.the("Confirm Password").located(By.id("confirmPassword"));
    public static final Target CHK_STAY_INFORMED = Target.the("Stay Informed").
            located(By.xpath("//label[@class= 'input-check-box signup-consent signup-consent--highlight']"));
    public static final Target CHK_TERMS_USE = Target.the("Accept Terms Use").
            located(By.xpath("(//label[@class= 'input-check-box signup-consent'])[1]"));
    public static final Target CHK_PRIVACY = Target.the("Accept Privacy").
                located(By.xpath("(//span[@class= 'checkmark signup-consent__checkbox'])[2]"));
    public static final Target BTN_COMPLETE = Target.the("Complete Setup").located(By.id("laddaBtn"));
//class="image-box-header" Welcome to the world's largest community of freelance software testers!
//class="welcome-lead" We are excited that you have found your way to uTest - home of the largest community of digital freelance software testers in the world!

}
