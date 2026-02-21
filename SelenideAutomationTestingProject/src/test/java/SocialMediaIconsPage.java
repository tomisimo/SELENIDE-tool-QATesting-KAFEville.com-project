import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class SocialMediaIconsPage {
    SelenideElement topGoogleMapsPinIcon = $(By.id("img_0_comp-kl7gppa43"));
    SelenideElement topFacebookfIcon = $(By.id("img_1_comp-kl7gppa43"));
    SelenideElement topInstagramIcon = $(By.id("img_2_comp-kl7gppa43"));
    SelenideElement bottomGoogleMapsPinIcon = $(By.id("img_0_comp-k316eoz71"));
    SelenideElement bottomFacebookfIcon = $(By.id("img_1_comp-k316eoz71"));
    SelenideElement bottomInstagramIcon = $(By.id("img_2_comp-k316eoz71"));

    public void validateTopGoogleMapsPinIconDisplayed() {
        topGoogleMapsPinIcon.shouldBe(visible);
    }

    public void clickTopGoogleMapsPinIcon() {
        topGoogleMapsPinIcon.click();
    }

    public void onClickTopGoogleMapsPinSwitchToOpenedGoogleMapsPage() {
        switchTo().window(1);
    }

    public void onClickTopGoogleMapsPinValidateGoogleMapsPageDisplayed() {
        String GoogleMapsPageTitle = WebDriverRunner.getWebDriver().getTitle();
        System.out.println("Google Maps page displayed and title is: " + GoogleMapsPageTitle);

    }

    public void validateTopFacebookfIconDisplayed() {
        topFacebookfIcon.shouldBe(visible);
    }

    public void clickTopFacebookfIcon() {
        topFacebookfIcon.click();
    }

    public void onClickTopFacebookfIconSwitchToOpenedFacebookPage() {
        switchTo().window(1);
    }

    public void onClickTopFacebookfIconValidateFacebookPageDisplayed() {
        String FacebookPageTitle = WebDriverRunner.getWebDriver().getTitle();
        System.out.println("Facebook page displayed and title is: " + FacebookPageTitle);

    }

    public void validateTopInstagramIconDisplayed() {
        topInstagramIcon.shouldBe(visible);
    }

    public void clickTopInstagramIcon() {
        topInstagramIcon.click();
    }

    public void onClickTopInstagramIconSwitchToOpenedInstagramPage() {
        switchTo().window(1);
    }

    public void onClickTopInstagramIconValidateInstagramPageDisplayed() {
        String InstagramPageTitle = WebDriverRunner.getWebDriver().getTitle();
        System.out.println("Instagram page displayed and title is: " + InstagramPageTitle);

    }

    public void validateBottomGoogleMapsPinIconDisplayed() {
        bottomGoogleMapsPinIcon.shouldBe(visible);
    }

    public void clickBottomGoogleMapsPinIcon() {
        bottomGoogleMapsPinIcon.click();
    }

    public void onClickBottomGoogleMapsPinIconSwitchToOpenedGoogleMapsPage() {
        switchTo().window(1);
    }

    public void onClickBottomGoogleMapsPinIconValidateGoogleMapsPageDisplayed() {
        String GoogleMapsPgTitle = WebDriverRunner.getWebDriver().getTitle();
        System.out.println("Google Maps page displayed and title is: " + GoogleMapsPgTitle);

    }

    public void validateBottomFacebookfIconDisplayed() {
        bottomFacebookfIcon.shouldBe(visible);
    }

    public void clickBottomFacebookfIcon() {
        bottomFacebookfIcon.click();
    }

    public void onClickBottomFacebookfIconSwitchToOpenedFacebookPage() {
        switchTo().window(1);
    }

    public void onClickBottomFacebookfIconValidateFacebookPageDisplayed() {
        String FacebookPgTitle = WebDriverRunner.getWebDriver().getTitle();
        System.out.println("Facebook page displayed and title is: " + FacebookPgTitle);

    }

    public void validateBottomInstagramIconDisplayed() {
        bottomInstagramIcon.shouldBe(visible);
    }

    public void clickBottomInstagramIcon() {
        bottomInstagramIcon.click();
    }

    public void onClickBottomInstagramIconSwitchToOpenedInstagramPage() {
        switchTo().window(1);
    }

    public void onClickBottomInstagramIconValidateInstagramPageDisplayed() {
        String InstagramPgTitle = WebDriverRunner.getWebDriver().getTitle();
        System.out.println("Instagram page displayed and title is: " + InstagramPgTitle);
    }
}
