package Pages;

import Methods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.List;

public class HomePage {

    public WebDriver driver;
    public ElementMethods elementMethods;


    public HomePage(WebDriver driver){
        this.driver = driver;
        elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='navbar-brand']")
    private WebElement topLogoElement;
    @FindBy(xpath = "//li[@class='nav-item']/a[contains(text(),'How It Works')]")
    private WebElement topHowItWorksElement;
    @FindBy(xpath = "//li[@class='nav-item']/a[contains(text(),'Browse')]")
    private WebElement topBrowseFoodsElement;
    @FindBy(xpath = "//li[@class='nav-item']/a[contains(text(),'Supported Diets')]")
    private WebElement topSupportedDietsElement;
    @FindBy(xpath = "//li[@class='nav-item']/a[contains(text(),'For Professionals')]")
    private WebElement topForProfessionalsElement;
    @FindBy(xpath = "//a[contains(text(),'Sign Up')]")
    private WebElement topSignUpButtonElement;
    @FindBy(xpath = "//a[contains(text(),'Already a member')]")
    private WebElement topAlreadyAMemberElement;
    @FindBy(xpath = "//ul[@class='nav nav-pills preset_selector no-gutters text-center']/li")
    private List<WebElement> dietTableElements;
    @FindBy(id = "cal_input")
    private WebElement calcInputElement;
    @FindBy(id = "not_sure_button")
    private WebElement notSureButtonElement;
    @FindBy(id = "num_meals_selector")
    private WebElement mealSelectDropboxElement;
    @FindBy(xpath = "//button[contains(text(),'Generate')]")
    private WebElement generateButtonElement;
    @FindBy(xpath = "//img[@src='/static_files/images/washingtonpost_logo.png']")
    private WebElement washingtonPostElement;
    @FindBy(xpath = "//img[@src='/static_files/images/lifehacker_logo.png']")
    private WebElement lifehackerPostElement;
    @FindBy(xpath = "//a[contains(text(),'@samkonthemankon')]")
    private WebElement samKoElement;
    @FindBy(css = "a[title='Product designer']")
    private WebElement productDesignerElement;
    @FindBy(xpath = "//div[@class='col-12 offset-0 col-sm-10 offset-sm-1 big_top_spacer']//a[contains(text(),'Get started ')]")
    private WebElement getStartedFirstButtonElement;
    @FindBy(xpath = "//a[contains(text(),'trainers')]")
    private WebElement mealPlaningSoftElement;
    @FindBy(xpath = "//a[contains(text(),'here')]")
    private WebElement hereElement;
    @FindBy(xpath = "//iframe[@class='youtube_video lazy-youtube']")
    private WebElement youtubeVideoElement;
    @FindBy(xpath = "//a[contains(text(),'Take')]")
    private WebElement takeAQuickElement;
    @FindBy(css = "img[title='Download the app from the iOS app store']")
    private WebElement appStoreElement;
    @FindBy(css = "img[alt='Get it on Google Play']")
    private WebElement googlePlayElement;
    @FindBy(xpath = "//div[@id='main_container']/div/div[6]//a[contains(text(),'Get')]")
    private WebElement getStartedTopButtonElement;
    @FindBy(xpath = "//div[@id='main_container']/div/div[8]//a[contains(text(),'Get')]")
    private WebElement getStartedBottomButtonElement;
    @FindBy(xpath = "//a[contains(text(),'Calorie')]")
    private WebElement caloriesElement;
    @FindBy(id = "current-preset-diet")
    private WebElement dietTypeElement;
    @FindBy(css = "div[name='goal']")
    private List<WebElement> goalElements;
    @FindBy(xpath = "//label[contains(text(),'Metric')]")
    private WebElement unitElement;
    @FindBy(css = "div[name='gender']")
    private List<WebElement> genderElements;
    @FindBy(id = "height-secondary")
    private WebElement heightFieldElement;
    @FindBy(id = "weight")
    private WebElement weightFieldElement;
    @FindBy(id = "age")
    private WebElement ageFieldElement;
    @FindBy(xpath = "//label[contains(text(),'Medium')]")
    private WebElement bodyfatElement;
    @FindBy(xpath = "//select[@class='form-control']")
    private WebElement activityDropboxElement;
    @FindBy(css = "div[name='use_weight_goal']")
    private List<WebElement> weightGoalElements;
    @FindBy(id = "calculate_button")
    private WebElement calculateButtonElement;
    @FindBy(xpath = "//button[@class='btn btn-orange btn-lg use_calculated_settings']")
    private WebElement applyButtonElement;
    @FindBy(id = "activity_level_dropdown")
    private WebElement dropboxActivityElement;
    @FindBy(xpath = "//div[@class='day_title col-auto mr-auto']")
    private WebElement tableElement;
    @FindBy(xpath = "//div[contains(text(),'Weight')]")
    private WebElement weightErrorElement;






