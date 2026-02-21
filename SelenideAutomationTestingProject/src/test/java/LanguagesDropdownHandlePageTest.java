import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

public class LanguagesDropdownHandlePageTest {
    LanguagesDropdownHandlePage languageDropdown = new LanguagesDropdownHandlePage();

    @Test
    public void ValidateClickLanguageDropdownOptionENtheWebsiteNavigationLanguageChangeToEnglishLanguage(){
        Selenide.open("https://www.kafeville.com/");
        languageDropdown.clickLanguageDropdownOptionEN();
        languageDropdown.clickLanguageDropdownOptionVI();
        languageDropdown.validateHomeDisplayedInVietnameseLanguage();
        languageDropdown.validateAboutusDisplayedInVietnameseLanguage();
        languageDropdown.validateOurBrothersDisplayedInVietnameseLanguage();
        languageDropdown.clickLangDropdownOptVI();
        languageDropdown.clickLangDropdownOptEN();
        languageDropdown.validateHomeDisplayedInEnglishLanguage();
        languageDropdown.validateAboutusDisplayedInEnglishLanguage();
        languageDropdown.validateOurBrothersDisplayedInEnglishLanguage();
        Selenide.closeWebDriver();

    }
    @Test
    public void ValidateClickLanguageDropdownOptionVItheWebsiteNavigationLanguageChangeToVietnameseLanguage(){
        Selenide.open("https://www.kafeville.com/");
        languageDropdown.validateHomeDisplayedInEnglishLanguage();
        languageDropdown.validateAboutusDisplayedInEnglishLanguage();
        languageDropdown.validateOurBrothersDisplayedInEnglishLanguage();
        languageDropdown.clickLanguageDropdownOptionEN();
        languageDropdown.clickLanguageDropdownOptionVI();
        languageDropdown.validateHomeDisplayedInVietnameseLanguage();
        languageDropdown.validateAboutusDisplayedInVietnameseLanguage();
        languageDropdown.validateOurBrothersDisplayedInVietnameseLanguage();
        languageDropdown.clickLangDropdownOptVI();
        languageDropdown.clickLangDropdownOptEN();
        Selenide.closeWebDriver();


    }
}
