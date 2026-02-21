import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ContactFormPage {
    SelenideElement firstNameInputField = $(By.id("input_comp-kl6whwp8"));
    SelenideElement lastNameInputField = $(By.id("input_comp-kl6whwpi"));
    SelenideElement emailInputField = $(By.id("input_comp-kl6whwpq"));
    SelenideElement shareYourFeelingTextarea = $(By.id("textarea_comp-kl6whwpx"));

    public void validateFirstNameInputFieldDisplayed() {
        firstNameInputField.shouldBe(visible);
    }

    public void validateLastNameInputFieldDisplayed() {
        lastNameInputField.shouldBe(visible);
    }

    public void validateEmailInputFieldDisplayed() {
        emailInputField.shouldBe(visible);
    }

    public void validateShareYourFeelingTextareaDisplayed() {
        shareYourFeelingTextarea.shouldBe(visible);
    }

    public void validateFirstNameInputFieldHaveFirstNamePlaceholderText() {
        firstNameInputField.shouldHave(attribute("placeholder", "First Name"));
        System.out.println("displayed placeholder text: First Name");
    }

    public void validateLastNameInputFieldHaveLastNamePlaceholderText() {
        lastNameInputField.shouldHave(attribute("placeholder", "Last Name"));
        System.out.println("displayed placeholder text: Last Name");
    }

    public void validateEmailInputFieldHaveEmailPlaceholderText() {
        emailInputField.shouldHave(attribute("placeholder", "Email"));
        System.out.println("displayed placeholder text: Email");
    }

    public void validateShareYourFeelingTextareaHaveShareYourFeelingPlaceholderText() {
        shareYourFeelingTextarea.shouldHave(attribute("placeholder", "Share your feeling"));
        System.out.println("displayed placeholder text: Share your feeling");
    }
}
