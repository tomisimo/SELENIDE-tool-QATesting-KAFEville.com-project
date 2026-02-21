import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

public class SocialMediaIconsPageTest {
    SocialMediaIconsPage socialMediaIcons = new SocialMediaIconsPage();

    @Test
    public void ValidateGoogleMapsPinIconFacebookfIconInstagramIconAreDisplayedOnTopRightCornerOnTheWebsiteHomepage(){
        Selenide.open("https://www.kafeville.com/");
        socialMediaIcons.validateTopGoogleMapsPinIconDisplayed();
        socialMediaIcons.validateTopFacebookfIconDisplayed();
        socialMediaIcons.validateTopInstagramIconDisplayed();
        Selenide.closeWebDriver();
    }
    @Test
    public void ValidateGoogleMapsPinIconFacebookfIconInstagramIconAreDisplayedOnBottomRightCornerOnTheWebsiteHomepage(){
        Selenide.open("https://www.kafeville.com/");
        socialMediaIcons.validateBottomGoogleMapsPinIconDisplayed();
        socialMediaIcons.validateBottomFacebookfIconDisplayed();
        socialMediaIcons.validateBottomInstagramIconDisplayed();
        Selenide.closeWebDriver();

    }
    @Test
    public void ValidateTopRightGoogleMapsPinIconOnClickOpenInNewTabTheKafevilleGoogleMapsPage(){
        Selenide.open("https://www.kafeville.com/");
        socialMediaIcons.clickTopGoogleMapsPinIcon();
        socialMediaIcons.onClickTopGoogleMapsPinSwitchToOpenedGoogleMapsPage();
        socialMediaIcons.onClickTopGoogleMapsPinValidateGoogleMapsPageDisplayed();
        Selenide.closeWebDriver();

    }
    @Test
    public void ValidateTopRightFacebookfIconOnClickOpenInNewTabTheKafevilleFacebookPage(){
        Selenide.open("https://www.kafeville.com/");
        socialMediaIcons.clickTopFacebookfIcon();
        socialMediaIcons.onClickTopFacebookfIconSwitchToOpenedFacebookPage();
        socialMediaIcons.onClickTopFacebookfIconValidateFacebookPageDisplayed();
        Selenide.closeWebDriver();

    }
    @Test
    public void ValidateTopRightInstagramIconOnClickOpenInNewTabTheKafevilleInstagramPage(){
        Selenide.open("https://www.kafeville.com/");
        socialMediaIcons.clickTopInstagramIcon();
        socialMediaIcons.onClickTopInstagramIconSwitchToOpenedInstagramPage();
        socialMediaIcons.onClickTopInstagramIconValidateInstagramPageDisplayed();
        Selenide.closeWebDriver();

    }
    @Test
    public void ValidateBottomRightGoogleMapsPinIconOnClickOpenInNewTabTheKafevilleGoogleMapsPage(){
        Selenide.open("https://www.kafeville.com/");
        socialMediaIcons.clickBottomGoogleMapsPinIcon();
        socialMediaIcons.onClickBottomGoogleMapsPinIconSwitchToOpenedGoogleMapsPage();
        socialMediaIcons.onClickBottomGoogleMapsPinIconValidateGoogleMapsPageDisplayed();
        Selenide.closeWebDriver();

    }
    @Test
    public void ValidateBottomRightFacebookfIconOnClickOpenInNewTabTheKafevilleFacebookPage(){
        Selenide.open("https://www.kafeville.com/");
        socialMediaIcons.clickBottomFacebookfIcon();
        socialMediaIcons.onClickBottomFacebookfIconSwitchToOpenedFacebookPage();
        socialMediaIcons.onClickBottomFacebookfIconValidateFacebookPageDisplayed();
        Selenide.closeWebDriver();

    }
    @Test
    public void ValidateBottomRightInstagramIconOnClickOpenInNewTabTheKafevilleInstagramPage(){
        Selenide.open("https://www.kafeville.com/");
        socialMediaIcons.clickBottomInstagramIcon();
        socialMediaIcons.onClickBottomInstagramIconSwitchToOpenedInstagramPage();
        socialMediaIcons.onClickBottomInstagramIconValidateInstagramPageDisplayed();
        Selenide.closeWebDriver();

    }
}
