import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LogoPage {
    SelenideElement AboutUsNavBarItem = $(By.id("comp-kl7gppk51label"));
    SelenideElement KAFEvilleTopLogo = $(By.id("img_comp-kl7gp3po2"));

    public void clickAboutUsNavBarItem(){
        AboutUsNavBarItem.click();
    }
    public void getAboutUsPageTitle(){
        String aboutUsPageTitle = WebDriverRunner.getWebDriver().getTitle();
        System.out.println("About us page title is: "+aboutUsPageTitle);
    }
    public void clickKAFEvilleTopLogo(){
        KAFEvilleTopLogo.click();
    }
    public void getHomepageTitle(){
        String homepageTitle = WebDriverRunner.getWebDriver().getTitle();
        System.out.println("Homepage title is: "+homepageTitle);
    }
}