    public void clickSignUp(){
        elementMethods.clickElement(topSignUpButtonElement);
    }

    public void generateAnythingMeal(HashMap<String, String> values){
        elementMethods.clickElement(dietTableElements.get(0));
        elementMethods.fillElement(calcInputElement,values.get("calories"));
        elementMethods.clickElement(mealSelectDropboxElement);
        elementMethods.selectByTextElement(mealSelectDropboxElement, values.get("meals"));
        elementMethods.clickElement(generateButtonElement);
        elementMethods.validateElementMessage(tableElement, values.get("table"));
    }

    public void generatePaleoMeal(HashMap<String, String> values){
        elementMethods.clickElement(dietTableElements.get(1));
        elementMethods.fillElement(calcInputElement,values.get("calories"));
        elementMethods.clickElement(mealSelectDropboxElement);
        elementMethods.selectByTextElement(mealSelectDropboxElement, values.get("meals"));
        elementMethods.clickElement(generateButtonElement);
        elementMethods.validateElementMessage(tableElement, values.get("table"));
    }

    public void generateVegetarianMeal(HashMap<String, String> values){
        elementMethods.clickElement(dietTableElements.get(2));
        elementMethods.fillElement(calcInputElement,values.get("calories"));
        elementMethods.clickElement(mealSelectDropboxElement);
        elementMethods.selectByTextElement(mealSelectDropboxElement, values.get("meals"));
        elementMethods.clickElement(generateButtonElement);
        elementMethods.validateElementMessage(tableElement, values.get("table"));
    }

    public void generateVeganMeal(HashMap<String, String> values){
        elementMethods.clickElement(dietTableElements.get(3));
        elementMethods.fillElement(calcInputElement,values.get("calories"));
        elementMethods.clickElement(mealSelectDropboxElement);
        elementMethods.selectByTextElement(mealSelectDropboxElement, values.get("meals"));
        elementMethods.clickElement(generateButtonElement);
        elementMethods.validateElementMessage(tableElement, values.get("table"));
    }

    public void generateKetogenicMeal(HashMap<String, String> values){
        elementMethods.clickElement(dietTableElements.get(4));
        elementMethods.fillElement(calcInputElement,values.get("calories"));
        elementMethods.clickElement(mealSelectDropboxElement);
        elementMethods.selectByTextElement(mealSelectDropboxElement, values.get("meals"));
        elementMethods.clickElement(generateButtonElement);
        elementMethods.validateElementMessage(tableElement, values.get("table"));
    }

    public void generateMediterraneanMeal(HashMap<String, String> values){
        elementMethods.clickElement(dietTableElements.get(5));
        elementMethods.fillElement(calcInputElement,values.get("calories"));
        elementMethods.clickElement(mealSelectDropboxElement);
        elementMethods.selectByTextElement(mealSelectDropboxElement, values.get("meals"));
        elementMethods.clickElement(generateButtonElement);
        elementMethods.validateElementMessage(tableElement, values.get("table"));
    }

