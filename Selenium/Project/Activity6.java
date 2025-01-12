package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity6 {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        // Initialize the FirefoxDriver
        driver = new FirefoxDriver();

        // Open the browser and navigate to the URL
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void loginTest() {
        // Find and click on "My Account" menu item
        WebElement myAccountMenu = driver.findElement(By.linkText("My Account"));
        myAccountMenu.click();

        // Verify the page title
        String actualTitle = driver.getTitle();
        String expectedTitle = "My Account – Alchemy LMS";
        Assert.assertEquals(actualTitle, expectedTitle, "The page title does not match!");

        // Click the "Login" button
        WebElement loginButton = driver.findElement(By.linkText("Login"));
        loginButton.click();

        // Enter the username
        WebElement usernameField = driver.findElement(By.id("user_login"));
        usernameField.sendKeys("root"); 

        // Enter the password
        WebElement passwordField = driver.findElement(By.id("user_pass"));
        passwordField.sendKeys("pa$$w0rd"); 

        // Click the login button
        WebElement submitButton = driver.findElement(By.id("wp-submit"));
        submitButton.click();

        // Verify that the user has logged in
        WebElement logoutButton = driver.findElement(By.linkText("Logout"));
        Assert.assertTrue(logoutButton.isDisplayed(), "Login failed! Logout button not found.");

    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}


