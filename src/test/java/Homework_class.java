import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Homework_class {
@Test

    public void homework4() {
        {
            Configuration.browser = "chrome";
            System.setProperty("webdriver.chrome.driver", "files/chromedriver.exe");
            Configuration.startMaximized = true;
            Selenide.open("https://www.google.com/");
            $(".gLFyf").setValue("Irakli Luashvili").sendKeys(Keys.ENTER);
            sleep(5000);
        }
    }
}
