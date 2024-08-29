package setup;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideDriver;
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
//        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
        Configuration.browserSize = "1920x1080";
        Configuration.headless = true;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        Configuration.baseUrl = "https://www.saucedemo.com/";

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");  // Запускает браузер в защищенном режиме
        options.addArguments("--disable-dev-shm-usage");  // Использует /tmp вместо /dev/shm
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-gpu");

        Configuration.browserCapabilities = options;
    }

    @Step("Закрыть браузер")
    @AfterTest
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}