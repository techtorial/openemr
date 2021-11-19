package Test.OpenEmr;

import Pages.MainPage;
import Pages.Patient.PatientFinder;
import org.testng.annotations.Test;

public class MainPageTest extends TestBase {
    @Test
    public void mainTest() {
      LoginTest.loginTest();
      // This method is going to login for this method
        MainPage mainPage =new MainPage(driver);
        mainPage.clickToMenu("patient");
     actions.click(mainPage.findPatient).perform();

        PatientFinder patientFinder = new PatientFinder(driver);

        driver.switchTo().frame(patientFinder.finderIframe);
        patientFinder.searchBox.sendKeys("Phil Belford");

    }
}
