
import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

public class ContactFormPageTest {
    ContactFormPage contactForm = new ContactFormPage();

    @Test
    public void ValidateFirstNameInputFieldPlaceholderTextIsDisplayed(){
        Selenide.open("https://www.kafeville.com/");
        contactForm.validateFirstNameInputFieldDisplayed();
        contactForm.validateFirstNameInputFieldHaveFirstNamePlaceholderText();
        Selenide.closeWebDriver();

    }
    @Test
    public void ValidateLastNameInputFieldPlaceholderTextIsDisplayed(){
        Selenide.open("https://www.kafeville.com/");
        contactForm.validateLastNameInputFieldDisplayed();
        contactForm.validateLastNameInputFieldHaveLastNamePlaceholderText();
        Selenide.closeWebDriver();

    }
    @Test
    public void ValidateEmailInputFieldPlaceholderTextIsDisplayed(){
        Selenide.open("https://www.kafeville.com/");
        contactForm.validateEmailInputFieldDisplayed();
        contactForm.validateEmailInputFieldHaveEmailPlaceholderText();
        Selenide.closeWebDriver();

    }
    @Test
    public void ValidateShareYourFeelingTextareaFieldPlaceholderTextIsDisplayed(){
        Selenide.open("https://www.kafeville.com/");
        contactForm.validateShareYourFeelingTextareaDisplayed();
        contactForm.validateShareYourFeelingTextareaHaveShareYourFeelingPlaceholderText();
        Selenide.closeWebDriver();

    }
}
