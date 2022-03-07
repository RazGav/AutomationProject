package Base;

import Utility.PropertyFile;
import org.junit.After;
import org.junit.Before;

import java.util.HashMap;

public class Hooks extends SharedData{

    public HashMap<String, String> inputData;

    @Before
    public void prepareEnvironment(){
        setUp();
        String testName = this.getClass().getSimpleName();
        PropertyFile testData = new PropertyFile("TestData/" + testName + "Resource");
        inputData = testData.getAllValues();
    }

    @After
    public void cleanEnvironment(){
        quitBrowser();
    }
}

