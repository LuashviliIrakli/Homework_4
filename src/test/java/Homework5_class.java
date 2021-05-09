import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class Homework5_class {
    @Test
    public void homework_5(){
        Configuration.browser = "chrome";
        System.setProperty("webdriver.chrome.driver", "files/chromedriver.exe");
        Configuration.startMaximized = true;
        Selenide.open("https://www.facebook.com/");
        $(byText("Create New Account")). click();
        $("._5dbb").$(byName("firstname")).setValue("Irakli").pressTab();
        $(byName("lastname")).setValue("Luashvili").pressTab();
        $(byName("reg_email__")).setValue("593767588").pressTab();
        $(byName("reg_passwd__")).setValue("Irakli_123456").click();
        $("#month").selectOptionByValue("5");
        $("#day").selectOptionByValue("18");
        $("#year").selectOptionByValue("1989");
        $("._8esa",2).selectRadio("-1");
        $("#custom_gender_container").$(byName("preferred_pronoun")).shouldBe(Condition.visible);
        $("._7-1q").$(byName("custom_gender")).shouldBe(Condition.visible);
        $(".large_form").$(byName("preferred_pronoun")).selectOptionByValue("6");
        $("._8esa",1).selectRadio("2");
        $("#custom_gender_container").$(byName("preferred_pronoun")).shouldNotBe(Condition.visible);
        $("._7-1q").$(byName("custom_gender")).shouldNotBe(Condition.visible);

        sleep(3000);


    }
}
