package org.selenide.examples.appium;

import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;


public class CalculatorTest {

    @Before
    public void setUp() {
        Configuration.browser = AndroidDriverProvider.class.getName();
    }

    @Test
    public void testCalculator(){

        $(By.name("2")).click();
        $(By.name("+")).click();
        $(By.name("4")).click();
        $(By.name("=")).click();

        $(By.className("android.widget.EditText")).shouldHave(text("6"));
    }
}
