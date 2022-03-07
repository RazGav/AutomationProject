package Pages;

import Methods.ElementMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;

public class RegisterPage {

    public WebDriver driver;
    public ElementMethods elementMethods;


    public RegisterPage(WebDriver driver){
        this.driver = driver;
        elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "svg[class='logo_svg_carrot']")
    private WebElement logoElement;
    @FindBy(css = "a[class='dropdown-item']")
    private WebElement backHomeElement;
    @FindBy(css = "a[href='/login/facebook/']")
    private WebElement loginFacebookElement;
    @FindBy(css = "a[href='/login/google-oauth2/']")
    private WebElement loginGoogleElement;
    @FindBy(css = "a[href='/login/apple-id/']")
    private WebElement loginAppleElement;
    @FindBy(id = "id_username")
    private WebElement usernameFieldElement;
    @FindBy(id = "id_email")
    private WebElement emailFieldElement;
    @FindBy(id = "id_password1")
    private WebElement passwordFieldElement;
    @FindBy(id = "id_password2")
    private WebElement rePasswordFieldElement;
    @FindBy(css = ".form-checkbox")
    private WebElement checkboxeTosElement;
    @FindBy(id = "id_drip_emails")
    private WebElement emailCheckboxElemente;
    @FindBy(css = "input[type='submit']")
    private WebElement createAccountButtonElement;
    @FindBy(css = "a[href='/user/login/']")
    private WebElement signInElement;
    @FindBy(xpath = "//li[contains(text(),'A user')]")
    private WebElement existingUserElement;
    @FindBy(xpath = "//li[contains(text(),'valid email')]")
    private WebElement invalidEmailElement;


    public void invalidUserCreateAccount(HashMap<String, String> values){
        elementMethods.fillElement(usernameFieldElement, values.get("existingUser"));
        elementMethods.fillElement(emailFieldElement, values.get("email"));
        elementMethods.fillElement(passwordFieldElement, values.get("password"));
        elementMethods.fillElement(rePasswordFieldElement, values.get("password"));
        elementMethods.clickElement(checkboxeTosElement.findElement(By.tagName("label")));
        elementMethods.clickElement(createAccountButtonElement);
        elementMethods.validateElementMessage(existingUserElement, values.get("existingUserError"));
    }

    public void invalidEmailCreateAccount(HashMap<String, String> values){
        elementMethods.fillElement(usernameFieldElement, values.get("user"));
        elementMethods.fillElement(emailFieldElement, values.get("invalidEmail"));
        elementMethods.fillElement(passwordFieldElement, values.get("password"));
        elementMethods.fillElement(rePasswordFieldElement, values.get("password"));
        elementMethods.clickElement(checkboxeTosElement.findElement(By.tagName("label")));
        elementMethods.clickElement(createAccountButtonElement);
        elementMethods.validateElementMessage(invalidEmailElement, values.get("invEmailError"));
    }

    public void invalidUnmatchCreateAccount(HashMap<String, String> values){
        elementMethods.fillElement(usernameFieldElement, values.get("user"));
        elementMethods.fillElement(emailFieldElement, values.get("email"));
        elementMethods.fillElement(passwordFieldElement, values.get("password"));
        elementMethods.fillElement(rePasswordFieldElement, values.get("unmatchPassword"));
        elementMethods.clickElement(checkboxeTosElement.findElement(By.tagName("label")));
        elementMethods.clickElement(createAccountButtonElement);
        elementMethods.validatePage(values.get("url"));
    }

}
