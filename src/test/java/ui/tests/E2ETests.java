package ui.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class E2ETests extends BaseUiTest {

    @Test(groups = {"e2e"})
    public void inStockProductNoCheckoutTest() {
        driver.findElement(By.name("q")).sendKeys("Selenium" + Keys.ENTER);
        System.out.println("e2e test");
    }
}
