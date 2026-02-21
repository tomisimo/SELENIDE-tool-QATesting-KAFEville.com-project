import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LanguagesDropdownHandlePage {
    SelenideElement languageDropdownOptionEN = $(By.xpath("//*[@id=\"comp-kl7gyyxf\"]/div/div/div[1]/div[1]"));
    SelenideElement languageDropdownOptionVI = $(By.xpath("//*[@id=\"comp-kl7gyyxf-dropdown-option-1\"]/div"));
    SelenideElement vietnameseLanguageHome = $(By.id("comp-kl7gppk50label"));
    SelenideElement vietnameseLanguageAboutus = $(By.id("comp-kl7gppk51label"));
    SelenideElement vietnameseLanguageOurBrothers = $(By.id("comp-kl7gppk53label"));
    SelenideElement langDropdownOptVI = $(By.xpath("//*[@id=\"comp-kl7gyyxf\"]/div/div/div[1]/div[1]"));
    SelenideElement langDropdownOptEN = $(By.xpath("//*[@id=\"comp-kl7gyyxf-dropdown-option-1\"]/div"));
    SelenideElement englishLangHome = $(By.id("comp-kl7gppk50label"));
    SelenideElement englishLangAboutus = $(By.id("comp-kl7gppk51label"));
    SelenideElement englishLangOurBrothers = $(By.id("comp-kl7gppk53label"));

    public void clickLanguageDropdownOptionEN(){
        languageDropdownOptionEN.shouldHave(exactText("EN"));
        languageDropdownOptionEN.click();
    }
    public void clickLanguageDropdownOptionVI(){
        languageDropdownOptionVI.shouldHave(exactText("VI"));
        languageDropdownOptionVI.click();
    }
    public void validateHomeDisplayedInVietnameseLanguage(){
        vietnameseLanguageHome.shouldHave(text("Trang Chủ"));
    }
    public void validateAboutusDisplayedInVietnameseLanguage(){
        vietnameseLanguageAboutus.shouldHave(text("Về Kafeville"));
    }
    public void validateOurBrothersDisplayedInVietnameseLanguage(){
        vietnameseLanguageOurBrothers.shouldHave(text("Anh em Kafeville"));
    }
    public void clickLangDropdownOptVI(){
        langDropdownOptVI.shouldHave(exactText("VI"));
        langDropdownOptVI.click();
    }
    public void clickLangDropdownOptEN(){
        langDropdownOptEN.shouldHave(exactText("EN"));
        langDropdownOptEN.click();
    }
    public void validateHomeDisplayedInEnglishLanguage(){
        englishLangHome.shouldHave(text("Home"));
    }
    public void validateAboutusDisplayedInEnglishLanguage(){
        englishLangAboutus.shouldHave(text("About us"));
    }
    public void validateOurBrothersDisplayedInEnglishLanguage() {
        englishLangOurBrothers.shouldHave(text("Our Brothers"));
    }
}
