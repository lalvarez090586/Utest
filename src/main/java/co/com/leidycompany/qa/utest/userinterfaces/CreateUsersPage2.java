package co.com.leidycompany.qa.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateUsersPage2 {
    //Step 2: Add your address "//a[@class= 'sub-title']"
    public static final Target TXT_CITY =
            Target.the("City").located(By.id("city"));
    public static final Target LST_CITY =
            Target.the("Values City").located(By.xpath("(//div[@class='pac-item'])[1]"));
    public static final Target TXT_ZIP =
            Target.the("Zip").located(By.id("zip"));
    public static final Target BTN_NEXT_DEVICES =
            Target.the("Next Devices Button").
                    located(By.xpath("//a[@class= 'btn btn-blue pull-right']"));

}
