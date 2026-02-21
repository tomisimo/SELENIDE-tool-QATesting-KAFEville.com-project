import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

public class HorizontalNavBarItemsPageTest {
    HorizontalNavBarItemsPage navBaritems = new HorizontalNavBarItemsPage();

    @Test
    public void ValidateOnClickHorizontalNavBarHomeItemNavigateToHomepage(){
        Selenide.open("https://www.kafeville.com/");
        navBaritems.clickAboutUsNavBarItem();
        navBaritems.validateAboutUsPageDisplayed();
        navBaritems.clickHomeNavBarItem();
        navBaritems.validateHomePageDisplayed();
        Selenide.closeWebDriver();
    }
    @Test
    public void ValidateOnClickHorizontalNavBarAboutusItemNavigateToAboutusPage(){
        Selenide.open("https://www.kafeville.com/");
        navBaritems.clickAboutUsNavBarItem();
        navBaritems.validateAboutUsPageDisplayed();
        navBaritems.clickKAFEvilleTopLogo();
        Selenide.closeWebDriver();

    }
    @Test
    public void ValidateOnClickHorizontalNavBarOurTeamItemNavigateToOurTeamPage(){
        Selenide.open("https://www.kafeville.com/");
        navBaritems.clickOurTeamNavBarItem();
        navBaritems.validateOurTeamPageDisplayed();
        navBaritems.clickKAFEvilleTopLogo();
        Selenide.closeWebDriver();

    }
    @Test
    public void ValidateOnClickHorizontalNavBarOurBrothersItemNavigateToOurBrothersPage(){
        Selenide.open("https://www.kafeville.com/");
        navBaritems.clickOurBrothersNavBarItem();
        navBaritems.validateOurBrothersPageDisplayed();
        navBaritems.clickKAFEvilleTopLogo();
        Selenide.closeWebDriver();

    }
    @Test
    public void ValidateOnClickHorizontalNavBarMenuItemNavigateToMenuPage(){
        Selenide.open("https://www.kafeville.com/");
        navBaritems.clickMenuNavBarItem();
        navBaritems.validateMenuPageDisplayed();
        navBaritems.clickKAFEvilleTopLogo();
        Selenide.closeWebDriver();

    }
    @Test
    public void ValidateOnClickHorizontalNavBarBlogItemNavigateToBlogPage(){
        Selenide.open("https://www.kafeville.com/");
        navBaritems.clickBlogNavBarItem();
        navBaritems.validateBlogPageDisplayed();
        navBaritems.clickKAFEvilleTopLogo();
        Selenide.closeWebDriver();

    }
    @Test
    public void ValidateOnClickHorizontalNavBarShopItemNavigateToShopPage(){
        Selenide.open("https://www.kafeville.com/");
        navBaritems.clickShopNavBarItem();
        navBaritems.validateShopPageDisplayed();
        navBaritems.clickKAFEvilleTopLogo();
        Selenide.closeWebDriver();

    }
}
