package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity5 {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        // Initialize the FirefoxDriver
        driver = new FirefoxDriver();

        // Open the browser and navigate to the URL
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void navigateToMyAccount() {
        // Find the navigation bar and click on "My Account"
        WebElement myAccountMenu = driver.findElement(By.linkText("My Account"));
        myAccountMenu.click();

        // Get the title of the new page
        String actualTitle = driver.getTitle();

        // Expected title
        String expectedTitle = "My Account – Alchemy LMS";

        // Verify the page title
        Assert.assertEquals(actualTitle, expectedTitle, "The page title does not match 'My Account – Alchemy LMS'!");
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}

