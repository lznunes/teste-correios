package Base;

import HomePage.HomePage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class Base {
    private static WebDriver driver;
    protected static HomePage homePage;

    @BeforeAll
    public static void startHomePage(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nunesnel\\aula\\unissys\\teste-correios\\Driver\\chromedriver.exe");

        homePage = new HomePage(driver);
    }

    @BeforeEach
    public void loadHomePage(){
        homePage.loadHomePage();
    }

    @AfterAll
    public static void finishHomePage(){
        homePage.driver.quit();
    }

}
