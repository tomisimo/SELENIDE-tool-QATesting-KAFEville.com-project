import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

public class LogoPageTest {
    LogoPage logoPage = new LogoPage();

    @Test
    public void ValidateWhenKAFEvilleTopLogoClickedUserIsRedirectedOnHomepage() {
        Selenide.open("https://www.kafeville.com/");
        logoPage.clickAboutUsNavBarItem();
        logoPage.getAboutUsPageTitle();
        logoPage.clickKAFEvilleTopLogo();
        logoPage.getHomepageTitle();
        Selenide.closeWebDriver();
    }

}
