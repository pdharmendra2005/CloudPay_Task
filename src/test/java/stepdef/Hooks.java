package stepdef;

import Webpages.BasePages;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks extends BasePages {

    @Before
    public void openBrowser(){

        startBrowser(browserType);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void quitBrowser() {
        // Thread.sleep(500);
      //  driver.close();

    }



}
