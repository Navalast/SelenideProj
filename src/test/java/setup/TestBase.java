package setup;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Step;
import io.qameta.allure.listener.TestLifecycleListener;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class TestBase implements TestLifecycleListener {

    @Step("Настройка окружения")
    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
//        Configuration.browserSize = "1920x1080";
        Configuration.headless = true;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        Configuration.baseUrl = "https://www.saucedemo.com/";

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--headless");

        Configuration.browserCapabilities = options;
    }

    @Step("Закрыть браузер")
    @AfterTest
    public void tearDown() {
        WebDriverRunner.closeWebDriver();
    }
}