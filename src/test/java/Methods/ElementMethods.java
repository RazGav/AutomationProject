package Methods;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementMethods {
    public WebDriver driver;

    public ElementMethods (WebDriver driver){
        this.driver = driver;
    }

    public void waitElementVisible(WebElement element){
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(element));
    }

    public void clickElement(WebElement element){
        waitElementVisible(element);
        element.click();
    }

    public void scrollByPixel(Integer x, Integer y){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy("+x+","+y+")");
    }

    public void fillElement(WebElement element, String value){
        waitElementVisible(element);
        element.sendKeys(value);
    }

    public void validatePage(String value){
        String actualRegister = driver.getTitle();
        Assert.assertEquals(value, actualRegister);
    }

    public void validateElementMessage(WebElement element, String value){
        waitElementVisible(element);
        String actualError = element.getText();
        Assert.assertEquals("Mesajul de pe pagina nu este corect!", value, actualError);
    }

    public void selectByTextElement(WebElement element, String value){
        waitElementVisible(element);
        Select skillsSelect = new Select(element);
        skillsSelect.selectByVisibleText(value);
    }

    public void selectByValueElement(WebElement element, String value) {
        waitElementVisible(element);
        Select yearSelect = new Select(element);
        yearSelect.selectByValue(value);
    }


}

