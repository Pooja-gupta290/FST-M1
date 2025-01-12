package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Activity7 {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        
        // Initialize the FirefoxDriver
        driver = new FirefoxDriver();

        // Open the browser and navigate to the URL
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void countCoursesTest() {
        // Find and click on "All Courses" menu item
        WebElement allCoursesMenu = driver.findElement(By.linkText("All Courses"));
        allCoursesMenu.click();

        // Verify the page title
        String actualTitle = driver.getTitle();
        String expectedTitle = "All Courses – Alchemy LMS";
        Assert.assertEquals(actualTitle, expectedTitle, "The page title does not match!");

        // Find all course elements on the page
        List<WebElement> courses = driver.findElements(By.className("ld_course_grid"));

        // Print the number of courses
        System.out.println("Number of courses on the page: " + courses.size());

        // Verify that there are courses displayed
        Assert.assertTrue(courses.size() > 0, "No courses found on the page!");
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}

