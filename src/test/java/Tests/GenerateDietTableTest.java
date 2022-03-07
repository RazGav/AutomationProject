package Tests;

import Base.Hooks;
import Pages.HomePage;
import org.junit.Test;

public class GenerateDietTableTest extends Hooks {

    public HomePage homePage;

    @Test
    public void testGenerateAnythingMeal() {
        homePage = new HomePage(getDriver());

        homePage.generateAnythingMeal(inputData);
    }

    @Test
    public void testGeneratePaleoMeal() {
        homePage = new HomePage(getDriver());

        homePage.generatePaleoMeal(inputData);
    }

    @Test
    public void testGenerateVegetarianMeal() {
        homePage = new HomePage(getDriver());

        homePage.generateVegetarianMeal(inputData);
    }

    @Test
    public void testGenerateVeganMeal() {
        homePage = new HomePage(getDriver());

        homePage.generateVeganMeal(inputData);
    }

    @Test
    public void testGenerateKetogenicMeal() {
        homePage = new HomePage(getDriver());

        homePage.generateKetogenicMeal(inputData);
    }

    @Test
    public void testGenerateMediterraneanMeal() {
        homePage = new HomePage(getDriver());

        homePage.generateMediterraneanMeal(inputData);
    }

}
