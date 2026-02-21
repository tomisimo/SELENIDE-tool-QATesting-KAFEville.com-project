import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HorizontalNavBarItemsPage {
    SelenideElement AboutUsItem = $(By.id("comp-kl7gppk51label"));
    SelenideElement HomeItem = $(By.id("comp-kl7gppk50label"));
    SelenideElement OurTeamItem = $(By.id("comp-kl7gppk52label"));
    SelenideElement OurBrothersItem = $(By.id("comp-kl7gppk53label"));
    SelenideElement MenuItem = $(By.id("comp-kl7gppk54label"));
    SelenideElement BlogItem = $(By.id("comp-kl7gppk55label"));
    SelenideElement ShopItem = $(By.id("comp-kl7gppk56label"));
    SelenideElement KAFEvilleTopLogo = $(By.id("img_comp-kl7gp3po2"));

    public void clickKAFEvilleTopLogo(){
        KAFEvilleTopLogo.click();
    }
    public void clickAboutUsNavBarItem(){
        AboutUsItem.click();
    }
    public void validateAboutUsPageDisplayed(){
        String aboutUsPageTitle = WebDriverRunner.getWebDriver().getTitle();
        if (aboutUsPageTitle.equals("About us | Kafeville")){
            System.out.println("About us page displayed and title is: "+aboutUsPageTitle);
        }
    }
    public void clickHomeNavBarItem(){
        HomeItem.click();
    }
    public void validateHomePageDisplayed(){
        String HomePageTitle = WebDriverRunner.getWebDriver().getTitle();
        if (HomePageTitle.equals("Home | Kafeville")){
            System.out.println("Home page displayed and title is: "+HomePageTitle);
        }
    }
    public void clickOurTeamNavBarItem(){
        OurTeamItem.click();
    }
    public void validateOurTeamPageDisplayed(){
        String OurTeamPageTitle = WebDriverRunner.getWebDriver().getTitle();
        if (OurTeamPageTitle.equals("Our Team | Kafeville")){
            System.out.println("Our Team page displayed and title is: "+OurTeamPageTitle);
        }
    }
    public void clickOurBrothersNavBarItem(){
        OurBrothersItem.click();
    }
    public void validateOurBrothersPageDisplayed(){
        String OurBrothersPageTitle = WebDriverRunner.getWebDriver().getTitle();
        if (OurBrothersPageTitle.equals("Our Brothers and Sisters | Kafeville")){
            System.out.println("Our Brothers page displayed and title is: "+OurBrothersPageTitle);
        }
    }
    public void clickMenuNavBarItem(){
        MenuItem.click();
    }
    public void validateMenuPageDisplayed(){
        String MenuPageTitle = WebDriverRunner.getWebDriver().getTitle();
        if (MenuPageTitle.equals("Our menu | Kafeville")){
            System.out.println("Menu page displayed and title is: "+MenuPageTitle);
        }
    }
    public void clickBlogNavBarItem(){
        BlogItem.click();
    }
    public void validateBlogPageDisplayed(){
        String BlogPageTitle = WebDriverRunner.getWebDriver().getTitle();
        if (BlogPageTitle.equals("Blog | Kafeville")){
            System.out.println("Blog page displayed and title is: "+BlogPageTitle);
        }
    }
    public void clickShopNavBarItem(){
        ShopItem.click();
    }
    public void validateShopPageDisplayed(){
        String ShopPageTitle = WebDriverRunner.getWebDriver().getTitle();
        if (ShopPageTitle.equals("Shop | Kafeville")){
            System.out.println("Shop page displayed and title is: "+ShopPageTitle);
        }
    }
}
