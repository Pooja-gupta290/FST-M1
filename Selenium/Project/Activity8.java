package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity8 {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
      
        // Initialize the FirefoxDriver
        driver = new FirefoxDriver();

        // Open the browser and navigate to the URL
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void contactAdminTest() {
        // Find and click on "Contact" menu item
        WebElement contactMenu = driver.findElement(By.linkText("Contact"));
        contactMenu.click();

        // Verify the page title
        String actualTitle = driver.getTitle();
        String expectedTitle = "Contact – Alchemy LMS";
        Assert.assertEquals(actualTitle, expectedTitle, "The page title does not match!");

        // Fill in the "Full Name" field
        WebElement fullNameField = driver.findElement(By.id("wpforms-8-field_0"));
        fullNameField.sendKeys("John Doe");

        // Fill in the "Email" field
        WebElement emailField = driver.findElement(By.id("wpforms-8-field_1"));
        emailField.sendKeys("johndoe@example.com");

        // Fill in the "Message" field
        WebElement messageField = driver.findElement(By.id("wpforms-8-field_2"));
        messageField.sendKeys("This is a test message.");

        // Click the "Submit" button
        WebElement submitButton = driver.findElement(By.id("wpforms-submit-8"));
        submitButton.click();

        // Print the message displayed after submission
        WebElement successMessage = driver.findElement(By.cssSelector(".wpforms-confirmation-container.wpforms-confirmation-scroll"));
        System.out.println("Confirmation message: " + successMessage.getText());


        // Verify the success message is displayed
        Assert.assertTrue(successMessage.isDisplayed(), "Success message not displayed.");
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}

