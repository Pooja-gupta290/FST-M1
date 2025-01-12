package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Activity9 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeTest
    public void setUp() {
        
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Navigate to the LMS website
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void completeLessonTest() {
        // Step c: Find the navigation bar and click "All Courses"
        WebElement allCoursesMenu = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("All Courses")));
        allCoursesMenu.click();

        // Step d: Wait for courses to load and click the first course
        WebElement imageElement = driver.findElement(By.cssSelector("img[src='https://alchemy.hguy.co/lms/wp-content/uploads/2019/05/course-1-free-img-400x223.jpg']"));
        imageElement.click();

        // Step e: Wait for lessons to load and click a lesson
        WebElement firstLesson = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".entry-title a")));
        String lessonTitle = firstLesson.getText(); // Capture the lesson title
        firstLesson.click();

        // Step f: Verify the title of the lesson
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(lessonTitle), "The lesson title doesn't match.");

        // Step g: Check for "Mark Complete" button and click if available
        try {
            WebElement markCompleteButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".learndash_mark_complete_button")));
            if (markCompleteButton.isDisplayed()) {
                markCompleteButton.click();
                System.out.println("Mark Complete button clicked.");
            }
        } catch (Exception e) {
            System.out.println("No Mark Complete button available for this lesson.");
        }
    }

    @AfterTest
    public void tearDown() {
        // Step h: Close the browser
        driver.quit();
    }
}
