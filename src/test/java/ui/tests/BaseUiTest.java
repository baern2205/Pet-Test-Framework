package ui.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseUiTest {

    protected WebDriver driver;

    @BeforeMethod(groups = {"hook"})
    @Parameters("browser")
    public void browserSetup(String browser) throws Exception {
        if (browser.equalsIgnoreCase("chrome")) {
            driver = WebDriverManager.chromedriver().create();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = WebDriverManager.edgedriver().create();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = WebDriverManager.firefoxdriver().create();
        } else if (browser.equalsIgnoreCase("safari")) {
            driver = WebDriverManager.safaridriver().create();
        } else if (browser.equalsIgnoreCase("opera")) {
            driver = WebDriverManager.operadriver().create();
        } else {
            throw new Exception("Unsupported browser");
        }
        driver.get("http://google.com");
    }

    @AfterMethod(groups = {"hook"})
    public void tearDown() {
        driver.quit();
    }
}
