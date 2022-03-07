package Tests;

import Base.Hooks;
import Pages.HomePage;
import org.junit.Test;

public class NotSureGenerateTest extends Hooks {

    public HomePage homePage;

    @Test
    public void testNotSureGenerateAnything() {
        homePage = new HomePage(getDriver());

        homePage.notSureGenerateAnything(inputData);
    }

    @Test
    public void testNotSureGeneratePaleo() {
        homePage = new HomePage(getDriver());

        homePage.notSureGeneratePaleo(inputData);
    }

    @Test
    public void testNotSureGenerateVegetarian() {
        homePage = new HomePage(getDriver());

        homePage.notSureGenerateVegetarian(inputData);
    }

    @Test
    public void testInvalidNotSureGenerate() {
        homePage = new HomePage(getDriver());

        homePage.invalidNotSureGenerate(inputData);
    }


}
