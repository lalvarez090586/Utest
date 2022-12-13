package co.com.leidycompany.qa.utest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.leidycompany.qa.utest.userinterfaces.HomePage.*;
import static co.com.leidycompany.qa.utest.userinterfaces.CreateUsersPage1.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.leidycompany.qa.utest.userinterfaces.CreateUsersPage2.*;
import static co.com.leidycompany.qa.utest.userinterfaces.CreateUsersPage3.*;
import static co.com.leidycompany.qa.utest.userinterfaces.CreateUsersPage4.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateUsers implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_JOIN, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(BTN_JOIN),
                WaitUntil.the(TXT_FIRST_NAME, isVisible()).forNoMoreThan(15).seconds(),
                Enter.theValue("Leidy").into(TXT_FIRST_NAME),
                Enter.theValue("Alvarez").into(TXT_LAST_NAME),
                Enter.theValue("leidyalvarez2@yopmail.com").into(TXT_EMAIL),
                SelectFromOptions.byIndex(2).from(LST_BIRTH_MONTH),
                SelectFromOptions.byIndex(3).from(LST_BIRTH_DAY),
                SelectFromOptions.byVisibleText("1987").from(LST_BIRTH_YEAR),
                Click.on(BTN_NEXT_LOCATION),
                Enter.theValue("Medellin Antioquia").into(TXT_CITY),
                Click.on(LST_CITY),
                Enter.theValue("050030").into(TXT_ZIP),
                Click.on(BTN_NEXT_DEVICES),
                WaitUntil.the(BTN_NEXT_LAST_STEP, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BTN_NEXT_LAST_STEP),
                WaitUntil.the(TXT_PASSWORD, isVisible()).forNoMoreThan(15).seconds(),
                Enter.theValue("Lalvarez.1").into(TXT_PASSWORD),
                Enter.theValue("Lalvarez.1").into(TXT_CONFIRM_PASSWORD),
                Click.on(CHK_STAY_INFORMED),
                Click.on(CHK_TERMS_USE),
                Click.on(CHK_PRIVACY),
                Click.on(BTN_COMPLETE)
        );
    }

    public static CreateUsers createUsers() {
        return instrumented(CreateUsers.class);

    }
}
