package qa.guru.owner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import qa.guru.owner.config.WebDriverProvider;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest {

    private WebDriver driver;

    @BeforeEach
    public void startDriver(){
        driver = new WebDriverProvider().get();
    }
    @Test
    public void VTBbank(){
        //тело выполнения теста
        String title = driver.getTitle();
        assertEquals("Банк ВТБ (ПАО) — дебетовые и кредитные карты, ипотека, вклады, автокредиты," +
                " кредиты наличными и другие услуги для физических и юридических лиц по всей России", title);
    }
    @AfterEach
    public void stopDriver(){
        driver.quit();
    }
}