    public void notSureGenerateAnything(HashMap<String, String> values){
        elementMethods.clickElement(dietTableElements.get(0));
        elementMethods.clickElement(notSureButtonElement);
        elementMethods.validateElementMessage(dietTypeElement,values.get("anything"));
        elementMethods.clickElement(goalElements.get(0));
        elementMethods.clickElement(unitElement);
        elementMethods.clickElement(genderElements.get(0));
        elementMethods.fillElement(heightFieldElement, values.get("height"));
        elementMethods.fillElement(weightFieldElement, values.get("weight"));
        elementMethods.fillElement(ageFieldElement, values.get("age"));
        elementMethods.clickElement(bodyfatElement);
        elementMethods.clickElement(activityDropboxElement);
        elementMethods.selectByValueElement(activityDropboxElement, values.get("activity"));
        elementMethods.clickElement(weightGoalElements.get(0));
        elementMethods.clickElement(calculateButtonElement);
        elementMethods.clickElement(applyButtonElement);
        elementMethods.clickElement(generateButtonElement);
        elementMethods.validateElementMessage(tableElement, values.get("table"));
    }


    public void notSureGeneratePaleo(HashMap<String, String> values){
        elementMethods.clickElement(dietTableElements.get(1));
        elementMethods.clickElement(notSureButtonElement);
        elementMethods.validateElementMessage(dietTypeElement,values.get("paleo"));
        elementMethods.clickElement(goalElements.get(0));
        elementMethods.clickElement(unitElement);
        elementMethods.clickElement(genderElements.get(0));
        elementMethods.fillElement(heightFieldElement, values.get("height"));
        elementMethods.fillElement(weightFieldElement, values.get("weight"));
        elementMethods.fillElement(ageFieldElement, values.get("age"));
        elementMethods.clickElement(bodyfatElement);
        elementMethods.clickElement(activityDropboxElement);
        elementMethods.selectByValueElement(activityDropboxElement, values.get("activity"));
        elementMethods.clickElement(weightGoalElements.get(0));
        elementMethods.clickElement(calculateButtonElement);
        elementMethods.clickElement(applyButtonElement);
        elementMethods.clickElement(generateButtonElement);
        elementMethods.validateElementMessage(tableElement, values.get("table"));

    }

    public void notSureGenerateVegetarian(HashMap<String, String> values){
        elementMethods.clickElement(dietTableElements.get(2));
        elementMethods.clickElement(notSureButtonElement);
        elementMethods.validateElementMessage(dietTypeElement,values.get("vegetarian"));
        elementMethods.clickElement(goalElements.get(0));
        elementMethods.clickElement(unitElement);
        elementMethods.clickElement(genderElements.get(0));
        elementMethods.fillElement(heightFieldElement, values.get("height"));
        elementMethods.fillElement(weightFieldElement, values.get("weight"));
        elementMethods.fillElement(ageFieldElement, values.get("age"));
        elementMethods.clickElement(bodyfatElement);
        elementMethods.clickElement(activityDropboxElement);
        elementMethods.selectByValueElement(activityDropboxElement, values.get("activity"));
        elementMethods.clickElement(weightGoalElements.get(0));
        elementMethods.clickElement(calculateButtonElement);
        elementMethods.clickElement(applyButtonElement);
        elementMethods.clickElement(generateButtonElement);
        elementMethods.validateElementMessage(tableElement, values.get("table"));

    }

    public void invalidNotSureGenerate(HashMap<String, String> values){
        elementMethods.clickElement(dietTableElements.get(0));
        elementMethods.clickElement(notSureButtonElement);
        elementMethods.validateElementMessage(dietTypeElement,values.get("anything"));
        elementMethods.clickElement(goalElements.get(0));
        elementMethods.clickElement(unitElement);
        elementMethods.clickElement(genderElements.get(0));
        elementMethods.fillElement(heightFieldElement, values.get("height"));
        elementMethods.fillElement(weightFieldElement, values.get("invalidWeight"));
        elementMethods.fillElement(ageFieldElement, values.get("age"));
        elementMethods.clickElement(bodyfatElement);
        elementMethods.clickElement(activityDropboxElement);
        elementMethods.selectByValueElement(activityDropboxElement, values.get("activity"));
        elementMethods.clickElement(weightGoalElements.get(0));
        elementMethods.clickElement(calculateButtonElement);
        elementMethods.validateElementMessage(weightErrorElement, values.get("weightError"));
    }



















}
